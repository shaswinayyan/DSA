//54. Spiral Matrix

import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> spiralOrder = new ArrayList<>();

        int left = 0; int right = matrix[0].length-1;
        int top = 0; int bottom = matrix.length-1;

        while(left<=right && top<=bottom){

            for(int i=left; i<=right; i++){
                spiralOrder.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                spiralOrder.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right; i>=left ; i--){
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(spiralOrder);

    }
}
