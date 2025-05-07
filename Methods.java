import java.util.Scanner;

//funtion are methods

public class Methods {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int num1,num2,sum;
//
//        System.out.println("enter the first number");
//        num1 = in.nextInt();
//        System.out.println("enter the second number");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("the sum : " + sum);
//
//        System.out.println("enter the first number");
//        num1 = in.nextInt();
//        System.out.println("enter the second number");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("the sum : " + sum);
//
//        System.out.println("enter the first number");
//        num1 = in.nextInt();
//        System.out.println("enter the second number");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("the sum : " + sum);
sum();

    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("enter the first number");
        num1 = in.nextInt();
        System.out.println("enter the second number");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("the sum : " + sum);
        return sum ;
    }
}
