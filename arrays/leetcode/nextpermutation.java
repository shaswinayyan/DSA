//31.Next Permutation

import java.util.*;

public class nextpermutation {
    public static void main(String[] args) {
        int[] nums ={1,2,4,5,3,2};

        int index = -1;

        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        //If break point does not exist revese the array
        if(index==-1){
            for(int i=0; i<nums.length/2;i++){
            int tmp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = tmp;
            }
            System.out.println(Arrays.toString(nums));
        }
        
        //find the next greater element and swap it with array[index]

        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                break;
            }
        }
        //reverse the second half of the array
        int start =index+1; int end =nums.length-1;
        while(start<end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
