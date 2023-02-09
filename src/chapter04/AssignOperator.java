public class AssignOperator {
    public static void main(String[] args) {
        int n = 10;
        n += 1;
        System.out.println(n);
//        复合赋值运算会进行类型转换
        byte b = 3;
        b += 2; // 本质:b = (byte)(b+2);
        b++; // 本质:b = (byte)(b+1);
//        三元运算符
//        条件表达式？表达式1：表达式2
//        1、如果条件表达式为true，结果为表达式1.
//        2、如果条件表达式为false，结果为表达式2
        int a = 10;
        int c = 99;
        int result = a > c ? ++a : --c;
        System.out.println(result);

    }
}
