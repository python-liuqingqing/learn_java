package capter08.HomeWorker;

public class HomeWorker06 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("a", 12, 1222);
        Doctor doctor2 = new Doctor("a", 13, 1222);
        System.out.println(doctor2.equals(doctor1));
    }
}

class Doctor {
    private String name;
    private int age;
    private double sal;

    public Doctor(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(this instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.getName()) &&  this.age == doctor.getAge() && this.sal==doctor.sal;
    }
}
