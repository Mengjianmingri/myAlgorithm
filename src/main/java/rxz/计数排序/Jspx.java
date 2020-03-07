package rxz.计数排序;

public class Jspx {
    /**
     * int数组计数排序(简单实现,未实现稳定性)
     *
     * @param array 待排数组
     * @param left  待排数组值范围的最小值
     * @param right 待排数组取值范围的最大值
     * @return 排序后数组
     */
    public static int[] solve1(int[] array, int left, int right) {
        int k = right - left + 1;
        if (k < 0) throw new RuntimeException("参数错误!");
        int[] newArr = new int[k];
        for (int value : array) {
            if (value - left > newArr.length - 1) throw new RuntimeException("数值取值区间错误!");
            newArr[value - left]++;
        }
        int justP = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i]; j++) {
                array[justP++] = i + left;
            }
        }
        return array;
    }

    /**
     * int数组计数排序(优化实现,已解决不稳定性问题)
     *
     * @param array 待排数组
     * @param left  待排数组值范围的最小值
     * @param right 待排数组取值范围的最大值
     * @return 排序后数组
     */
    public static int[] solve(int[] array, int left, int right) {
        int k = right - left + 1;
        if (k < 0) throw new RuntimeException("参数错误!");
        int[] newArr = new int[k];
        for (int value : array) {
            if (value - left > newArr.length - 1) throw new RuntimeException("数值取值区间错误!");
            newArr[value - left]++;
        }
        int[] lastArr = new int[array.length];//存储排序后的数组
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] += newArr[i-1];
        }
        //此时newArr从计数数组变成了累加数组
        for (int i = array.length - 1; i >= 0; i--) {
            lastArr[--(newArr[array[i]-left])] = array[i];//这行代码不用debug能乱死,debug调出的条件
        }
        return lastArr;
    }
}
