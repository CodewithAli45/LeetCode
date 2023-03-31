package MediumLevel;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String []ans = s.split(" ");
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]);  
        }
        System.out.println();
        for(int i = 0; i < ans.length; i++){
            ans[i] = new StringBuilder(ans[i]).reverse().toString();
            System.out.print(ans[i] );
        }
        System.out.println();
        System.out.println(String.join(" ", ans));
    }
}
