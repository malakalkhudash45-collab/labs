package Queue;
import Singlylinkedlist.Singlylinkedlist;

public class LinkedQueue<E> implements Queue<E>{
    Singlylinkedlist<E> slist=new Singlylinkedlist<E>();
    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
        slist.addLast(data);
    }

    @Override
    public E front() {
        return slist.getFirst();
    }

    @Override
    public E dequeue() {
        return slist.removeFirst();
    }
}