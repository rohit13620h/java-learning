// to give coin value and a amount and find the smallest no of coin needed and what coin needed
// it is not very memory firendly may crash if many coins and big amount used
package idea.src.Learning_Methods.Problems;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Noofcoins {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Integer> coins = new ArrayList<>(10);
    static int size,min=Integer.MAX_VALUE;
    static int[] coincount,coincount2;

    public static void main(String[] args) {
        System.out.println("enter the coin amounts and non-numeric value at the end");

        getcoinvalue();
        size = coins.size();
        coincount=new int[size];
        coincount2=new int[size];
        arrangecoinvalue(); //was not needed but might need for improving time complexity

        System.out.println("enter the amount");
        int amount = in.nextInt();

        calc(amount,0,coincount);

        ansprint();

    }
    static void getcoinvalue(){
        while(true){
            try{
                coins.add(in.nextInt());
            }catch(InputMismatchException e){
                in.next();
                break;
            }

        }
    }

    static void arrangecoinvalue(){
        int temp;
        for (int i =0; i<size-1 ; i++ ){
            for(int j = 1; j<size ; j++){
                temp=coins.get(i);
                if(temp<coins.get(j)){
                    coins.set(i,coins.get(j));
                    coins.set(j,temp);
                }
            }
        }
        System.out.println(coins);
    }

    static void calc(int amount,int num,int[] coincount){
        for(int i = 0;i<size;i++){
            int amount2 = amount;
            int num2 = num;

            for(int j = 0;j<size;j++){
                coincount2[j]=coincount[j];
            }

            amount2=amount2-coins.get(i);
            num2++;
            coincount2[i]++;

            if(amount2<0){
                continue;
            }
            if(amount2==0){
                min=Math.min(min,num2);
                toFindWhichCoinsNeeded(coincount2);
            }
            if(amount>0){
                calc(amount2,num2,coincount2);
            }
        }
    }

    static void toFindWhichCoinsNeeded(int[] coincount2){
        int sum=0;
        for(int i : coincount2){
            sum=i+sum;
        }
        if(sum==min){
            coincount=toCopyOneArrayToAnother(coincount2);
        }
    }

    static int[] toCopyOneArrayToAnother(int[] arr){
        int[] arrtoreturn=new int[size];
     for(int i = 0 ; i<size ; i++){
      arrtoreturn[i]=arr[i];
     }
      return arrtoreturn;
    }

    static void ansprint(){
        System.out.println("The minimum no of coins needed is " + min);
        System.out.println("The needed coins are :");
        for(int i=0;i<size;i++){
            if(coincount[i]>0){
                System.out.println(coincount[i]+" of "+coins.get(i));
            }
        }
    }
}