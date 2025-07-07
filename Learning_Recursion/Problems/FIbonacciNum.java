package idea.src.Learning_Recursion.Problems;
//inear recurence relation

import java.util.Scanner;

public class FIbonacciNum {
    public static void main(String[] args){
        System.out.println("enter the index which fibo num u want");
        Scanner input =new Scanner(System.in);
        int index= input.nextInt();
        int[] array=new int[index+1];

        int and = fibonum(index,array);

        System.out.println(and);
    }

    static int fibonum(int index,int[] array){

        if(index==0){
            array[0]=0;
            return 0;
        }else if(index==1){
            array[1]=1;
            return 1;
        }else{

            if(array[index-1]==0){
                array[index-1]=fibonum(index-1,array);
            }
            if(array[index-2]==0){
                array[index-2]=fibonum(index-2,array);
            }

            array[index]=array[index-1]+array[index-2];
            return array[index];
        }
    }

}
