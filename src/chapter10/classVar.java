package chapter10;

public class classVar {
    public static void main(String[] args) {
        Child aa = new Child("aa");
        aa.count++;
        System.out.println(Child.count);
        Child bb = new Child("bb");
        bb.count++;
        System.out.println(Child.count);

    }
}

class Child {
    public String name;
    // 定义变量count， 是一个类变量（静态变量）
    // 该变量的最大的特点是就是会被child 类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏。。。。");
    }
}