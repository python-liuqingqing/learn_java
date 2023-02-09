

public class StringToBasic {
    public static void main(String[] args) {
        int n1 = 1;
        byte b1 = 2;
        float f1 = 1.1f;
        double d1 = 2.2;
        String s1 = n1 + "";
        System.out.println(s1);

        String s2 = "124";
        int n2 = Integer.parseInt(s2); // 蒋字符串转换成int
        System.out.println(n2);
        double d2 = Double.parseDouble(s2);
        System.out.println(d2);
        float f2 = Float.parseFloat(s2);
        System.out.println(f2);
        char c1 = s2.charAt(0);
        System.out.println(c1);
    }
}
