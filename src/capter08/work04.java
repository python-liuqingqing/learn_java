package capter08;

public class work04 {
    public static void main(String[] args) {
        PersonA[] per = new PersonA[4]; // 向上转型
        per[0] = new PersonA("a", 1);
        per[1] = new StudentA("b", 2, 100);
        per[2] = new StudentA("c", 3, 100);
        per[3] = new Teacher("d", 3, 1000);
        for (PersonA obj : per) {
            System.out.println(obj.say());
            if (obj instanceof StudentA) {
                System.out.println(((StudentA) obj).student()); // 向下转型
            } else if (obj instanceof Teacher) {
                System.out.println(((Teacher) obj).teach());
            }
        }

    }
}

class PersonA {
    private String name;
    private int age;

    public String say() {
        return "name=" + getName() + " age=" + getAge();
    }

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }
}

class StudentA extends PersonA {
    private double score;

    public StudentA(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public String student() {
        return super.getName() + "正在学习java。。。。";
    }

    @Override
    public String say() {
        return "name= " + getName() + " age=" + getAge() + " score=" + score;
    }


}


class Teacher extends PersonA {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return "老师 " + super.say() + " salary=" + getSalary();
    }

    public String teach() {
        return getName() + " 正在教java。。。";
    }
}