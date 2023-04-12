package GeneralQuestions.src.Matrix;

public class RotateAntiClock {
    public static void transpose(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void rotateRight(int mat[][]){
        transpose(mat);
        // reverse column
        for(int i = 0; i < mat.length / 2; i++){
            for(int j = 0; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length/2 - j - 1];
                mat[i][mat[0].length/2 - j - 1] = temp;
            }
        }
    }

    public static void modifiedRotate(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = mat[j][mat.length - i - 1];
            }
        }
    }

    public static void display(int mat[][]){
        int row = mat.length;
        int col = mat[0].length;
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
        display(mat);
        System.out.println("after rotation");
        modifiedRotate(mat);
        display(mat);
    }
}
