public class StaticTest {
    public static void main(String[] args) {
        A a = new A();
        a.count++;  // 对象名
        A b = new A();
        A.count++; // 类名
        System.out.println(b.count);
//        实例变量
        A c = new A();
        c.num ++;
//        A.num++;  不可以用类名访问
        System.out.println(c.num);

    }
}


class A {
    public static int count = 0; // 静态变量
    public int num = 0;  // 实例变量
}