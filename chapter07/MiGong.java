package chapter07;

// 递归 迷宫
public class MiGong {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
//       蒋上面的一行 和 下面一行设置为 1
        for (int i = 0; i < 7; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
//        蒋左边和右边都设置为1
        for (int i = 1; i < 8; i++) {
            arr[i][0] = 1;
            arr[i][6] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[2][2] = 1; // 回溯

        System.out.println("===========迷宫模型===========");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        boolean f = new FindWay().findWay(arr, 1, 1);

        System.out.println(f);
        System.out.println("===========迷宫模型===========");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class FindWay {
    /*
     * 1、确定结束点 （6， 5）
     * 2、路径走向 下 - 右 - 上 - 左
     * 3、数字标注含义：0：可以走，1：障碍物， 2：走过的路， 3：此路不通
     * 4、确实初始点（1，,1）*/
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else { //
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) { // 下
                    return true;
                } else if (findWay(map, i, j + 1)) { // 右
                    return true;
                } else if (findWay(map, i - 1, j)) { // 上
                    return true;
                } else if (findWay(map, i - 1, j)) { // 左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else { // 可能==1：障碍物，2：走过，不再走了，3：不通
                return false;
            }
        }
    }
}