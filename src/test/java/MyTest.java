import org.junit.Before;
import org.junit.Test;
import rxz.冒泡排序.Mppx;
import rxz.希尔排序.Xepx;
import rxz.插入排序.Crpx;
import rxz.选择排序.Xzpx;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MyTest {

    int[] array = {7, 6, 8, 2, 5, 9, 4, 1, 3};
    int[] bigArray = new int[80000000];

    public void justTime(String s) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(date);
        System.out.println(s + time);
    }

    @Before
    public void pre() {
        for (int i = 0; i < 80000000; i++) {
            bigArray[i] = (int) (Math.random() * 80000000);
        }
    }

    @Test//选择排序
    public void test01() {
        justTime("排序前的时间是: ");
        int[] solve = Xzpx.solve(bigArray);
        justTime("排序后的时间是: ");
    }

    @Test//冒泡排序
    public void test02() {
        justTime("排序前的时间是: ");
        int[] solve = Mppx.solve(bigArray);
        justTime("排序后的时间是: ");
    }

    @Test//插入排序优化前
    public void test03() {
        justTime("排序前的时间是: ");
        int[] solve = Crpx.solve1(bigArray);
        justTime("排序后的时间是: ");
    }
    @Test//插入排序优化后(移位法)
    public void test04() {
        justTime("排序前的时间是: ");
        int[] solve = Crpx.solve(bigArray);
        justTime("排序后的时间是: ");
    }

    @Test//希尔排序
    public void test05() {
        justTime("排序前的时间是: ");
        int[] solve = Xepx.solve(bigArray);
        justTime("排序后的时间是: ");
    }
}
