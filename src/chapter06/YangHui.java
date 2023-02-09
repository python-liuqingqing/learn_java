package chapter06;

/*
int[] a[] = new int[10][1];
int[][] a = new int[1][1];
int a[][] = new int[1][1];
二维数组命名方式
* */

public class YangHui {
    public static void main(String[] args) {


        /*
         * 杨辉三角
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         *
         * 1、第n行有n个元素
         * 2、每一行的第一个元素和最后一个元素都是1
         * 3、从第三行开始，对于非第一个元素和最后一个元素的值，arr[i][j] = arr[i-1][j] + arr[i-1][j-1]*/
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(j + '\t');
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
