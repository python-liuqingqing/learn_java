package chapter07;

/*
 * 递归斐波那契
 * https://blog.csdn.net/weixin_50584850/article/details/123825034
 * */
public class FBNQ {
    public static void main(String[] args) {
        int n = 6;
        F f = new F();
        int m = f.fbnq(n);
        System.out.println(m);
    }
}

class F {
    public int fbnq(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            System.out.println("执行次数");
            return 1;
        } else {
            return fbnq(n - 1) + fbnq(n - 2);
        }
    }
}