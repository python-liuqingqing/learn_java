public class Array03 {
    public static void main(String[] args) {
        int[] a = {1, 3, 56, 3, 6};
        int m = 0, idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
                idx = i;
            }
        }
        System.out.println(m);
        System.out.println(idx);
    }
}
