public class ZhuanHuan {
    public static void main(String[] args) {
        int n1 = 'a';
        float d1 = n1 + 1.1f;
        System.out.println(d1);

        byte b1 = 10; // -128--127
        int n2 = 1; // int
//        byte b1 = n2;  int 不可转 byte
//        char c1 = b1;  (byte, short) 和 char 不可以互相转
        byte b2 = 1;
        short s1 = 2;
//        short s2 = b2 + s1;  (b2 + s1) 会把精度提升到操作数中最大的那个类型 int
//        char[2] -> int[4] -> long[8]-> float[4] -> double[8]
//        byte[1]-> short[2] -> int[4] -> long[8] -> double[8]
//        char , byte, short 三者进行计算时先转换成int类型。

//        强转类型
//        强转符号只针对最近的操作数有效
        int i1 = (int)1.9;
        System.out.println(i1);

        String s  = "12.3";
        Double d = Double.parseDouble(s);
        System.out.println(d);



    }
}
