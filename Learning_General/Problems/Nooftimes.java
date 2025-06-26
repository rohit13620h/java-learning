package idea.src.Learning_General.Problems;

import java.util.Scanner;
// I HAVE NO IDEA WHAT I WAS DOING
//SOMTHING IS WRONG WITH IT
public class Nooftimes {

    public static void main(String[] args) {
        int N0 = 0, N1 = 0, N2 = 0, N3 = 0, N4 = 0, N5 = 0, N6 = 0, N7 = 0, N8 = 0, N9 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the set of number  from 0 to 9 :  ");
        String s = input.nextLine();
        int k = 0, n = 1;
        char c = s.charAt(k);
        if (c != (char) 0) {
            for (int i = 0; i < n; i++) {
                c = s.charAt(k);
                int a = c;
                if (a >= 48 && a <= 57) {
                    if (a == 48) {
                        N0 = N0 + 1;
                    } else if (a == 49) {
                        N1 = N1 + 1;
                    } else if (a == 50) {
                        N2 = N2 + 1;
                    } else if (a == 51) {
                        N3 += N3;
                    } else if (a == 52) {
                        N4 += N4;
                    } else if (a == 53) {
                        N5++;
                    } else if (a == 54) {
                        N6++;
                    } else if (a == 55) {
                        N7++;
                    } else if (a == 56) {
                        N8++;
                    } else {
                        N9++;
                    }
                }
                n++;
                k = k + 1;
            }

        System.out.println("the number 0 is repeated " + N0);
        System.out.println("the number 1 is repeared " + N1);
        System.out.println("the number 2 is repeared " + N2);
        System.out.println("the number 3 is repeared " + N3);
        System.out.println("the number 4 is repeared " + N4);
        System.out.println("the number 5 is repeared " + N5);
        System.out.println("the number 6 is repeared " + N6);
        System.out.println("the number 7 is repeared " + N7);
        System.out.println("the number 8 is repeared " + N8);
        System.out.println("the number 9 is repeared " + N9);
    }
    }
}