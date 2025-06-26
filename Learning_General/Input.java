package idea.src.Learning_General;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("enter any number:");
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        Scanner ii = new Scanner(System.in);
        System.out.print("enter your age  : ");
        System.out.println(ii.nextInt());
        System.out.println(n);
        System.out.println("yout num is " + n);


        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        //we donot need to use two line of scanner funtion
        int a = input.nextInt();
        int b = input.nextInt();
        int s = a + b;
        System.out.println("the sum is " + s);
// this will work for num1 enter and num2 enter AND  num1 num2 also  since it takes next int

    }
}

