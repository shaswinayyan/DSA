
import java.util.Arrays;

//2894 Divisible and non divisible sums difference

public class divandnonsumdiff {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int div=0, ndiv=0;
        int[] nums = new int[num1];
        // for(int j=0; j<num1 ;j++){
        //     nums[j]=j+1;
        // }
        for(int i=1; i<=num1; i++){
            if(i%num2==0){
                div += i;
            }
            else{
                ndiv += i;
            }   
        }
        System.out.println(ndiv-div);
        System.out.println(Arrays.toString(nums));
    }
}
