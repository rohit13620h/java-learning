
import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        // S must be capital letter and sout enter
        System.out.println("hello world");
        /*println if u want next print in next line but if u want output from different lines of code combined then print only will also work
        System.out.print("hehe finally");
        System.out.println("jelli");
        this will give hehe finallyjelli and next print will be in next line
         */
        System.out.println("enter your age");
        Scanner input = new Scanner(System.in);
        //it takes input from keyboard *i knbow that for now
        System.out.println(input.nextInt());
        /*input.next() takes the input
        nextint only takes integer
        next can take string or char but only first word of sentence
        nextline is also for string or char and takes whole sentence
        nextFloat for float and so on
        */
            System.out.println("give me an sentence");
        Scanner i = new Scanner(System.in);
        System.out.println(i.nextLine());


    }
}
