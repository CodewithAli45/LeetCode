package MediumLevel;

public class ReverseString {
    public static void main(String[] args) {
        char ch[] = {'a', 'b', 'c', 'd'};
        int n = ch.length;
        for(int i = n - 1; i >= 0; i--){
            System.out.print(ch[i] + " ");
        }
    }
}
