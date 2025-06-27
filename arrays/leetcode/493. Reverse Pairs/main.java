public class main {
    public static void main(String[] args) {
        int[] nums ={2,4,3,5,1};
        //brute force
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length ; j++){
                if(nums[i]>2*nums[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
