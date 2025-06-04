//73. Set Matrix Zeros;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]==0){
                markZeros(matrix,i,j);
                // MarkingZero.markZeros(matrix,i,j);
            }
        }
    }
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]==-1){
                matrix[i][j]=0;
            }
        }
    }
    //for printing
    System.out.println(Arrays.deepToString(matrix));
    
  }
  public static void markZeros(int[][] matrix, int i ,int j){
    for(int n=0; n<matrix.length; n++){
        if(matrix[n][j]==1){
            matrix[n][j] = -1;
        }
    }
    for(int m=0; m<matrix[0].length; m++){
        if(matrix[i][m]==1){
            matrix[i][m] = -1;
        }
        
    }
}  
}
