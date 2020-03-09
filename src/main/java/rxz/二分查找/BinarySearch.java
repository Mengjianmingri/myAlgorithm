package rxz.二分查找;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    /**
     * TODO:递归版二分查找(查到到一个符合的数据就结束查找版)
     * @param array  待查找数组,必须是有序的
     * @param target 目标值
     * @param left   当前数组最小索引
     * @param right  当前数组最大索引
     * @return 查找成功时返回对应的索引, 未查找到则返回-1
     */
    public static int binarySearch(int[] array, int target, int left, int right) {//数组需有序
        if (left > right|| array[0] > target || array[array.length - 1] < target) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1);
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right);
        } else {
            return mid;
        }
    }

    /**
     * TODO:递归版二分查找(查到到所有符合的数据后返回)
     * @param array  待查找数组,必须是有序的
     * @param target 目标值
     * @param left   当前数组最小索引
     * @param right  当前数组最大索引
     * @return 所有符合目标值的索引的集合, 若没查找到返回null;
     */
    public static List<Integer> binarySearch1(int[] array, int target, int left, int right) {
//        System.out.println("~~");
        if (left > right|| array[0] > target || array[array.length - 1] < target) {
            return null;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] > target) {
            return binarySearch1(array, target, left, mid - 1);
        } else if (array[mid] < target) {
            return binarySearch1(array, target, mid + 1, right);
        } else {
            List<Integer> list = new ArrayList<Integer>();
            int k = mid - 1;
            list.add(mid);
            mid++;
            while (k > 0 && array[k] == target) {//开始向左查找
                list.add(k--);
            }
            while (mid < array.length - 1 && array[mid] == target) {
                list.add(mid++);
            }
            return list;
        }
    }

    /**
     * TODO:二分查找非递归版
     * @param nums 待排数组
     * @param target 目标值
     * @return 查找到返回对应索引,查找失败返回-1
     */
    public static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
