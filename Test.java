package idea.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        boolean[] boolvalue = {true, false, false};
        rotateboolvalue(boolvalue);
        System.out.println(Arrays.toString(boolvalue));
    }

    static void rotateboolvalue(boolean[] boolvalue) {
        boolean temp;
        int len = boolvalue.length;
        for (int i = 0; i < len; i++) {
            temp = boolvalue[i];
            boolvalue[i] = boolvalue[len - 1 - i];
            boolvalue[len - 1 - i] = temp;
            if (i == len - 1 - i) {
                break;
            }
        }
    }
}
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(101);
//        list.add(125);
//        list.add(238);
//        list.add(56);
//        list.add(568);
//        list.add(658);
//        System.out.println(list.size());
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 41;
//        arr[2] = 1;
//        arr[3] = 51;
//        arr[4] = 1;
//        arr[5] = 1;
//        arr[6] = 1;
//        arr[7] = 51;
//        arr[8] = 1;
//        arr[9] = 1;
//
//        int[] arr2 = new int[20];
//        arr2[17]=20;
//        System.arraycopy(arr,0,arr2,0,10);
////        arr=Arrays.copyOf(arr,20);
//
//        System.out.println(Arrays.toString(arr2));
////        arr[17]=9;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[17]);


//        arr2=arr.clone();
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2[17]);


