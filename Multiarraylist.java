package idea.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiarraylist {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        // ArrayList containing type ArrayList
        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();
//here each of the arraylist inside the arrraylist must be initialize

        for (int i =0;i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }


        System.out.println(list);
    }
}
