package capter08;

public class Encap {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("lqp");
        person.setAge(12);
        person.setSalary(1200);
    }

}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("请输入正确的年龄 ");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}