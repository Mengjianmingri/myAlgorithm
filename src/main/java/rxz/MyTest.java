package rxz;

import org.junit.Test;
import rxz.选择排序.Xzpx;

public class MyTest {
    int[] array = {7,6,8,2,5,9,4,1,3};
    @Test//选择排序
    public void test01(){
        int[] solve = Xzpx.solve(array);
        for (int x : solve) {
            System.out.print(" "+x);
        }
    }
}
