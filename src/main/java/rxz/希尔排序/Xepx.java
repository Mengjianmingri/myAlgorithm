package rxz.希尔排序;

/**
 * TODO:希尔排序算法实现
 * 时间复杂度:平均:O(n^1.3)
 * 不稳定
 */
public class Xepx {
    public static int[] solve(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                if (array[j] < array[j - gap]) {
                    while (j - gap >= 0 && temp < array[j - gap]) {
                        array[j] = array[j - gap];
                        j -= gap;
                    }
                }
                array[j] = temp;
            }
        }
        return array;
    }
}
