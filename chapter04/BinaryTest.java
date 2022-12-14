public class BinaryTest {
    public static void main(String[] args) {
//        二进制以0b或者0B开头
        int n1 = 0b1010;
//        十进制
        int n2 = 1010;
//        八进制 以数字0开头
        int n3 = 01010;
//        十六进制，以0x或0X开头。A-F不区分大小写
        int n4 = 0x10101;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
//        二，八，十六 转 十进制
//        二进制转十进制，从最低位（右边）开始，将每个位上的数提取出来，乘以2的（位数-1）次方，然后求和。
//        八进制转十进制，从最低位（右边）开始，将每个位上的数提取出来，乘以8 的（位数-1）次方，然后求和。
//        十六进制转十进制，从最低位（右边）开始，将每个位上的数提取出来，乘以16  的（位数-1）次方，然后求和。

//        十进制 转 二，八，十六
//        十进制转二进制，将该数不断除以2，直到商为0（不能整除）为止，然后将每一步的到的余数倒过来（从下到上），就是对应的二进制。
//        十进制转八进制，将该数不断除以8，直到商为0（不能整除）为止，然后将每一步的到的余数倒过来（从下到上），就是对应的八进制。
//        十进制转十六进制，将该数不断除以16，直到商为0（不能整除）为止，然后将每一步的到的余数倒过来（从下到上），就是对应的十六进制。

//        二进制转八进制,十六进制
//        二进制转八进制，从低位开始，将二进制数每三位(111=7)一组，转成对应的八进制数即可。 0b11(3) 010(2) 101(5) = 0325
//        二进制转十六进制，从低位开始，将二进制数每四位(1111=F)一组，转成对应的十六进制数即可。 0b1101 0101 = 0xD5
//        八进制, 十六进制 转二进制
//        八进制转二进制，将八进制数每一位，转成对应的一个3位的二进制数即可。0237= 2(010) 3(011) 7(111) = 0b10011111
//        十六进制转二进制，将十六进制数每一位，转成对应的一个4位的二进制数即可。0x23B =2(0010) 3(0011) B(1011) = ob001000111011

//        十进制转八进制
        int n5 = 678;
        String octal = Integer.toOctalString(n5);
        System.out.println("octal=" + octal);
        int n6 = 34;
        String bin = Integer.toBinaryString(n6);
        System.out.println("bin=" + bin);

    }
}
