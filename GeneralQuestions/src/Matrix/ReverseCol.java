package GeneralQuestions.src.Matrix;

public class ReverseCol {
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
            {16,17,18},
            {19,20,21}
         };
        display(mat);
        System.out.println("REverse columns");
        for(int i = 0; i < mat.length/2; i++){
            for(int j = 0; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length - i - 1][j];
                mat[mat.length - i - 1][j] = temp;
            }
        }
        display(mat);
    }
}
