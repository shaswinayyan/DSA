//128. Logest consecutive sequence

import java.util.*;

public class longestconsecutivesequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();
        int longest =1;
        for(int i=0; i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int cnt =1;
                int x = nums[i];
                while(set.contains(x+1)){
                    cnt+=1;
                    x+=1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println(longest);



    }
}
