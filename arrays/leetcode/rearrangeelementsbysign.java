//2149. Rearrange Array Elements by sign
import java.util.*;




public class rearrangeelementsbysign {
    public static void main(String[] args) {
        
        int[] nums ={3,1,-2,-5,2,-4};

        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(new Integer[nums.length]));

        int posIndex = 0; int negIndex =1;

        for(int num: nums){
            if(num>0){
                res.set(posIndex, num);
                posIndex +=2;
            }
            else{
                res.set(negIndex, num);
                negIndex +=2;
            }
        }

        System.out.println(res);

    }
}
