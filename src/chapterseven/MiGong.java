package chapterseven;

public class MiGong {
    public static void main(String[] args) {

        int[][] map = new int[8][7];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || i == map.length - 1 || j == 0 || j == map[i].length - 1 || (i == 3 && j == 1) || (i == 3 && j == 2)) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        T t = new T();
        t.findWay(map, 1, 1);
        System.out.println("====================");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class T {
    /*
    1、map是地图， （i，j）是当前位置
    2、确定当前位置数字含义 0：没有障碍物 1：有障碍物 2：走过了可以走通 3：走过了是死路
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            // 该位置没有走过
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {   // 该位置不能走或者已经走过
                return false;
            }
        }
    }

}
