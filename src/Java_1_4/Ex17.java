package Java_1_4;

import java.util.Arrays;

public class Ex17 {
    public static void farthest(double []a){
        Arrays.sort(a);
        int maxI = 0;
        double maxNum = Double.MIN_VALUE;
        for (int i = 0 ; i < a.length-1; i++){
            if (a[i+1] - a[i] > maxNum){
                maxNum = a[i+1] - a[i];
                maxI = i;
            }
        }
        System.out.println("最遥远的数为"+a[maxI]+"以及"+a[maxI+1]);
    }
    public static void main(String[] args) {
        double [] a = {3,2,4,5,6,2,3,8,4,3};
        farthest(a);
    }
}
