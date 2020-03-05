package rxz.插入排序;

import java.util.ArrayList;

/**
 * TODO:插入排序算法实现
 * 时间复杂度:O(n^2)
 * 空间复杂度:O(1)
 * 选泡插三种简单排序中最常用的一种(优化后的)
 */
public class Crpx {
    /**
     * 优化前的插入排序,和冒泡排序很像,优化后的插入排序见solve()
     *
     * @param array 待排序数组
     * @return 排序后的数组
     */
    public static int[] solve1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 优化后的插入排序,类似于ArrayList中删除集合中间某个元素的思想
     *
     * @param array 待排序的数组
     * @return 排序后的数组
     */
    public static int[] solve(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j-1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }
}
