package capter08;

public class extend_ {
    public static void main(String[] args) {
        String name = "lqp";
        int age = 23;
        bigStudent bigStudent = new bigStudent(name, age);
        bigStudent.testing();
        bigStudent.say();
    }
}

class Base {
    String name;
    int age;

//    public Base() {
//        System.out.println("base.....");
//    }

    public Base(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("name=" + name + " age=" + age);
    }

    public void testing() {
        System.out.println("学生正在考试。。。。");
    }
}

class bigStudent extends Base {
    /*
    子类必须调用父类的构造器,完成父类的初始化。
    * 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无
    参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用 super
    * 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
* */
    public bigStudent() {
        super("lqp", 34);  // 必须放在子类构造器的第一行，
//        this    有了super 不能用this 因为这两个都必须在第一行。
        System.out.println("big.........");
    }

    public bigStudent(String name, int age) {
        super(name, age);
    }

    public void testing() {
        System.out.println("大学生 考试中。。。。");
    }
}

class Student extends Base {
//    public Student() {
//        System.out.println("smail.........");
//    }


    public Student(String name, int age) {
        super(name, age);
    }

    public void testing() {
        System.out.println("小学生 考试中。。。。");
    }
}