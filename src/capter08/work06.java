package capter08;

public class work06 {
    public static void main(String[] args) {
        equ equ = new equ("lqp", 12, '1');
        equ equ1 = new equ("lqp", 102, '1');
        System.out.println(equ.equals(equ1));
    }
}

class equ {
    private String name;
    private int age;
    private char gender;

    public equ(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof equ) {
            System.out.println(anObject.toString());
            return name.equals(((equ) anObject).name) && age == ((equ) anObject).getAge() && gender == ((equ) anObject).getGender();
        }
        return false;

    }

    @Override
    public String toString() {
        return "equ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}