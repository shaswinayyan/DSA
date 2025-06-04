//485. Max Consecutive Ones

import java.util.*;


public class maxconsecutiveones {
    public static void main(String[] args) {
        
        int[] nums = {1,0,1,1,0,1};

        int count=0; int maxCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }
            else{
                if(count>maxCount){
                    maxCount=count;
                }
                count = 0;
            }
            
        }
        if(count>maxCount){
            maxCount = count;
        }
        System.out.println(maxCount);

    }
}
