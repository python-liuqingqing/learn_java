package chapter07;

public class OverLoad01 {
    public static void main(String[] args) {
        Mat m = new Mat();
        m.m(23);
        int s = m.m(23, 3);
        System.out.println(s);
        m.m("dfd");
    }
}

class Mat {
    public void m(int n) {
        System.out.println("平方=" + (n * n));
    }

    public int m(int n, int n2) {
        return n > n2 ? n : n2; // 三元推导式
    }

    public double m(double n, double n2, double n3) {
        double max1 = n > n2 ? n : n2;
        return max1 > n3 ? max1 : n3;
    }

    public void m(String n) {
        System.out.println("str=" + n);
    }

}
