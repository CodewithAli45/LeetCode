package GeneralQuestions.src;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int row){
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i <= row; i++){
            res.add(0,1);
            for(int j = 1; j < i; j++){
                res.set(j, res.get(j) + res.get(j+1));
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int row = 3;
        List<Integer> ans = new ArrayList<>();

        ans = getRow(row);
        System.out.println(ans);

    }
}
