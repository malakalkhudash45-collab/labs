package Assignment1;

public class SinglyLinkedList <E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //Q5 :concatenate lists
    public void concatenate(SinglyLinkedList<E> list2) {
        if (isEmpty())
            head = list2.head;

        else
        {
            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.next = list2.head;
        }

    }
    //Q7:searching for an element
    public int searchElement (E key){
        Node<E> tmp=head;
        int position=0;
        while(tmp!= null){
            if(tmp.getData()==key)
                return position;

            tmp=tmp.getNext();
            position++;
        }
        return-1;
    }
    // Q9 :remove a specific position
    public void removeAtPosition(int position){
        if(isEmpty()){
            System.out.println("The linked list is empty");
            return;}
        if(position==0) {
            if (head == tail)
                head = null;
            else
                head = head.getNext();
            return;
        }
        Node<E> current = head;


        for (int i = 0; i < position - 1; i++) {
            if (current.getNext() == null) {
                System.out.println("invalid position");
                return;
            }
            current = current.getNext();
        }


        if (current.getNext() == null) {
            System.out.println("invalid position");
            return;
        }

        if (current.getNext() == tail) {
            tail = current;
        }

        current.next= current.getNext().getNext();




    }


    //Method for adding elements
    public void addFirst(E data){
        Node<E> newNode=new Node(data,head);
        head=newNode;
        if (isEmpty()){
            tail=newNode;
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node(data, null);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    //Method for travsaling
    public void travesal() {
        Node<E> temp = head;
        while (temp != null){
            System.out.print(temp.getData() + "--->");
            temp=temp.getNext();
        }
        System.out.print("null");
        System.out.println();
    }


    class Node<E> {
        private E data;
        private Node<E> next;

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}