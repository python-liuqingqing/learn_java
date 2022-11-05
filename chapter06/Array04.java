public class Array04 {
    public static void main(String[] args) {
//        基本数据类型赋值， 赋值方式为值拷贝。
//        n2 的变化，不会影响到n1的值。
        int n1 = 10;
        int n2 = n1;
        int n3 = 90;
        n2 = 90;

//      int a=3;
//      int b=3;
//      编译器先处理int a= 3；首先它会在栈中创建一个变量为a的内存空间，
//      然后查找有没有字面值为3的地址，没找到，就开辟一个存放3这个字面值的地址，
//      然后将a指向3的地址。接着处理int b= 3

        System.out.println(n1 == n2);
        System.out.println(n3 == n2);

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
//        数组在默认情况下是引用传递，赋的值是地址。
        int[] a1 = {1, 3, 4};
        int[] a2 = a1;

        a2[0] = 10;
        System.out.println("a1=" + a1);
        System.out.println("a2=" + a2);
    }
}
