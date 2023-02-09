package capter08;

public class work03 {
    public static void main(String[] args) {
//        向上转型
        Animal animal = new Cat();
//        属性没有重写之说！属性的值看编译类型。
        System.out.println(animal.age);
//        animal.colour  向上转型 不能调用子类的方法
//        向下转型 可以调用子类的方法
        Cat cat = (Cat) animal;
        cat.eat();
        System.out.println(cat.a);
//        instanceOf 用于判断对象的运行类型是否是xx类型或者xx类型的子类型。
        System.out.println(animal instanceof Animal);


    }
}


class Animal {
    int age = 10;

    public void eat() {
        System.out.println("base eat....");
    }

    public void say() {
        System.out.println("base say....");
    }
}


class Cat extends Animal {
    int a =  super.age;

    @Override
    public void eat() {
        System.out.println("cat eat....");
    }

    @Override
    public void say() {
        System.out.println("cat say....");
    }

    public void colour() {
        System.out.println("cat colour...");
    }
}