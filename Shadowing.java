
public class Shadowing{
    static int a = 90;// the value is available for the code inside shadowing{ ,and will be shadowed at line a=...
    static int b = 40;
    public static void main(String[] args) {
        System.out.println(a);
        int a=900; // local scope  // you should initialize it again to not modify the original value
        // shadowing stats after declaring the variale and we must initilize it by giving a value
        /* i.e. int a;  declaring
                sout(a); will give error
                a=9;    initializing
                sout(a); will be able to execute
         */
        a=59;
        System.out.println(a);
        b=0;
        scope();
        scope();
    }


    static void scope() {
        System.out.println(a);
        System.out.println(b);
    }
}
