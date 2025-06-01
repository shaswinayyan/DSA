//169.Majority Element

import java.util.*;



public class majorityelement {
    public static void main(String[] args) {
        
        int[] nums={2,2,1,1,1,2,2};
        Map<Integer, Integer> prev = new HashMap<>();
        int maxcount=0;
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if(!prev.containsKey(nums[i])){
                prev.put(nums[i],1);
            }
            else{
                int currentcount = prev.get(nums[i]);
                prev.put(nums[i],currentcount+1);
            }
            if(prev.get(nums[i])>maxcount){
                res = nums[i];
                maxcount = prev.get(nums[i]);
            }
        }
        System.out.println(res);
    }
}
