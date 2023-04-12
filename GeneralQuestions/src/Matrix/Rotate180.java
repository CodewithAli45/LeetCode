package GeneralQuestions.src.Matrix;

public class Rotate180 {
    
    public static void rotate180(int mat[][]){
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = mat[n-i-1][n-j-1];
            }
        }
    }
    public static void display(int mat[][]){
        int row = mat.length;
        int col = mat.length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate180(mat);
        display(mat);
    }
}
