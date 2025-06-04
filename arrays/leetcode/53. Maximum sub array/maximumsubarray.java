//53.Maximum sub array

public class maximumsubarray {
    public static void main(String[] args) {
        
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};

        //brute force approach

        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<nums.length ; i++){
            
            int sum=0;

            for(int j=i; j<nums.length; j++){

                sum = sum+ nums[j];
                maxSum = Math.max(sum, maxSum);

            }

        }
        System.out.println(maxSum);

    }
}
