package chapter07;

// 方法重载
public class OverLoad {
    public static void main(String[] args) {
        OV ov = new OV();
        System.out.println(ov._sum(1, 3));
        System.out.println(ov._sum(1.1, 3));
        System.out.println(ov._sum(1.1, 3, 3));
    }
}

class OV {
    public int _sum(int a, int b) {
        return a + b;
    }

    public double _sum(double a, int b) {
        return a + b;
    }

    public double _sum(int a, double b) {
        return a + b;
    }

    public double _sum(double a, int b, int c) {
        return a + b + c;
    }
}