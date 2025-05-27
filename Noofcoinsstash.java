package idea.src;
import java.util.Scanner;
import java.util.Arrays;

public class Noofcoinsstash {
    static Scanner in = new Scanner(System.in);
    static int[] coins={10,6,1},coinamount=new int[coins.length];
    static int size=coins.length;
    static int amount,temp,min,num;

    static void calc() {

        loops(amount,num);
    }

    static int loops(int amount2,int num2){
        for(int i =0;i<size;i++){
            int amount3=amount2;
            int num3=num2;
            amount3=amount3-coins[i];
            num3++;

            if(amount3<0){
                continue;
            }
            if(amount3==0){
                min=Math.min(min,num3);
                continue;
            }
            if(amount3>0){
                loops(amount3,num3);
            }
        }
    return 0;
    }

    public static void main(String[] args) {

        System.out.println("enter the amount");
        amount = in.nextInt();
        min=amount;
        calc();
        System.out.println(min);

    }

}
