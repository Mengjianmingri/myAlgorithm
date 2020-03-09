package 校数器;

import org.junit.Before;
import org.junit.Test;
import rxz.基数排序.Jp;
import rxz.快速排序.Kspx;
import rxz.计数排序.Jspx;
import rxz.选择排序.Xzpx;

import java.util.Arrays;
import java.util.Random;

/**
 * TODO:通过和jdk的sort方法检验自己的排序算法的正确性
 */
public class Check {
    int[] array = new int[10000];
    int[] array1 = new int[10000];

    @Before
    public void pre() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.arraycopy(array, 0, array1, 0, array.length);
    }

    @Test
    public void check() {
        boolean flag = true;
        Arrays.sort(array);
        //Kspx.solve(array1, 0, array1.length - 1);
//        int[] lastArr = Jspx.solve(array1,0,10000);
        Jp.solve(array1);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
