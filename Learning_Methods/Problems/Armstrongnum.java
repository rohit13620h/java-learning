package idea.src.Learning_Methods.Problems;

import java.util.Scanner;

public class Armstrongnum {
    // 153 = 1cube + 5cube + 3 cube  for two digit no square
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();

        boolean b1 = armstrong(n);
        if(b1){
            System.out.println("The given number is an armstrong number "+n);
        }
        else{
            System.out.println("the given number is not an armstrong number");
        }
        System.out.println("any armstrong number less then the given number are : ");

        for(int j=0; j<n ; j++)
        {
            boolean b2 = armstrong(j);
            if(b2){
                System.out.println(j);
            }
        }

    }

    static int count(int n) {
        int i=0;
            do {
             i++;
             n=n/10;
            }while(n>0);
            return i;
    }

    static boolean armstrong(int j){
        int n = count(j);
        int a,b,c;
        double sum=0.0;
        b=j;
        for (int k =1;k<=n;k++){
            a=b%10;
            b=b/10;
            sum = sum + Math.pow(a,n);
        }
        c=(int)sum;
        if(c==j){
            return true;
        }
        else return false;
    }
}
