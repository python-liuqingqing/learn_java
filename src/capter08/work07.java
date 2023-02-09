package capter08;

public class work07 {
    public static void main(String[] args) {
        AB ab = new AB("lqp", 23);
        System.out.println(ab); // 打印对象 默认调用 toString方法
        System.out.println(ab.hashCode());

    }
}

class AB{
    private String name;
    private int age;

    public AB(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    不重写 默认打印 包.类名@hashCode的十六进制
    @Override
    public String toString() {
        return "AB{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//  对象销毁前会执行此方法。
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}