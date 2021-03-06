import org.junit.Before;
import org.junit.Test;
import rxz.冒泡排序.Mppx;
import rxz.基数排序.Jp;
import rxz.希尔排序.Xepx;
import rxz.归并排序.Gbpx;
import rxz.快速排序.Kspx;
import rxz.插入排序.Crpx;
import rxz.计数排序.Jspx;
import rxz.选择排序.Xzpx;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MyTest {

    int[] array = {7, 6, 8, 2, 5, 9, 4, 1, 3, 18, 0, -8, 41, 15};
    int[] array1 = {6, 10, 2, 5, 6, 1, 2, 8, 9, 100};
    int[] array2 = {6, 10, 2, 5, 6, 1, 2, 8, 9, 100};
    int[] bigArray = new int[80000000];

    public void justTime(String s) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(date);
        System.out.println(s + time);
    }

//    @Before
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
        //int[] arrayTemp = {7, 20, 8, 2, 11, 9, 4, 1, 3, 9, 0, -8, -8};
        justTime("排序前的时间是: ");
//        Gbpx.solve(arrayTemp,0,arrayTemp.length-1);
//        System.out.println(Arrays.toString(arrayTemp));
        Gbpx.solve(bigArray, 0, bigArray.length - 1);
        justTime("排序后的时间是: ");
    }

    @Test//快速排序
    public void test07() {//8000万数据,大概16秒
        //int[] arrayTemp = {100, 20, 8, 2, 11, 9, 101, 1, 3, 9, 0, -8, -8};
//        Kspx.sort(arrayTemp,0,arrayTemp.length-1);
//        System.out.println(Arrays.toString(arrayTemp));
        //Kspx.solve(arrayTemp,0,arrayTemp.length-1);
        //System.out.println(Arrays.toString(arrayTemp));
        justTime("排序前的时间是: ");
        Kspx.solve(bigArray, 0, bigArray.length - 1);
        justTime("排序后的时间是: ");
    }

    @Test//计数排序
    public void test08() {////8000万数据,大概18秒
//        int[] ints = Jspx.solve(array1, -1, 100);
//        System.out.println(Arrays.toString(ints));
//        Arrays.sort(array2);
//        System.out.println(Arrays.toString(array2));
//        Arrays.sort(bigArray);
//        System.out.println(bigArray[bigArray.length - 1]);
//        System.out.println(bigArray[0]);
        justTime("排序前的时间是: ");
        int[] solve = Jspx.solve(bigArray, 0, 79999999);
        justTime("排序后的时间是: ");
    }
    @Test//基数排序
    public void test09() {
        Jp.solve(array1);
        System.out.println(Arrays.toString(array1));
    }
}
