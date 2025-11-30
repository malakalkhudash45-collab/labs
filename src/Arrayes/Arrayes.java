package Arrayes;

import java.util.Scanner;

public class Arrayes {
     Scanner input=new Scanner(System.in);

    public void Travesal(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("Index[" + i + "]" + " = " + a[i]);
    }
public void Travesal2(int []a){
    for(int e :a)
        System.out.println(e);
    }
public void input(int []a){
    System.out.println("enter"+a.length+"numbers:");
    for (int i=0; i< a.length;i++)
        a[i]=input.nextInt();
    }
public void update(int []a,int index, int nvalue){
        if(index<0 || index >=a.length)
            System.out.println("Index not found");
        else
            a[index]=nvalue;
    }
    public void delete(int []a,int index){
        if(index<0 || index >=a.length)
            System.out.println("Index not found");
        else
            a[index]=0;
    }
}

