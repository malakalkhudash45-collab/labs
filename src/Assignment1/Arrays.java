package Assignment1;

public class Arrays {
    //Q1 : A program to clone an array
    public int cloneArray(int[] original) {
        int[] cloned = original.clone();
        System.out.println("Cloned Successfully");
        for (int e : cloned) {
            System.out.println(e);
        }
        return 0;

    }

    //Q3 : A program for removing a specific element
    public void removeElement(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Enter a number between 0 and less than " + a.length);

        else
            a[index] = 0;
    }
    //Method for Travesal
    public void Travesal(int []arr){
        for (int i=0 ; i<arr.length ;i++){
            System.out.println("["+i+"]"+"="+arr[i]);
        }
    }

}
