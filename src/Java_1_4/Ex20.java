package Java_1_4;

import edu.princeton.cs.algs4.BinarySearch;

public class Ex20 {
    public static int bothway(int []a,int find){
        int left = 0;
        int right = a.length - 1;
        int mid;
        int index;
        while (left<=right){

            mid = left + (right - left) / 2;
            if (a[mid] == find)
                return mid;
            if(a[mid] > a[mid-1] ){
                if (find < a[mid]){
                    index = BinarySearch.rank_up(find, a, left, mid);
                    if (index != -1){
                        return index;
                    }
                    left = mid + 1;
                }
            }
            if (a[mid] < a[mid-1]){
                if (find < a[mid]){
                    index = BinarySearch.rank_low(find,a,mid,right);
                    if (index != -1){
                        return index;
                    }
                    right = mid - 1;
                }
            }

        }
        return -1;

    }

    public static class BinarySearch{
        public static int rank_up(int key, int[] a, int lo, int hi) {
            while (lo <= hi){
                int mid = (lo + hi)/2;
                if (key < a[mid]){
                    hi = mid - 1;
                }else if (key > a[mid]){
                    lo = mid + 1;
                }else{
                    return mid;
                }
            }
            return -1;
        }

        public static int rank_low(int key, int[] a, int lo ,int hi){
            while (lo <= hi) {
                int mid = (hi + lo) / 2;
                if (key > a[mid])
                    hi = mid - 1;
                else if (key < a[mid])
                    lo = mid + 1;
                else
                    return mid;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,10,9,8,7,6};
        int find = 4;

        System.out.println(bothway(a,find));
    }
}
