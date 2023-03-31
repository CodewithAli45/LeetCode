/*
Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/ 
package EasyLevel;

import java.util.HashMap;

public class TwoSum {

    // below is naive approach with time complexity of O(n2) and space O(n)
    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;  
    }
    // below is optimize solution with time complexity of O(n)
    public static int[] twoSumOptimzed(int[] nums, int target) {
        int res[] = new int[2]; int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(target - nums[i] )){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
    
    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,71,2,11,15,7};
        int target = 9;

        // int ans[] = twoSum(arr, target);
        int ans[] = twoSumOptimzed(arr, target);
        display(ans);
        
    }
}
