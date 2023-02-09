package capter08.HomeWorker;

public class HomeWorker04 {
    public static void main(String[] args) {
        Manger manger = new Manger("a", 10, 30, 1.2);
        manger.setBonus(1000);
        manger.Print();
    }
}

class Employee {
    private String name;
    private double daySal;
    private int workDay;
    private double grade;

    public Employee(String name, double daySal, int workDay, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDay = workDay;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getDaySal() {
        return daySal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public double getGrade() {
        return grade;
    }

    public void Print() {
        System.out.println(name + " 工资=" + daySal * workDay * grade);
    }
}

class Manger extends  Employee{
    private double bonus;
    public Manger(String name, double daySal, int workDay, double grade) {
        super(name, daySal, workDay, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void Print() {
        System.out.println("经理 "+ getName() + " 工资="+ (bonus + getDaySal() * getWorkDay() * getGrade()));
    }
}