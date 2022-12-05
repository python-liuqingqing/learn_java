package chapter07;


import java.util.Arrays;

public class work01 {
    public static void main(String[] args) {
        double[] d = {1, 343, 434};
        A01 a1 = new A01();
        System.out.println(a1.max(d));
        System.out.println("==========");
        String[] s = {"sd", "ds", "dw"};
        A02 a2 = new A02();
        System.out.println(a2.find(s, "ds"));
        System.out.println("==========");
        A03 a3 = new A03();
        a3.updatePrice(120);
        System.out.println("==========");
        A04 a4 = new A04();
        int[] ar = {1, 3, 4, 5};
        int[] n_ar = a4.copyArr(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(n_ar[i]);
        }
        System.out.println("==========");
        double r = 4;
        A05 a5 = new A05(r);
        System.out.println(a5.C());
        System.out.println(a5.S());
        System.out.println("==========6");
        String name = "d";
        int age = 3;
        String colour = "h";
        A06 a6 = new A06(name, age, colour);
        a6.show();
        System.out.println("==========7");
        String name1 = "dp";
        double times = 3;
        A07 a7 = new A07(name1, times);
        a7.play();
        A07 a = a7.getInfo();
        System.out.println("name=" + a.name);
        System.out.println("times=" + a.times);
        System.out.println("=========9");
        int t = 6;
        A09 a9 = new A09();
        A10 a10 = new A10();
        a10.print(a9, t);
        System.out.println("===========11");
        A11 a11 = new A11();
        System.out.println(a11.toString());
    }
}

class A11{
    int[] a = {1,3,4};

    @Override
    public String toString() {
        return "A11{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}

class A09 {
    double r;

    public double findArea() {
        return Math.PI * r * r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

class A10 {
    public void print(A09 a, int times) {
        for (int i = 1; i < times; i++) {
            a.setR(i);
            System.out.println((double) i + "\t" + a.findArea());
        }

    }
}

class A08 {
    String n1;
    String n2;
    String n3;
    String n4;
    String n5;

    public A08(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public A08(String n5, String n4, String n3) {
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public A08(String n1, String n2, String n5, String n4, String n3) {
        this(n5, n4, n3); // 构造器复用，复用构造器只能写在首行。
        this.n1 = n1;
        this.n2 = n2;
    }
}

class A07 {
    String name;
    double times;

    public A07(String name, double times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("name=" + name + " times=" + times);
    }

    public A07 getInfo() {
        return this;
    }
}

class A06 {
    String name;
    int age;
    String colour;

    public A06(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public void show() {
        System.out.println("name=" + name + " age=" + age + " colour=" + colour);
    }
}

class A05 {
    double r;

    public A05(double r) {
        this.r = r;
    }

    public double S() {
        return this.r * this.r * Math.PI;
    }

    public double C() {
        return 2 * this.r * Math.PI;
    }
}


class A01 {
    public double max(double[] a) {
        double n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                n = a[i];
            }
        }
        return n;
    }
}

class A02 {
    public int find(String[] s, String a) {
        int n = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(a)) {
                n = i;
            }
        }
        return n;
    }
}

class A03 {
    double book = 232;

    public void updatePrice(double a) {
        if (a > 150) {
            this.book = 150;
        } else if (a > 100) {
            this.book = 100;
        }
        System.out.println(book);
    }
}


class A04 {
    int[] arr;

    public int[] copyArr(int[] a) {
        this.arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            this.arr[i] = a[i];
        }
        return this.arr;
    }
}