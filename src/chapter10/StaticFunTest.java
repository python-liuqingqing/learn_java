public class StaticFunTest {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu.payFee(100);
        Stu mary = new Stu("mary");
        Stu.payFee(200);
        Stu.showFee();
    }
}

class Stu {
    private String n; // 实例变量
    private static double fee = 0; // 静态变量

    public static void payFee(double fee) {  //静态方法
        Stu.fee += fee;
    }

     public Stu(String name) { // 初始化
        this.n = name;
    }

    public static void showFee() {
        System.out.println(Stu.fee);
    }


}