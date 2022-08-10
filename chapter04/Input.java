import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String name = sc.next();
        System.out.println("name："+name);
        int age = sc.nextInt();
        System.out.println("age："+age);
    }
}
