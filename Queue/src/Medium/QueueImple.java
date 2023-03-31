package Medium;
import java.util.*;;
public class QueueImple {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(25);
        q.add(78);
        q.add(654);
        q.add(79816);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
