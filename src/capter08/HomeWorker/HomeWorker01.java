package capter08.HomeWorker;

public class HomeWorker01 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("p1", 12, "a");
        p[1] = new Person("p2", 11, "b");
        p[2] = new Person("p3", 15, "c");
        for (Person i : p) {
            System.out.println(i);
        }
        System.out.println("==================排序后================");
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        for (Person i : p) {
            System.out.println(i);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
