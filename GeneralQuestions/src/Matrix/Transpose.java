package GeneralQuestions.src.Matrix;

public class Transpose {

    public static void display(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMat(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [][]mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        display(mat);
        System.out.println("transpose array");
        transposeMat(mat);
        display(mat);
    }
}
