import java.util.Scanner;

public class breakWorker {
    public static void main(String[] args) {
//        int n = 0;
//        for (int i = 0; i < 10; i++) {
//            n += i;
//            if (n > 10) {
//                System.out.println(i+"+"+n);
//                break;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        String n = "";
        String pw = "";
        int num = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入name:");
            n = sc.next();
            System.out.println("请输入pw:");
            pw = sc.next();
            if (n.equals("lqp") && pw.equals("666")){
                System.out.println("正确");
                break;
            } else {
                num--;
                System.out.println("还有"+num +"机会。");
            }

        }

    }
}
