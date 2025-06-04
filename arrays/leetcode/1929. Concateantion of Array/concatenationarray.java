//Problem Number 1929.Concateantion of Array

import java.util.Arrays;

public class concatenationarray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = new int[nums.length*2];
        System.out.println("Copy the array to the new array");
        // System.arraycopy(nums, 0, ans, 0, nums.length);
        // System.arraycopy(nums, 0, ans, nums.length, nums.length);

        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];
        }
        
        System.out.println(Arrays.toString(ans));
    }
}
