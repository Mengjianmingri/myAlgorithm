import org.junit.Test;
import rxz.二分查找.BinarySearch;
import rxz.插值查找.InsertValueSearch;

import java.util.List;

public class SearchTest {
    int[] arr = {2, 6, 7,8,  9, 10, 25};

    @Test
    public void test01() {
        List<Integer> list = BinarySearch.binarySearch1(arr, 9, 0, arr.length - 1);
        if (list!=null) {
            for (Integer v : list) {
                System.out.println(v);
            }
        }else System.out.println(-1);
    }
//    @Test
//    public void test02(){
//        int i = BinarySearch.binarySearch(arr, -5);
//        System.out.println(i);
//    }
    @Test
    public void test03(){
        int i = InsertValueSearch.insertValueSearch(arr, 9, 0, arr.length - 1);
        System.out.println(i);
    }
}
