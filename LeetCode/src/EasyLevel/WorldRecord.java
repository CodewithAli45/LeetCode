package EasyLevel;

public class WorldRecord {
    public static void main(String[] args) {
        double dis = 100.0;
        double k1 = 1.0, k2 = 1.0, k3 = 0.9, v = 10.44;
        double res = dis / (k1*k2*k3*v);
        double ans = Math.round(res*100.0)/100.0;
        System.out.println(res + " " + ans);

        if(ans < 9.58){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
