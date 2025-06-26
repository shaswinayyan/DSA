import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        //let's try brute force approach 
        // for(int i=0 ; i<n ;i++){
        //     nums1[i+m] = nums2[i];
        // }
        // Arrays.sort(nums1);
        //now 3 pointer without extra space optimal approach
        int last = m+n-1;// 3rd pointer
        //m would point to the first array last non zero
        //n would point to the elements in the second array

        while(m>0 && n>0){
            if(nums1[m-1]> nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--; 
            }
            else{
                nums1[last] = nums2[n-1];
                n--;
            }
            last--;
        }

        while(n >0){
            nums1[last] = nums2[n-1];
            n--;
            last--;
        }

        // System.out.println(Arrays.toString(nums1));

    }
}
