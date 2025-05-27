//217.Contains Duplicate

import java.util.HashSet;

public class containsduplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        HashSet<Integer> seen = new HashSet<>();
        for (int i: nums){
            if(seen.contains(i)){

                System.out.println("There is duplicate element");
            }
            seen.add(i);
        }
        

    }
}
