package HardLevel;

import java.util.HashMap;
import java.util.Map;


public class CountingProblem {
    public static void main(String[] args) {
        int arr[] = {1,3,3,4};
        int size = arr.length;

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < size; i++){
            if(map.containsKey(arr[i]-i)){
                map.put(arr[i]-i, map.get(arr[i]-i) + 1);
            } else {
                map.put(arr[i]-i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> enter : map.entrySet()){
            count = Math.max(count, enter.getValue());
        }
        System.out.println(count);
    }
}
