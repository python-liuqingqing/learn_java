public class ShuiXianHua {
    public static void main(String[] args) {
//        int n = 153;
//        int b = n / 100;
//        int s = n % 100 / 10;
//        int g = n % 10;
//        if (g*g*g+s*s*s+b*b*b==n){
//            System.out.println(n + "是水仙花数");
//        }
        int k = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 5 != 0) {
                k++;
                System.out.print(n+" ");
            }
            if (k==5){
                System.out.println(" ");
                k=0;
            }
        }
    }
}
