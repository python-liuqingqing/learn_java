public class BreakWork2 {
    public static void main(String[] args) {
        double n = 100000;
        int num = 0;
        while (true) {
            if (n > 50000) {
                n *= 0.95;
            } else if (n >= 1000) {
                n -= 1000;
            } else {
                break;
            }
            System.out.println(n);
            num++;
        }
        System.out.println(num);

    }
}

