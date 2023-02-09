package chapter06;

import java.util.Random;

// 随机10个数 倒序， 最大值 及下标
public class HomeWork05 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        冒泡排序
        int tmp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int n = 0, idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
                idx = i;
            }
        }
        System.out.println(n);
        System.out.println(idx);
    }
}
