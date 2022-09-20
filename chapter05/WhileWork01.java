public class WhileWork01 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        int n = 20;
        while (n <= 200) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

//        do while
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        int j = 1;
        do {
            if (j % 5 == 0 && j % 3 != 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 100);
    }
}
