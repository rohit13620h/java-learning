package idea.src.Learning_Recursion.Problems;
//inear recurence relation

import java.util.Scanner;

public class FIbonacciNum {
    public static void main(String[] args){
        System.out.println("enter the index which fibo num u want");
        Scanner input =new Scanner(System.in);
        int index= input.nextInt();
        int and = fibonum(index);

        System.out.println(and);
    }

    static int fibonum(int index){
        if(index==0){
            return 0;
        }else if(index==1){
            return 1;
        }else{
            return fibonum(index-1)+fibonum(index-2);
        }
    }

}
