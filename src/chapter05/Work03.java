public class Work03 {
    public static void main(String[] args) {
        l:
        for (int j = 1; j < 10; j++) {
            l2:
            for (int i = 1; i < 10; i++) {
                System.out.println((int) (Math.random() * 100) + 1);
                if (i == 3) {
                    break l;
                }
            }
        }
    }
}
