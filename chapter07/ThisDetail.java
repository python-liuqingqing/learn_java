package chapter07;

public class ThisDetail {
    public static void main(String[] args) {
        T2 t = new T2("lqp", 23);
        T2 t1 = new T2("lqp", 23);
        System.out.println(t.compare(t1));
    }
}

class T2 {
    String name;
    int age;

    public T2() {
        this("lqp", 23); // 调用下面构造器，必须位于构造器第一行。
        System.out.println("T2");
    }

    public T2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("name=" + name + ", age=" + age);
    }

    public boolean compare(T2 p) {
        return p.name.equals(this.name) && p.age == this.age;
    }

    public void a() {
        this.b();
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }
}