package MediumLevel;

public class RotatedArray {
    public static int [] rorated(int arr[], int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-k);

        return arr;
    }
    public static void reverse (int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}; int k = 3;
        int n = nums.length;
        
        int arr[] = rorated(nums, k);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
