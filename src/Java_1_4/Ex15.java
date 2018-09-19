package Java_1_4;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex15 {
    public static int quick_2sum(int []a){
        Arrays.sort(a);
        int cnt = 0;
        int left = 0; int right = a.length - 1;
        while (left < right){
            if (a[left] + a[right] == 0){
                cnt ++;
                left++;
            }
            if (a[left]+a[right]>0) right--;
            if (a[left]+a[right]<0) left++;
        }
        return cnt;
    }

    public static int quick_3sum(int [] a){
        Arrays.sort(a);
        int cnt = 0;
        int N = a.length;
        int left = 0; int right = a.length - 1;
//        while (left < right){
//            if (a[left] + a[right] < 0) {
//                for (int i = left; i < right; i++) {
//                    if (a[left] + a[right] + a[i] == 0) {
//                        cnt++;
//                        //left ++;
//                    }
//                }
//                left++;
//            }
//            right--;
//        }
        for (int i = 0 ; i < N; i++){
            while (left < right){
                if (a[left] + a[right] +a[i] == 0){
                    cnt ++;
                    left++;
                }
                if (a[left]+a[right]+a[i]>0) right--;
                if (a[left]+a[right]+a[i]<0) left++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

    }
}
