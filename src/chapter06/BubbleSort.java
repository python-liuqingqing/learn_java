package chapter06;

/*  冒泡排序
* 1、一共有6个元素
* 2、一共进行了5轮排序
* 3、每一轮可以确定一个位置，比如第一轮可以确定最大数，第二轮排序，确定第2大的位置，依次类推。。。
* 4、当前面的数据数大于后面的，就交换位置
* 5、比较过的不用再次比较，每轮依次减少 5-4-3-2-1*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 2, 5, 32};
        int temp = 0;
//        一共需要排 arr.length-1 次。
        for (int n = 0; n < arr.length-1; n++) {
//            最后一个数不用排序，并且之前比较过不用再比较。arr.length - 1 - n
            for (int i = 0; i < arr.length - 1 - n; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println("\n第" + (n + 1) + "轮比较:");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
