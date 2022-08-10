public class LogicOperator {
    public static void main(String[] args) {
//        逻辑与 & 和 短路与 && 的区别
//        短路与&& 当第一个条件不满足时，第二个条件不执行。
//        逻辑与& 当第一个条件不满足时，还会执行第二个条件
        int age = 50;
        int b = 2;
        if (age < 20 && ++b < 40) {
            System.out.println("1ok");
        }
        System.out.println("a=" + age + " b=" + b);

        if (age < 20 & ++b < 90) {
            System.out.println("2ok");
        }
        System.out.println("a=" + age + " b=" + b);

//        逻辑或 | 和 短路或 || 的区别
//        短路或 || 当第一个条件满足时，第二个条件不执行。
//        逻辑或 | 当第一个条件满足时，还会执行第二个条件
        int c = 50;
        if (c > 20 || ++b < 40) {
            System.out.println("3ok");
        }
        System.out.println("a=" + age + " b=" + b);

        if (c > 20 & ++b < 90) {
            System.out.println("5ok");
        }
        System.out.println("a=" + age + " b=" + b);
//        ！ 取反操作
        System.out.println(60 > 20);// true
        System.out.println(!(60 > 20));// false
//        逻辑异或^, a^b 当a和b不同时，则结果为true，否则为false。
        boolean bb = (60 > 20) ^ (60 < 20);
        System.out.println(bb);// true
    }
}
