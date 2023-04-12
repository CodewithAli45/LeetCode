package GeneralQuestions.src;

public class SpiralMatrix {
    public static void spiralMat(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        while(top <= bottom && left <= right){
            // print top row
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            // print right column
            for(int i = top; i<= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }

            right--;
            // print bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
       
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
        spiralMat(arr);
        display(arr);

    }
}
