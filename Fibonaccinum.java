import java.util.Scanner;

public class Fibonaccinum {
    public static void main(String[] args) {
        //fibonaccin number : 0,1,1,2,3,5,8,13,21,34,....
        //basically the series of number in which the next number is the sum of the two numbers earlier
        int a = 0, b = 1, c, d, big, n, u=0;
        Scanner input = new Scanner(System.in);
        System.out.println("how many fibonacci numbers do u need");
        c = input.nextInt();
        System.out.println("any specific position fibonacci number you need");
        n = input.nextInt();
        d = a;
       big= Math.max(n,c);
//        big = c;
//        if (n > c) {
//            big = n;
//        }
        for (int i = 1; i <= big; i++) {
            if (i <= c) {
                System.out.print(" " + d);
            }
            if (i == n) {
                u = d;
            }
            d = a + b;
            a = b;
            b = d;

        }
        System.out.println();
        if(n!=0) {
            System.out.println("the" + ' ' + n + "th fibonacci number is " + u);
        }
    }
}
