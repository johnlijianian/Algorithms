package Java_1_4;

import edu.princeton.cs.algs4.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sum_4 {
    public static int count(int[] a){
        Arrays.sort(a);
        int cnt = 0;
        for(int i = 0; i < a.length;i ++){
            for (int j = 0; j < i; j ++){
                for (int k = 0; k < j; k ++){
                    if (BinarySearch.rank((-a[i] - a[j] - a[k]), a) > k){
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}
