import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                if(i==j){
                    break;
                }
                else{
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            int left = 0;
            int right = matrix[0].length-1;
            while(left<right){
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
                left++;
                right--;
            }

        }
        


        System.out.println(Arrays.deepToString(matrix));    
        
    }
}
