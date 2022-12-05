package capter08;

// super 调用父类的方法

public class super_ {
    public static void main(String[] args) {
        B b = new B();
        b.ok();

    }
}

class B extends A1 {
    public B() {
        super(1); //只能放在第一行，出现一次。
    }

    public void ok() {
        System.out.println(super.n1 + " " + super.n3 + " " + super.n4);
        super.f1();
        super.f3();
        f4(); // 如果不写super， 先找本类的，本类没有一直往上找。
        this.f4(); // 和直接写f4() 效果一样。
    }
    public void f1(){
        // 方法重写 方法名，参数，返回值一样或者是继成关系 才是重写。
//        子类不能缩小父类的访问权限。
        System.out.println("f1");
    }

}


class A1 {
    public int n1 = 1;
    private int n2 = 2;
    protected int n3 = 3;
    int n4 = 4;

    public A1() {

    }

    public A1(int n1) {
        this.n1 = n1;
    }

    public void f1() {
        System.out.println("f1");
    }

    private void f2() {
        System.out.println("f2");
    }

    protected void f3() {
        System.out.println("f3");
    }

    void f4() {
        System.out.println("f4");
    }

}