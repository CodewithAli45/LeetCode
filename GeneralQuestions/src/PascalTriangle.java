package GeneralQuestions.src;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 3;
        int[][] pascalTriangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            pascalTriangle[i] = new int[i+1];
            pascalTriangle[i][0] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }

            pascalTriangle[i][i] = 1;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }

}
