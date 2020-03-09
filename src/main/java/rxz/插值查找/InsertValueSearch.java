package rxz.插值查找;

public class InsertValueSearch {
    /**
     * TODO:插值查找算法实现
     * 跟二分查找主要就是一个取mid的公式不同
     *
     * @param array  待查找数组
     * @param left   当前数组最小索引值
     * @param right  当前数组最大索引值
     * @param target 目标值
     * @return 查找成功返回对应的索引值, 查找失败返回-1
     */
    public static int insertValueSearch(int[] array, int target, int left, int right) {
        if (left > right || array[0] > target || array[array.length - 1] < target) return -1;
//        System.out.println("~~");
        int mid = left + (right - left) * (target - array[left]) / (array[right] - array[left]);//跟二分查找的主要区别
        if (array[mid] > target) {
            return insertValueSearch(array, target, left, mid - 1);
        } else if (array[mid] < target) {
            return insertValueSearch(array, target, mid + 1, right);
        } else {
            return mid;
        }
    }
}
