package rxz.选择排序;

/**
 * TODO:选择排序算法实现
 * 时间复杂度:O(n^2)
 * 空间复杂度:O(1)
 * 不稳定
 * 没用的一个算法
 */
public class Xzpx {
    public static int[] solve(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
//            System.out.println("minPos: " + minPos);
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
//            array[i] = array[i] ^ array[minPos];//试了下使用异或运算实现互换,发现有坑,相同地址时会把两个数都变成0,已放弃
//            array[minPos] = array[i] ^ array[minPos];
//            array[i] = array[i] ^ array[minPos];
        }
        return array;
    }
}
