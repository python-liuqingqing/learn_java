public class Topic01 {
    public static void main(String[] args) {
        int n = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            n = i + n;
            sum += n;
            System.out.println(sum);
        }
    }
}
