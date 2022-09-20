import java.util.Scanner;

public class SwitchWork01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        switch (c){
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("A");
//                break;
//            default:
//                System.out.println("Other");
//        }
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        switch ((int)(i/60)){
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
            default:
                System.out.println("输入有误");
        }


    }
}
