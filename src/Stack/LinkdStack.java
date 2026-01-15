package Stack;

import Singlylinkedlist.Singlylinkedlist;

public class LinkdStack<E> implements Stack<E> {
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
    public void push(E data) {
        slist.addFirst(data);
    }

    @Override
    public E top() {
        return slist.getFirst();
    }

    @Override
    public E pop() {
        return slist.removeFirst();
    }




    public void display(){
        slist.display2();
    }
}

