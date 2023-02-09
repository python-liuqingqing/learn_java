package chapter07;

// 可变参数
// 1、可变参数可以是0或者多个
// 2、可变参数实参可以是数组
// 3、可变参数的本质就是数组
// 4、形参中有可变参数和不可变参数时，要把可变参数放到最后。
// 5、一个形参列表中只可以出现一个可变参数
public class VarParameter {
    public static void main(String[] args) {
        T1 t = new T1();
        t.sum(1, 2, 3);
    }
}

class T1 {
    String name = "lqp";  // 属性有默认值。
    public int sum(int... sums) {
        int n = 0; // 局部变量没有默认值，必须赋值。
        for (int i = 0; i < sums.length; i++) {
            n += sums[i];
        }
        System.out.println("参数长度=" + sums.length);
        return n;
    }
}