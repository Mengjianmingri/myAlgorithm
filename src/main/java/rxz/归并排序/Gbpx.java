package rxz.归并排序;

/**
 * TODO:归并排序算法实现
 * 时间复杂度最好最坏都是:O(n*logn)
 * 空间复杂度:O(n)
 * 稳定(注意判断条件中的小于还是小于等于,影响稳定性)
 */
public class Gbpx {
    public static void solve(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        if (left>right){
            throw  new RuntimeException("参数错误!");
        }
        //分成两半
        int mid = left + (right - left) / 2;
        //左边排序
        solve(array, left, mid);
        //右边排序
        solve(array, mid + 1, right);
        sort(array, left, mid + 1, right);
    }

    public static void sort(int[] array, int left, int right, int border) {
        if (left==right){
            return;
        }if (left>right){
            throw  new RuntimeException("参数错误!");
        }
        int mid = right - 1;
        int[] temp = new int[border - left + 1];
        int leftP = left;
        int rightP = right;
        int justP = 0;
        while (leftP <= mid && rightP <= border) {
            temp[justP++] = array[leftP] <= array[rightP] ? array[leftP++] : array[rightP++];
        }
        while (leftP <= mid) {
            temp[justP++] = array[leftP++];
        }
        while (rightP <= border) {
            temp[justP++] = array[rightP++];
        }
        for (int i = 0; i < temp.length; i++) {//排好序的数组在temp中,将其赋值回原数组对应位置
            array[i + left] = temp[i];
        }
    }
}
