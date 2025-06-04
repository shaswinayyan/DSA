//1752. Check if Array Is Sorted and Rotated

class sortandrotate{
    public static void main(String[] args) {
        int flag = 0;
        int[] nums ={3,4,5,1,2};
        for(int i =0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                flag++;
            }
            else{
                continue;
            }
        }
        if(flag>1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}