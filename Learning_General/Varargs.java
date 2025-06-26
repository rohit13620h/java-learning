package idea.src.Learning_General;

import java.util.Arrays;

//variable length arguments when we do not know how many input we are giving
public class Varargs {

    public static void main(String[] args) {
sun(1,2,5,8,9,87,56);
    }
    static void sun(int ...N){
        System.out.println(Arrays.toString(N));
    }
}
