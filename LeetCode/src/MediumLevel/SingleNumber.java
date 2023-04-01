package MediumLevel;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int getSingleOccurance(int arr[], int n){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
            if(ent.getValue() == 1){
                ans = ent.getKey();
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int num [] = {2,2,2,1,1};
        int n = num.length;
        int ans = getSingleOccurance(num, n);
        System.out.println(ans);
    }
}
