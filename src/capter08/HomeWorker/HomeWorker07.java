package capter08.HomeWorker;

public class HomeWorker07 {
    public static void main(String[] args) {
        Student student = new Student("lqp", '男', 13, 1);
        System.out.println(student.play());
        teachA tea = new teachA("lq1", '男', 12, 1);
        teachA tea1 = new teachA("lq2", '男', 14, 1);
        System.out.println(tea.play());

        personA[] p = new personA[3];
        p[0] = student;
        p[1] = tea;
        p[2] = tea1;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() > p[j + 1].getAge()) {
                    personA temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        for (personA i :
                p) {
            System.out.println(i);
        }
        new HomeWorker07().print(student);
        new HomeWorker07().print(tea);

    }

    public void print(personA obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.study();
        } else if (obj instanceof teachA) {
            teachA t = (teachA) obj;
            t.tea();

        }
    }
}

class personA {
    private String name;
    private char sex;
    private int age;

    public personA(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String play() {
        return getName() + "爱玩";
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personA{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

class Student extends personA {

    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺 我会好好学习。");
    }

    public String play() {
        return super.play() + "足球";
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}

class teachA extends personA {

    private int work_age;

    public teachA(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void tea() {
        System.out.println("我承诺我会认真教学的。");
    }

    public String play() {
        return super.play() + "象棋";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }


}

