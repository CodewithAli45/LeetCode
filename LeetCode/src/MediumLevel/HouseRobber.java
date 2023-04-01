package MediumLevel;

public class HouseRobber {
    public static int maxMoney(int nums[]){
        int size = nums.length;
        int ans[] = new int [size];
        if(size == 0){
            return 0;
        }
        if(size == 1){
            return nums[0];
        }
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < size; i++){
            ans[i] = Math.max(ans[i-2] + nums[i], ans[i-1]);
        }
        return ans[size-1];
    }
    public static void main(String[] args) {
        int money[] = {14,7,9,1,50};
        System.out.println(maxMoney(money));
    }
}
