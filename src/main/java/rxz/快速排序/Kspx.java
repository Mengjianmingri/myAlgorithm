package rxz.快速排序;

public class Kspx {
    public static void solve(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int shaftP = sort(array, left, right);
        solve(array, left, shaftP - 1);
        solve(array, shaftP + 1, right);
    }

    public static int sort1(int[] array, int left, int right) {//双轴快排(未递归),未优化,纯脑壳怎么想手怎么敲,可实现
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

    public static int sort(int[] array, int left, int right) {//双轴快排优化后,可实现
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
