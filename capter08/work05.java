package capter08;

public class work05 {
    public static void main(String[] args) {
        Worker worker = new Worker("dd", 1000);
        Manger manger = new Manger("aa", 1000, 20000);
        work05 work05 = new work05();
        work05.show(worker);
        work05.show(manger);
        work05.test(worker);
        work05.test(manger);
    }

    public void show(Salary s) {
        System.out.println(s.AnnualSalary()); // 动态绑定
    }
    public void test(Salary s){
        if (s instanceof Worker) {
            ((Worker) s).worker(); // 向下转型
        } else if (s instanceof Manger) {
            ((Manger) s).manger();
        }
    }
}

class Salary {
    private String name;
    private double salary;

    public Salary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double AnnualSalary() {
        return salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


class Worker extends Salary {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void worker() {
        System.out.println(getName() + " 正在工作。。。");
    }
}

class Manger extends Salary {
    private double bonus;

    public Manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double AnnualSalary() {
        return super.AnnualSalary() + bonus;
    }

    public void manger() {
        System.out.println(getName() + "正在管理。。。");
    }

}