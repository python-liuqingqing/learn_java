import java.util.Scanner;

public class IfWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 100) {
            System.out.println("好");
        } else if (i > 80 && i <= 99) {
            System.out.println("一般");
        } else if (i>=60 && i<=80){
            System.out.println("差");
        } else {
            System.out.println("不好");
        }
    }
}
