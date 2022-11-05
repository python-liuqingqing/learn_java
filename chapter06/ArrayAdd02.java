import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 4};
        do {
            System.out.print("请输入元素：");
            int ii = sc.nextInt();
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = ii;
            arr = newArr;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.print("是否继续输入：");
            char c = sc.next().charAt(0);
            if (c == 'n') {
                break;
            }
        } while (true);
    }
}
