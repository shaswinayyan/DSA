import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] nums ={1,2};

        int n = Math.floorDiv(nums.length, 3);

        Map<Integer,Integer> res = new HashMap<>();
        List<Integer> majorityElement = new ArrayList<>();
        for(int i : nums){
            res.put(i,res.getOrDefault(i, 0)+1);
        }
        for(int key : res.keySet()){
            if(res.get(key)>n){
                majorityElement.add(key);
            }
        }

        System.out.println(majorityElement);
    
    }
}
