// 数组倒序

public class ReservArray {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 5, 6};
        int[] a2 = new int[a1.length];
        for (int i = 0, j = a1.length-1; i < a1.length; i++, j--) {
//            System.out.print(i);
            a2[i] = a1[j];
        }
        a1 = a2;
        for (int i=0; i < a1.length; i++){
            System.out.println(a1[i]);
        }
    }
}
