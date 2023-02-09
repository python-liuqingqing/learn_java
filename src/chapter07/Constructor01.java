package chapter07;

// 构造器， 初始化对象，
// 1、没有返回值
// 2、构造器的名称和类名相同。
// 3、定义规则和普通方法一样
public class Constructor01 {
    public static void main(String[] args) {
        Person01 p = new Person01("lqp", 23);
//        System.out.println("name="+p.name);
//        System.out.println("age="+p.age);
    }
}

class Person01 {
    String name;
    int age=1;
//    System.out.println("age=");
    public Person01(String name1, int age1) {
        System.out.println("构造器被调用");
        name = name1;
        age = 2;
    }

}
