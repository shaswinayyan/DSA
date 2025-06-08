import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] nums = {1,-1,1,1,1,1};
        int k = 3;
        // Reminder: we need to find sub array not sequence

        // int res = 0;

        // for(int i=0; i<nums.length ; i++){
        //     int sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             res+=1;
        //         }

        //     } 
        // }
        // System.out.println(res);

        Map<Integer,Integer> prefixSum = new HashMap<>();

        prefixSum.put(0,1);
        int sum =0,res=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int diff = sum-k;
            res+= prefixSum.getOrDefault(diff,0);
            prefixSum.put(sum,prefixSum.getOrDefault(sum, 0)+1);
            
            
        }
        System.out.println(res);

    }
}
