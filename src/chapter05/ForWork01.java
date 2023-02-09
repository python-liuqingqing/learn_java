public class ForWork01 {
    public static void main(String[] args) {
        /*
         * for (循环变量的初始化；循环条件；循环变量迭代){
         * 循环操作
         * }*/
        int i = 1;
        for (; i <= 10; ) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);

//        死循环
        for(;;){
            System.out.println(1);
        }
    }
}
