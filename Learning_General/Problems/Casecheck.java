package idea.src.Learning_General.Problems;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.println("enter the letter");
        Scanner c = new Scanner(System.in);
       char s = c.next().trim().charAt(0);
       // trim remove the extra space
        //this takes string input , it will convert into char using charAt(0) method

     /* my way
        int i = (int) s;

        if (i<97){
            System.out.println("the letter is uppercase");
        }
        if (i>=97){
            System.out.println("the leter is lowercase");
        } */
//bit wise opeators &&(and) || (or) !=(not equalto)
        if (s>='a' && s<='z'){
            System.out.println("the leter is lowercase");
        }
        if (s>='A' && s<='Z'){
            System.out.println("the letter is uppercase");
        }else System.out.println("invalid input");
    }

}
