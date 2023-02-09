package chapter06;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        /*
        生成如下二维数组
        *   1
        *   2   2
        *   3   3   3
        * */
//        一个有3个一维数组，但是每个一维数组还没有开数据空间
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
//           给每个一维数组开空间 new
//            如果没有给一维数组new， 那么arr[i] 就是null
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
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
