package GeneralQuestions.src;

public class SpiralMatrixII {
    public static int[][] spiralPrint(int n){
        int arr[][] = new int [n][n];
        int num = 1;
        int row = arr.length;
        int col = arr[0].length;

        int top = 0, bottom = row -1;
        int left = 0, right = col - 1;

        while(top <= bottom && left <= right){
            // print top row
            for(int i = left; i <= right; i++){
               arr[top][i] = num++;
            }
            top++;
            // print right column
            for(int i = top; i<= bottom; i++){
                arr[i][right] = num++;
            }

            right--;
            // print bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arr[bottom][i]  = num++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        return arr;

    }
    public static void main(String[] args) {
        
    }
}
