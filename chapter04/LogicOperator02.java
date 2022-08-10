public class LogicOperator02 {
    public static void main(String[] args) {
//        int x = 5, y = 5;
//        if (x++ == 6 && ++y == 6) {
//            x = 11;
//        }
//        System.out.println("x=" + x + " y=" + y);
//
//        if (x++ == 5 | ++y == 5) {
//            x = 11;
//        }
//        System.out.println("x=" + x + " y=" + y);

//        if (x++ == 5 || ++y == 5) {
//            x = 11;
//        }
//        System.out.println("x=" + x + " y=" + y);
        boolean x = true, y = false;
        short z = 46;
        System.out.println(z++);
        System.out.println(y = false);
        if ((z++ == 46) && (y = true)) z++;
        if ((x = false) || (++z == 49)) z++;
        System.out.println("z=" + z);
    }
}
