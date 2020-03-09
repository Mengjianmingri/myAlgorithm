package rxz.基数排序;

/**
 * 基数排序
 */
public class Jp {
    /**
     * TODO:基数排序算法实现
     * 时间复杂度O(N*K)
     * 空间复杂度:O(N+K)
     * 稳定
     * 但如果数组中的值有负数时,需要判断符号后分类讨论
     * @param array 待排序数组
     */
    public static void solve(int[] array) {
        if (array.length == 1) return;
        //首先确定数组中最大值的位数(针对非负数)
        int x = array[0];
        for (int v : array) x = v > x ? v : x;
        String s = x + "";
        int k = s.length();
        //开始排序
        int[][] bucket = new int[10][array.length];//桶
        int[] count = new int[10];//记录每个桶中有效数据个数的数组
        for (int i = 0, m = 1; i < k; i++, m *= 10) {
            for (int value : array) {
                int justNum = value / m % 10;
                bucket[justNum][count[justNum]++] = value;//放入桶中并变化计数数组
            }
            int index = 0;
            for (int p = 0; p < count.length; p++) {//把数据从桶中以此取出放回原数组
                if (count[p]!=0){
                    for (int q = 0; q < count[p]; q++) {
                        array[index++]=bucket[p][q];//这个index++很容易忘
                    }
                    count[p] = 0;//计数数组指定位置使用后置空等待下轮循环
                }
            }
        }
    }
}
