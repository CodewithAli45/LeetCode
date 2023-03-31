package EasyLevel;

public class MathisandGarrison {
    public static void main(String[] args) {
        int arr[] = new int [26];
        for(int i = 0; i < 26; i++){
            arr[i] = i+1;
            // System.out.print(arr[i] + " ");
        }
        String str = "abcdefghijklmopqrstuvwz";
        int sum = 0;
        char ch [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w',
         'x', 'y', 'z' };

         int k;
         for(k = 0; k<26; k++){
            if(str.contains(String.valueOf(ch[k]))){
                continue;
            } else {
                sum += arr[k];
            }
         }
         System.out.println(sum);
        
    }
}
