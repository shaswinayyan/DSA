
import java.util.Arrays;

//75.Sort Colors

public class sortcolor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        int l=0; int r=nums.length-1; int i=0;

        while(i<=r){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l+=1;
            }

            if(nums[i]==2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r]= temp;
                r-=1;
                i-=1; 
            }
            i+=1;
        }

        System.out.println(Arrays.toString(nums));
    }
}
