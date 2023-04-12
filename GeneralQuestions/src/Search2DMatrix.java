package GeneralQuestions.src;

public class Search2DMatrix {
    public static boolean getElement(int matrix[][], int target ){
        int row = matrix.length;
        if(row == 0){
            return false;
        }
        int col = matrix[0].length;
        int left = 0, right = row*col - 1;

        while(left <= right){
            int mid = (left + right )/ 2;
            int midVal = matrix[mid/col][mid%col];

            if(midVal == target){
                return true;
            } else if(midVal < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }//
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        boolean ans = getElement(arr, 16);

        System.out.println(ans);
    }
}
