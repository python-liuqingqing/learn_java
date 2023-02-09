package capter08;

public class work02 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("lqp", 12, 1, 23);
        System.out.println(student1.say());
    }
}

class Student1 extends Person1 {
    private int id;
    private double scour;

    public Student1(String name, int age, int id, double scour) {
        super(name, age);
        this.id = id;
        this.scour = scour;
    }

    public String say() {
        return "id=" + this.id + "scour=" + scour + " " + super.say();
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "name=" + this.name + ", age=" + this.age;
    }

}