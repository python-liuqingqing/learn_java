import java.sql.Array;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] list = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.println("请输入" + i + "：");
            double d = sc.nextDouble();
            list[i] = d;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
