package rxz.冒泡排序;

/**
 * TODO:冒泡排序算法实现
 * 时间复杂度:O(n^2)
 * 最好时间复杂度:O(n)
 * 空间复杂度:O(1)
 * 不稳定
 * 没用的一个算法
 */
public class Mppx {
    public static int[] solve(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean flag = true;//冒泡排序最好时间复杂度优化,监听机制
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return array;
    }
}
