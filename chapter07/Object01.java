package chapter07;

public class Object01 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.isPass);
        System.out.println(p.sal);
        Person p1 = new Person();
        p1.speak();
        int n = p1.getSum(1,2);
        System.out.println(n);

    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;

    public void speak() {
        System.out.println("speak....");
    }

    public int getSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

}

