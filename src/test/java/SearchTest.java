import org.junit.Test;
import rxz.二分查找.BinarySearch;

import java.util.List;

public class SearchTest {
    int[] arr = {2, 6, 6, 6,6, 8, 7, 9, 10, 25};

    @Test
    public void test01() {
        List<Integer> list = BinarySearch.binarySearch1(arr, 6, 0, arr.length - 1);
        if (list!=null) {
            for (Integer v : list) {
                System.out.println(v);
            }
        }else System.out.println(-1);
    }
    @Test
    public void test02(){
        int i = BinarySearch.binarySearch(arr, -5);
        System.out.println(i);
    }
}
