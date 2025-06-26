package idea.src.Learning_Loops;

import java.util.Scanner;
// infinite loop of simple calculator
public class Infinitelooop {
    public static void main(String[] args) {
        float a, b, s = 0;
        char c, ch;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the first number");
            a = input.nextFloat();
            System.out.println("enter the operator from +,-,*,/");
            c = input.next().trim().charAt(0);
            System.out.println("enter the second number");
            b = input.nextFloat();
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (c == '+') {
                    s = a + b;
                }
                if (c == '-') {
                    s = a - b;
                }
                if (c == '*') {
                    s = a * b;
                }
                if (c == '/') {
                    s = a / b;
                }
                if (s==(int)s){
                    System.out.println((int)s);
                }
                else
                System.out.println(s);
            } else {
                System.out.println("invalid input");
            }
            System.out.println("enter anything except x,X to continue");
            ch = input.next().trim().charAt(0);

            if (ch == 'x' || ch == 'X')
                break;
        }
    }

}
