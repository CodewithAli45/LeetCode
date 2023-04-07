package MediumLevel;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> getSum(int arr[], int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1, k = arr.length - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while(j < k && arr[j] == arr[j+1]){
                    j++;
                    }
                    while(j < k && arr[k] == arr[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                } else if(sum < target){
                    j++;
                } else {
                    k--;
                }
                
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        List<List<Integer>> ans = getSum(nums, target);
        System.out.println(ans);

    }
}
