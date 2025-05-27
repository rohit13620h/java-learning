// to give coin value and a amount and find the smallest no of coin needed

package idea.src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Noofcoins {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Integer> coins = new ArrayList<>(10);
    static int size;
    static int amount;

    public static void main(String[] args) {
        System.out.println("enter the coin amounts and no numeric value aat the end");

        getcoinvalue();

//        transfertoarray();

        size = coins.size();

        System.out.println("enter the amount");

        amount = in.nextInt();


        System.out.println();

    }
    static void getcoinvalue(){
        while(true){
            coins.add(in.nextInt());
        }
    }
}