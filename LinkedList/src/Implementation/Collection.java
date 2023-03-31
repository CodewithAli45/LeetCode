package Implementation;

import java.util.*;
public class Collection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
    }
}
