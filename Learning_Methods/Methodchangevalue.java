package idea.src.Learning_Methods;

import java.util.Arrays;

public class Methodchangevalue {
    public static void main(String[] args) {
int [] arr={1,2,3,5,6};
change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0]=60;
    }

}
