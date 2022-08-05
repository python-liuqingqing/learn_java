public class FloatData {
    public static void main(String[] args) {
//		java 浮点型常量默认为double类型，声明float类型，需要后加"f" or "F"
//		float m1 = 1.1 是错误的
//       5.12e2 == 5.12*10的2次方
//       5.12E-2 == 5.12 / 10的2次方

        float n1 = 2.7F;
        double n2 = 1.1;
        double n3 = 1.1F;
        double n4 = .232; // 等价于 0.232
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        double d1 = 2.7; //2.7
        double d2 = 8.1 / 3; //2.6999999999999997
        System.out.println(d1);
        System.out.println(d2);
//    根据结果看，当我们对运算结果是小数的进行相等判读时，要小心。
        if (Math.abs(d1 - d2) < 0.00001) {
            System.out.println("相等"); // 错的
        }
        System.out.println(Math.abs(d1 - d2));

//        if (n1==d1) {
//            System.out.println("相等"); // 错的
//        }

    }
}