package HashMap;

import java.util.Arrays;

public class DesignHashMap {
    static class Hashmap {
        int res[];

        public Hashmap(){
            res = new int[1000001];
            Arrays.fill(res, -1);
        }
        public void add(int key, int val){
            res[key] = val;
        }


    }
    public static void main(String[] args) {
        Hashmap obj = new Hashmap();
        obj.add(0, 1);
        obj.add(1, 2);
        System.out.println(obj);

    }
}
