public class Array02 {
    public static void main(String[] args) {
        char[] c = new char[26];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) ('A' + i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
