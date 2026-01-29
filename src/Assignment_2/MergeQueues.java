package Assignment_2;
import java.util.*;

public class MergeQueues {

    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.remove());
            } else {
                result.add(q2.remove());
            }
        }

        while (!q1.isEmpty()) result.add(q1.remove());
        while (!q2.isEmpty()) result.add(q2.remove());

        return result;
    }
}
