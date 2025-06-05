//73. Set Matrix Zeros;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    
    int col0=1;
    for (int r = 0; r < matrix.length; r++) {
        for (int c = 0; c < matrix[0].length; c++) {
            if (matrix[r][c] == 0) {
                //mark the rows as zero
                matrix[r][0] = 0;
                if(c!=0){
                //mark the cols as zero
                    matrix[0][c] = 0;
                }
                else{
                    col0 = 0;
                }
            }
        }
    }

    for(int i=1; i<matrix.length; i++){
        for(int j=1;j<matrix[0].length; j++){
            if(matrix[i][j]!=0){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }

    if(matrix[0][0]==0){
        for(int j=0 ;j<matrix[0].length; j++){
            matrix[0][j]=0;
        }
    }
    if(col0==0){
        for(int i=0; i<matrix.length; i++){
            matrix[i][0]=0;
        }
    }
    //for printing
    System.out.println(Arrays.deepToString(matrix));
    
  }
    
}
