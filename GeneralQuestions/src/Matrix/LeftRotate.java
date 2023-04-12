package GeneralQuestions.src.Matrix;

public class LeftRotate {
    public static void transposeMat(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void display(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]mat = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };
        display(mat);
        System.out.println("Rotate matrix by 90 degree anit clockwise");

        transposeMat(mat);
        // reverse matrix row
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length - j - 1];
                mat[i][mat[0].length - j - 1] = temp;
            }
        }
        display(mat);
    }
}
