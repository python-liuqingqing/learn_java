package chapter06;

import java.util.Random;

// 数组递减
public class HomeWork06 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        do {
            if (arr.length == 1) {
                System.out.println("不能再缩减");
                break;
            }
            int[] temp = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                temp[i] = arr[i];
            }
            arr = temp;

        } while (arr.length > 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n" + arr[i]);
        }


    }
}
