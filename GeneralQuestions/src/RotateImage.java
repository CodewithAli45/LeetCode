package GeneralQuestions.src;

public class RotateImage {
    public static void transpose(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void rotateClockwise(int arr[][]){
        transpose(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - j - 1];
                arr[i][arr.length - j - 1] = temp;
            }
        }
    }
    public static void rotateAntiClockwise(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - j - 1];
                arr[i][arr.length - j - 1] = temp;
            }
        }
        transpose(arr);
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
    
        display(arr);
        // System.out.println("clockwise rotation");
        // rotateClockwise(arr);
        // display(arr);
        System.out.println("anti clock wise rotation");
        rotateAntiClockwise(arr);
        display(arr);

    }
}
