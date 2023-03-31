package MediumLevel;

public class MoveZero {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int n = nums.length;
        int left = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[left++] = nums[i];
            }
        }
        while(left < n){
            nums[left++] = 0;
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
