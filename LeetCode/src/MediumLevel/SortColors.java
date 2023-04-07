package MediumLevel;

public class SortColors {
    public static void sortColor(int nums[]){
        int low = 0, high = nums.length - 1;
        int mid = 0, temp = 0;

        while(mid <= high){
            switch(nums[mid]){
                case 0 :
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++; mid++;
                    break;
                case 1 :
                    mid++; break;
                case 2 :
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        
        sortColor(nums);
    }
}
