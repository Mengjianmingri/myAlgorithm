package rxz.快速排序;

/**
 * TODO:快速排序算法实现
 * 时间复杂度:平均:O(N*logN)
 *          最坏:O(N^2)(此时第一次的轴为最大或最小,为了避免这种情况
 *                  可以先在数组中随机取一值与array.length-1处的数据互换再使用快排,减小概率)
 * 空间复杂度:O(logN)
 * 不稳定
 */
public class Kspx {
    public static void solve(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int shaftP = sort(array, left, right);
        solve(array, left, shaftP - 1);
        solve(array, shaftP + 1, right);
    }

    public static int sort1(int[] array, int left, int right) {//单轴快排(未递归),未优化,纯怎么想手怎么敲,可实现,语句臃肿
        if (left >= right) {
            return left;
        }
        int leftP = left;//左指针
        int rightP = right - 1;//右指针
        int shaft = array[right];
        while (leftP <= rightP) {
            int leftSwap = array[leftP];
            int rightSwap = array[rightP];
            if (leftSwap < shaft) {
                leftP++;
            }
            if (rightSwap > shaft) {
                rightP--;
            }
            if (leftSwap >= shaft && rightSwap <= shaft) {
                array[leftP] = rightSwap;
                array[rightP] = leftSwap;
                leftP++;
                rightP--;
            }
        }
        if (array[leftP] > shaft) {
            array[right] = array[leftP];
            array[leftP] = shaft;
            return leftP;
        }
        if (array[rightP] > shaft) {
            array[right] = array[rightP];
            array[rightP] = shaft;
            return rightP;
        } else {
            return right;
        }
    }

    public static int sort(int[] array, int left, int right) {//单轴快排优化后,可实现
        if (left >= right) {
            return left;
        }
        int leftP = left;//左指针
        int rightP = right - 1;//右指针
        int shaft = array[right];
        while (leftP <= rightP) {
            while (leftP <= rightP && shaft >= array[leftP]) {
                leftP++;
            }
            while (leftP <= rightP && shaft <= array[rightP]) {
                rightP--;
            }
            if (leftP < rightP) {
                int temp = array[leftP];
                array[leftP] = array[rightP];
                array[rightP] = temp;
            }
        }
        array[right] = array[leftP];
        array[leftP]=shaft;
        return leftP;
    }
}
