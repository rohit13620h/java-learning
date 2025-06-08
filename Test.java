package idea.src;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 41;
        arr[2] = 1;
        arr[3] = 51;
        arr[4] = 1;
        arr[5] = 1;
        arr[6] = 1;
        arr[7] = 51;
        arr[8] = 1;
        arr[9] = 1;

        int[] arr2 = new int[20];
        arr2[17]=20;
        System.arraycopy(arr,0,arr2,0,10);
//        arr=Arrays.copyOf(arr,20);

        System.out.println(Arrays.toString(arr2));
//        arr[17]=9;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[17]);


//        arr2=arr.clone();
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2[17]);
    }
}

