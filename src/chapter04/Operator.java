public class Operator {
    public static void main(String[] args) {
        System.out.println(10 / 4); // 两个整数相除返回整数，所以返回2，不是2.5
        System.out.println(10.0 / 4);

        double d = 10 / 4; // 10 / 4=2  2=>2.0
        System.out.println(d); // 2.0
//        取余 求模
//        本质公式：a % b = a - a / b * b
        System.out.println(10 % -3);
        System.out.println(-10 % 3);
        int j = 8;
        int k = j++; // k==j; j = j++
        System.out.println("k=" + k + " j=" + j);// k=8 j=9

        int i = 1;
        i = i++;  // 本质：1、tmp =i; 2、i=i+1; 3、i=tmp
        System.out.println(i);

        int i1 = 1;
        i1 = ++i1;  // 本质：1、i=i+1; 2、tmp =i; 3、i=tmp
        System.out.println(i1);
    }
}
