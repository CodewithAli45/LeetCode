package HardLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class NextGeaterNumber {
    public static long[] nextNumber(long arr[], int n){

        long ans[] = new long[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int testcase = Integer.parseInt(br.readLine().trim());
        // while(testcase-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = Long.parseLong(inputLine[i]);
            }
            long res[] = nextNumber(arr, n);
            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
    
            }
            System.out.println();

        // }
    }
}
