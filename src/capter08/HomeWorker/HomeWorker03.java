package capter08.HomeWorker;

public class HomeWorker03 {
    public static void main(String[] args) {
        Professor professor = new Professor("p1", 12, "1.3", 1000);
        System.out.println(professor.introduce());
    }
}

class Teach {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teach(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public String introduce() {
        return "Teach{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Professor extends Teach {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "Professor{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }
}

class FProfessor extends Teach {
    public FProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "FProfessor{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", post='" + this.getPost() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }
}