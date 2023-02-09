public class BitOperation {
    public static void main(String[] args) {
        /*
        * 原码 反码 补码
        * 1、二进制的最高位是符号位:0表示正数，1表示负数。
        * 2、正数的原码，反码 补码都一样（三码合一）
        * 3、负数的反码=它原码的符号位不变，其他位取反（0->1, 1->0）
        * 4、负数的补码=它的反码+1，负数的反码=负数的补码-1
        * 5、0的反码，补码都是0
        * 6、java没有无符号数，换言之，Java中的数都是有符号的
        * 7、在计算机运算的时候，都是以(补码)的方式来运算的
        * 8、当我们看运算结果的时候，要看它的原码（重点）
        *
        * 按位与& ：两位全为1，结果为1， 否则为0.
        * 按位或|：两位有一个为1，结果为1，否则为0
        * 按位异或^：两个中一个为1，一个为0，结果为1，否则为0
        * 按位取反~：0~1， 1~0
        */
        System.out.println(~-2);
        /*
        * 1、先得到-2的原码 10000000 00000000 00000000 00000010
        * 2、-2的反码（符号位不变其他取反）11111111 11111111 11111111 11111101
        * 3、-2的补码                  11111111 11111111 11111111 11111110
        * 4、~-2  00000000 00000000 00000000 00000001 运算后的补码
        * 5、运算后的原码 就是 00000000 00000000 00000000 00000001=1
        */
        System.out.println(~2);
        /*
        * 1、2的补码 00000000 00000000 00000000 000000010
        * 2、~2 取反 11111111 11111111 11111111 11111101
        * 3、运算后的反码 11111111 11111111 11111111 11111100
        * 4、运算后的原码 10000000 00000000 00000000 000000011 = -3
        */
        System.out.println(2|3);
        /*
        * 1、2的补码 00000000 00000000 00000000 000000010
        * 2、3的补码 00000000 00000000 00000000 000000011
        * 3、2|3 运算00000000 00000000 00000000 000000011
        * 4、2|3 原码 00000000 00000000 00000000 000000011 = 3
        */
        System.out.println(2^3);
        /*
         * 1、2的补码 00000000 00000000 00000000 000000010
         * 2、3的补码 00000000 00000000 00000000 000000011
         * 3、2^3 运算00000000 00000000 00000000 000000001（补码）
         * 4、2^3 原码 00000000 00000000 00000000 000000001 = 1
         */
        /*
        * 1、算数右移>>: 低位溢出，符号位不变，并用符号位补溢出的高位(本质：3>>2 (3/2/2)取整=0)
        * 2、算数左移<<: 符号位不变，低位补0 （本质：3<<2 3*2*2=12）
        * 3、>>> 逻辑右移也叫无符号右移，运算规则是：低位溢出，高位补0
        * 4、特别说明：没有 <<< 符号*/
        System.out.println(3>>2);
        System.out.println(3<<2);
    }
}