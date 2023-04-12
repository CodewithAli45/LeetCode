package GeneralQuestions.src;

public class Basic {
    public static void main(String[] args) {
        // double val = 12.3;
        // double roundVal = Math.round(val * 100.0) / 100.0;
        // String formattedValue = String.format("%.3f", roundVal);
        // System.out.println(roundVal);
        // System.out.println(formattedValue);

        int a = 12;
        double b = 3.14159;
        String c = "Hello, Jyoti Raut";

        System.out.printf("%-10s %-10s %-20s\n", "a", "b", "c");
        System.out.printf("%-10d %-10.2f %-20s\n", a, b, c);
    }
}
