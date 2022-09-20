public class work01 {
    public static void main(String[] args) {
        /*算数运算符*/
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        double d = 10 / 4;  // 先计算右边，后由int -> double
        System.out.println(d);

//        取模 % 本质公式：a % b = a-(int)a / b * b
        System.out.println(-10.5 % 3); // -10.5-(int)-10/3*3
        System.out.println(59 / 7);
        System.out.println(59 % 7);

//        i++
        int i = 1;
        i = i++;  // 本质：tmp =i, i+=1, i = tmp
        System.out.println(i);

        boolean x = true;
        boolean y = false;
        short s = 46;
        if ((s++ == 46) && (y == true)) s++;
        if ((x ==false) && (++s == 49)) s++;

        System.out.println(s);

    }
}
