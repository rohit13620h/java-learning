package idea.src;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    /* syntax

    ArrayList<Integer> list =  new ArrayList<Integer>(default size);
    or
    ArrayList<Integer> list =  new ArrayList<>(default size);
    or
    ArrayList list =  new ArrayList(default size);

    list.add(data); as much as u want
    list.add(data);

    //to print the content of the list
        System.out.println(list);

        //to use the methodes in ArrayList class
        list."the name of the method like set,remove,add,get"

        //to take input into the ArrayList
        list.add(input.nextInt);

     */


    ArrayList<Integer> list =  new ArrayList<>(10);


    list.add(56);
    list.add(50);
    list.add(25);
    list.add(90);
    list.add(88);
    list.add(556);

    System.out.println(list);
    list.set(0,41);//it means that change the data in 0th index to 41
    list.remove(1);//remove data in 1st index
    list.set(2,555);
    System.out.println(list);
    list.add(input.nextInt());
    System.out.println(list);
    list.set(0,input.nextInt());
    System.out.println(list);

    for(int i =0;i<5;i++){
        System.out.println(list.get(i));// .get is used to get the element fo the specific location
    }


}

}
