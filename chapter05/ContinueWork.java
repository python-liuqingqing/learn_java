public class ContinueWork {
    public static void main(String[] args) {
        lab1:
        for (int i = 0; i < 2; i++) {
            System.out.println("#" + i);
            lab2:
            for (int j = 0; j <= 3; j++) {
                if (j == 2) {
                    continue lab1; //直接跳到最上面
                }
                System.out.println(j);
            }

        }
    }
}
