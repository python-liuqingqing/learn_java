package chapter06;

public class HomeWork {
    public static void main(String[] args) {
        int idx = -1;
        int a = 23;
        int[] arr = {10, 12, 24, 90};
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (a <= arr[i]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            idx = arr.length;
        }
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i != idx) {
                temp[i] = arr[j];
                j++;
            } else {
                temp[i] = a;
            }
        }
        arr = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
