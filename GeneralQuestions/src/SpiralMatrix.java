package GeneralQuestions.src;

public class SpiralMatrix {
    public void spiralMat(int arr[][]){
        int minRow = 0, maxRow = arr.length-1;
        int minCol = 0, maxCol = arr.length - 1;
    }

    public static void display(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

    }
}
