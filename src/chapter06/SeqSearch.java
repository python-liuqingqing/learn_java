package chapter06;

import java.util.Scanner;

//顺序查询
public class SeqSearch {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (st.equals(arr[i])) {
                System.out.println("已找到。");
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("没找到。");
        }
    }
}
