public class Array05 {
    public static void main(String[] args) {
//        int a3[] = {1, 3};
//        System.out.println(a3.length);
//        数组反转
        int[] a1 = {1, 3, 4, 5, 6, 7, 9};
//      调换位置方式实现
        for (int i = 0; i < a1.length / 2; i++) {
            int temp = a1[i];
            a1[i] = a1[a1.length - 1 - i];
            a1[a1.length - 1 - i] = temp;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]);
        }
//      创建新的数组

    }
}
