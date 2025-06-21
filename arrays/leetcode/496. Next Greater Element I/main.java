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
        for(int i=0; i<nums2.length;i++){
            if(!numsHash.containsKey(nums2[i])){
                continue;
            }
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[j]> nums2[i]){
                    res[numsHash.get(nums2[i])]= nums2[j];
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(res));
    }
}
