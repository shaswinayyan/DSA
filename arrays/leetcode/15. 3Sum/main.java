import java.util.*;

public class main {
    public static void main(String[] args) {
        
        int[] nums = {-1,0,1,2,-1,-4};
        Set<List<Integer>> resultSet = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            Set<Integer> count = new HashSet<>();

            for(int j=i+1; j<nums.length; j++){
                int third = -(nums[i]+nums[j]);
                if(count.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j],third);
                    temp.sort(null);
                    resultSet.add(temp);
                }
                count.add(nums[j]);
            }

        }
        List<List<Integer>> ans = new ArrayList<>(resultSet);

        System.out.println(ans);
    }
}
