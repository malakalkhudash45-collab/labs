package Assignment1;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    public DoublyLinkedList() {
        head=new Node(null,null,null);
        tail=new Node(head,null,null);
        head.setNext(tail);

    }

    public void addbetween(E data, Node<E> left, Node<E> right) {
        Node<E> newNode = new Node<E>(left, data, right);
        left.setNext(newNode);
        right.setPre(newNode);
    }

    public void addFirst(E data) {
        addbetween(data, head, head.getNext());
    }
    //Q11
    //Displaying elements in reverse
    public void ReversDisplay() {

        Node<E> temp = tail;
        System.out.print("null<---tail");
        while (temp != head) {
            System.out.print("<---->"+temp.getData());
            temp = temp.getPre();
        }
        System.out.print("-->head");

    }

}


class Node<E>{
    private Node<E> pre;
    private E data;
    private Node<E> next;

    public Node(Node<E> pre, E data, Node<E> next) {
        this.pre = pre;
        this.data = data;
        this.next = next;
    }

    public Node<E> getPre() {
        return pre;
    }

    public E getData() {
        return data;
    }

    public void setPre(Node<E> pre) {
        this.pre = pre;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }
}