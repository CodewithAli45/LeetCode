package GeneralQuestions.src.Matrix;

public class NewtonProblem {
    public static void transpose(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void reverseRow(int mat[][]){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
    }
    public static void reverseCol(int mat[][]){
        int n = mat.length;
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = temp;
            }
        }
    }
    // left rotation 
    public static void rotateRight(int mat[][]){
        // make transpose
        transpose(mat);
        // reverse the row
        reverseRow(mat);
    }
    public static void rotateLeft(int mat[][]){
        // first make reverse row
        reverseRow(mat);
        // then transpose the matrix
        transpose(mat);
    }
    public static void rotate180(int mat[][]){
        rotateRight(mat);
        rotateRight(mat);
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
        System.out.println("original matrix");
        String str = "L";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'L'){
                rotateLeft(mat);
            } else if(ch == 'R') {
                rotateRight(mat);
            }
        }
        
        display(mat);
    }
}
