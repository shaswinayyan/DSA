//1 Two Sum
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int[] nums ={1,2,5,3};
        int target = 7;
        HashMap<Integer,Integer> prevMap = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(prevMap.containsKey(target-nums[i])){
                System.out.println(new int[] {prevMap.get(target-nums[i]),i}.toString()); 
            }
            prevMap.put(nums[i],i);
        }
    }
}
