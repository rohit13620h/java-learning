package idea.src.Learning_String;

import java.lang.String;

public class StringGeneral {
    public static void main(String[] args) {

        int n = 9;
        System.out.println("the num is " + n);
        System.out.printf("the num is %d",n);

        //u can use printf and do like c prog

        String str = "hellow orld";
        String strr= "hello world";
        System.out.println("the string is "+str);
        System.out.printf("the string is %s but not %s %n" , str ,strr);

        Float fnum = 3.456789f;
        System.out.println("the fnum is " +fnum);
        //OR
        System.out.printf("The num is %f%n",fnum);
        System.out.printf("the factored num is %.3f%n",fnum);


    }
}
