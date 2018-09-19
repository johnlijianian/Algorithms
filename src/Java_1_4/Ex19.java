package Java_1_4;

import java.util.Arrays;

public class Ex19 {
    //n*n*lgn的算法
    public void matrix_min(int [][]a,int N){
        int []temp = new int[N];
        for(int i = 0; i < N ; i++){
            temp[i] = local_minimum(a[i]);
        }
        System.out.println(local_minimum(temp));
    }



    // 一维数组的局部最小
    public static int local_minimum(int []a){
        if (a[0] < a[1]) return a[0];
        if (a[a.length-1] < a[a.length-2]) return a[a.length-1];

        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high){
            mid = (low + high)/2;
            System.out.println("中间"+mid);
            if (a[mid] <= a[mid+1] && a[mid] <= a[mid-1]) return a[mid];
            else if (a[mid] >= a[mid+1] && a[mid] <= a[mid-1]){ //单调递减 搜小的一边
                low = mid+1;
            }else if(a[mid-1] < a[mid] && a[mid] > a[mid+1]){//极大值点
                if (a[mid-1] >= a[mid+1]) low = mid+1;
                else high = mid-1;
            }
            else { // 单调增
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 4;
        int [][] a = {{5,3,2,5},{5,7,1,3},{11,7,4,6},{2,4,6,4}};
        /*
            5  3 2 5
            5  7 1 3
            11 7 4 6
            2, 4 6 4
         */


    }
}
