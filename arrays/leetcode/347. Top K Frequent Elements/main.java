import java.util.*;

public class main {
    public static void main(String[] args) {
        
        int[] nums ={1,1,1,2,2,3};
        int k =2;

        Map<Integer,Integer> countFrequency = new HashMap<>();
        for(int num: nums){
            countFrequency.put(num, countFrequency.getOrDefault(num, 0)+1);
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] freq = (List<Integer>[]) new List[nums.length+1];

        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: countFrequency.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res =new int[k];
        int index=0;

        for(int i=freq.length-1; i>0 && index<k ; i++){
            for(int n: freq[i]){
                res[index++]= n;
                if(index==k){
                    // return res;
                    System.out.println(res);
                }
            }
        }
        // return res;
        System.out.println(res);


    }
}
