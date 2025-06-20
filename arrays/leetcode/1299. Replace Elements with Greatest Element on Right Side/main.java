// package arrays.leetcode.1299. Replace Elements with Greatest Element on Right Side;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr ={17,18,5,4,6,1};
        int[] res = new int[arr.length];
        int rightMax =-1;
        for(int i=arr.length-1; i>=0; i--){
            res[i] = rightMax;
            rightMax = Math.max(arr[i], rightMax);
        }
        System.out.println(Arrays.toString(res));
    }
}
