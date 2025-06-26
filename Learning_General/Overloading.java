package idea.src.Learning_General;

public class Overloading {
//funtion overloading happen if two funtion have same name  for funtion overloading to work either the typeof arg or no of arg must be different
    public static void main(String[] args) {

        same(64);
        same("same");
        same(64,4);

    }

    static void same(int a){
        System.out.println(a);
    }
    static void same(int b,int c ){
        System.out.println(b+c);
    }
    static void same(String s){
        System.out.println(s);
    }

}
