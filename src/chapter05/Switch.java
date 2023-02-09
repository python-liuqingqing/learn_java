import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        * 1、表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型。
        * 2、switch（表达式）中返回值必须是（byte，short，int，char，enum[枚举]，String）
        * 3、case字句中的值必须是常量，而不是变量。
        * 4、default 可有可无。
        * 5、break使程序跳出switch语句，如果没有写break，程序会顺序执行到switch结尾，除非遇到break。
        * */
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println("c");
                break;
            default:
                System.out.println("default");
        }
        System.out.println(c);
    }
}
