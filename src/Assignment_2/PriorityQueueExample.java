package Assignment_2;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(3);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}