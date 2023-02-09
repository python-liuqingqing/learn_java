import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
//        double sum = 0;
//        for (int i = 1; i <= 3; i++) {
//            double avg = 0;
//            Scanner sc = new Scanner(System.in);
//            int j = 1;
//            for (;j <= 2; j++) {
//                System.out.println("请输入" + i + "班第" + j + "位同学的成绩：");
//                int cj = sc.nextInt();
//                avg += cj;
//                sum += cj;
//            }
//            System.out.println("avg=" + avg/j);
//        }
//        System.out.println("sum=" + sum);

//         九九乘法
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "+" + j + "=" + i + j + " ");
//            }
//            System.out.println(" ");
//        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
//      空格=总层数-当前层数
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i==5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

