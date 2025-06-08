package idea.src;

import java.util.Arrays;

public class CopyingArray {

    // inbuilt funtions to copy one array to another

//        newarray=array.clone();
//        newarray = originalarray.clone();  but it will make the new array have same capacity as original

//        System.arraycopy(array,0,newarray,0,n);
//        System.arraycopy(originalarray,starting-position-original(the staring position in original array from where you want to copy),newarray,starting-postion-new(starting postion in new arr from where you want to start pasting data),length(the length of data you want to copy))
//        this does not change the size fo new array instead it remains same
//        also index other then the index where data is copied if hold data remain unchanged

//        newarray = Arrays.copyOf(array, n);
//        newarray = Arrays.copyOf(originalarray,size of new array)
//        we can decide what size to give to the new array









//    public static void main(String[] args) {
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
//        arr=Arrays.copyOf(arr,20);

//        System.out.println(Arrays.toString(arr2));
//        arr[17]=9;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[17]);


//        arr2=arr.clone();
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2[17]);
//    }
}
