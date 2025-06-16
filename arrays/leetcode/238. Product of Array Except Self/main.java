// package arrays.leetcode.238. Product of Array Except Self;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        // return res;
        System.out.println(Arrays.toString(res));;
    }
}
