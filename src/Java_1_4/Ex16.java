package Java_1_4;

import java.util.Arrays;

public class Ex16 {
    public static void nearest(double [] a){
        Arrays.sort(a);
        int minI = 0;
        double minNum = Double.MAX_VALUE;
        for (int i = 0 ; i < a.length-1; i++){
            if (a[i+1] - a[i] < minNum){
                minNum = a[i+1] - a[i];
                minI = i;
            }
        }
        System.out.println("最接近的数为"+a[minI]+"以及"+a[minI+1]);
    }

    public static void main(String[] args) {
        double [] a = {3,2,4,5,6,12,23,8,99,34};
        nearest(a);
    }
}
