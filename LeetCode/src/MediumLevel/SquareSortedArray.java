package MediumLevel;

public class SquareSortedArray {
    public static void swap (int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] squareArray(int arr[]){
        int p1 = 0; int p2 = p1 + 1;
        while(p1 < p2){
            if(Math.abs(arr[p1]) > Math.abs(arr[p2])){
                swap(arr, p1, p2);
                p2++;
            } else {
                p1++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }

        return arr;
    }

    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {-7,-3,2,3,11};

        squareArray(arr);
        display(arr);
        
    }
}
