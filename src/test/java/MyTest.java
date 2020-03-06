import org.junit.Before;
import org.junit.Test;
import rxz.冒泡排序.Mppx;
import rxz.希尔排序.Xepx;
import rxz.归并排序.Gbpx;
import rxz.插入排序.Crpx;
import rxz.选择排序.Xzpx;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MyTest {

    int[] array = {7, 6, 8, 2, 5, 9, 4, 1, 3, 18, 0, -8, 45};
    int[] array1 = {1, 6, 10, 2, 5, 6, 8, 9};
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
    public void test04() {//8000万数据时,十分钟未跑出结果
        justTime("排序前的时间是: ");
        int[] solve = Crpx.solve(bigArray);
        justTime("排序后的时间是: ");
    }

    @Test//希尔排序
    public void test05() {//8000万数据时,大约40秒
        justTime("排序前的时间是: ");
        int[] solve = Xepx.solve(bigArray);
        justTime("排序后的时间是: ");
    }

    @Test//归并排序(递归)
    public void test06() {//8000万数据时,大约21秒
//        Gbpx.sort(array1, 0, 3, 7);//未加入递归,假设数组的两个子数组内部有序
//        System.out.println(Arrays.toString(array1));
//        Gbpx.solve(array, 0, array.length - 1);//加入递归
//        System.out.println(Arrays.toString(array));
        justTime("排序前的时间是: ");
        Gbpx.solve(bigArray,0,bigArray.length-1);
        justTime("排序后的时间是: ");
    }
}
