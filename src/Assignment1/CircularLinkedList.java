package Assignment1;

public class CircularLinkedList<E> {
    private int size;
    private CNode<E> tail;

    public CircularLinkedList() {
        size = 0;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void addFirst(E data) {
        if (isEmpty()) {
            CNode<E> newNode = new CNode(data, null);
            tail = newNode;
            newNode.setNext(tail);
        } else {
            CNode<E> newNode = new CNode(data, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void display() {

        CNode<E> temp = tail.getNext();
        do {
            System.out.print(temp.getData() + "--->");
            temp = temp.getNext();

        } while (temp != tail.getNext());
        System.out.println("go first(" + temp.getData() + ")");

    }
    //ananswer of Q 13
    public void insertAtPosition(E data, int position) {

        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (isEmpty()) {
            CNode<E> newNode = new CNode<>(data, null);
            tail = newNode;
            newNode.setNext(tail);
            size++;
            return;
        }

        if (position == 0) {
            addFirst(data);
            return;
        }

        CNode<E> temp = tail.getNext();

        for (int i = 0; i < position - 1; i++) {
            temp = temp.getNext();
        }


        CNode<E> newNode = new CNode<>(data, temp.getNext());
        temp.setNext(newNode);


        if (position == size) {
            tail = newNode;
        }

        size++;
    }


    //answer of Q 15
    //Searching for an element
    public E search(E data) {
        if (isEmpty()) return null;
        CNode temp = tail.getNext();
        do{
            temp=temp.getNext();
        }

        while (temp != tail.getNext()); {
            if (temp.getData() == data)
                System.out.println("The element is in the list");
            else {
                System.out.println("The element dose not exist");
            }
        }
        return data;
    }
}


class CNode<E> {
    private E data;
    private CNode<E> next;

    public CNode(E data, CNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public CNode<E> getNext() {
        return next;
    }

    public void setNext(CNode<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}