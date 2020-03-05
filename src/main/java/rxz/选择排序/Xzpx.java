package rxz.选择排序;

public class Xzpx {
    public static int[] solve(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minPos]>array[j]){
                    minPos = j;
                }
            }
            System.out.println("minPos: " + minPos );
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
        return array;
    }
}
