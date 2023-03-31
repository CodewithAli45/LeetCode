package MediumLevel;

import java.util.HashMap;

public class TwoSumII {
    public static void main(String[] args) {
        int nums[] = {2,7,11,13,15}; int target = 9;
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }

        System.out.print(ans[0] + " " + ans[1]);
    }
}
