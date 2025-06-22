import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        Map<Integer, Integer> numsHash = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            numsHash.put(nums1[i],i);   
        }
        //a Hashmap to store the integers and their index
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                res[numsHash.get(stack.pop())] = nums2[i];
                
            }
            if(numsHash.containsKey(nums2[i])){
                stack.push(nums2[i]);
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
