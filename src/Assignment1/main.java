package Assignment1;

public class main {
    public static void main(String[] args) {

        /*Arrays########

        //object of Q1
        int [] arr1={1,2,3,4,5,6};
        Arrays copyArray=new Arrays();
        copyArray.cloneArray(arr1);
        //object of Q3
        Arrays removeArray=new Arrays();
        removeArray.removeElement(arr1,4);
        removeArray.Travesal(arr1);

*/
//SinglyLinkedList*******************
        //object for Q5
        /*SinglyLinkedList list1=new  SinglyLinkedList();
        SinglyLinkedList list2=new  SinglyLinkedList();
        SinglyLinkedList list3=new  SinglyLinkedList();

        list1.addLast(3);
        list1.addFirst(2);
        list1.addFirst(1);
        list2.addLast(6);
        list2.addFirst(5);
       list2.addFirst(4);
        System.out.print("The linkedlist1=");
        list1.travesal();
        System.out.print("The linkedlist2=");
        list2.travesal();
        System.out.println("Linked lists after concatenation:");
        list1.concatenate(list2);
        list1.travesal();*/

//object for Q7
       /* SinglyLinkedList List4=new SinglyLinkedList();
        List4.addFirst(3);
        List4.addFirst(2);
        List4.addFirst(1);
        List4.addLast(4);
        int result =List4.searchElement(3);
        if (result!=-1)
            System.out.println("The position is "+result);
        else
            System.out.println("The position is not found ");

// answer of Q9
      List4.removeAtPosition(1);
        System.out.println("the list after removing");
        List4.travesal();
*/
        //Object for Q11
        /*DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(20);
        dlist.addFirst(30);
        dlist.addFirst(40);
        dlist.addFirst(50);
        dlist.ReversDisplay();*/

        //Obj of the CircularLinedlist
        CircularLinkedList<String> clist=new CircularLinkedList<String>();
        clist.addFirst("D");
        clist.addFirst("N");
        clist.addFirst("H");
        //Q13
        clist.insertAtPosition("E",1);
        clist.display();
        //answer of Q15
        clist.search("N");
        clist.search("l");






    }
}
