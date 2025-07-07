package idea.src.Learning_String;

import java.util.ArrayList;
import java.lang.String;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+5);
        System.out.println("a"+9+0);

        System.out.println("hellow" + new ArrayList<>());
        //it will work because + operator on ly work with primitives or atleast one is string
        //u can add "" so we can add two objects which or not string to

        System.out.println(new ArrayList<>());
        System.out.println(new int[2]);

        System.out.println("a"=="a");
        System.out.println("a".equals("a"));

        System.out.println("a"==new String("a"));
        System.out.println("a".equals(new String("a")));
    }
}
