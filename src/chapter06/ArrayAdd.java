import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String c = sc.next();
        int[] arr = {1, 3, 4};
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 4;
        arr = newArr;
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
