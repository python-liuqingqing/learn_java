package capter08.HomeWorker;

public class HomeWorker05 {
    public static void main(String[] args) {
        Worker worker = new Worker(1000, 12);
        worker.Print();
        Teacher teacher = new Teacher(100, 20, 10);
        Waiter waiter = new Waiter(100, 20, 1000);
//        Person1[] p = new Person1[2];
//        p[0] = teacher;
//        p[1] = waiter;
//        for (Person1 i : p) {
//            if (i instanceof Teacher) {
//                ((Teacher) i).PrintSal();
//            } else if (i instanceof Waiter) {
//                ((Waiter) i).PrintSal();
//            }
//        }
    }
}

class Person1 {
    private double salary;
    private int day;

    public Person1(double salary, int day) {
        this.salary = salary;
        this.day = day;
    }

    public void Print() {
        System.out.println("工资=" + (salary * day));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int day) {
        this.day = day;
    }
}

class Worker extends Person1{
    public Worker(double salary, int day) {
        super(salary, day);
    }
}

class Teacher extends Person1 {
    private double classSal;

    public Teacher(double salary, int day, double classSal) {
        super(salary, day);
        this.classSal = classSal;
    }

    public void PrintSal() {
        System.out.println("Teacher " + (this.getSalary() * this.getDay() + classSal * this.getDay()));
    }
}

class Waiter extends Person1 {
    private double bonus;

    public Waiter(double salary, int day, double bonus) {
        super(salary, day);
        this.bonus = bonus;
    }

    public void PrintSal() {
        System.out.println("Waiter " + (this.getSalary() * this.getDay() + bonus));
    }

}