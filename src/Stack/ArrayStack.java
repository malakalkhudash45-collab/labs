package Stack;
public class ArrayStack<E>  implements Stack<E>{
    E arr[];
    static final int CAPICITY=1000;
    private int Top=-1;

    public ArrayStack() {
        arr= (E[]) new Object[CAPICITY];

    }
    public ArrayStack(int c) {
        arr= (E[]) new Object[c];


    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void push(E data) {

    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }
}
