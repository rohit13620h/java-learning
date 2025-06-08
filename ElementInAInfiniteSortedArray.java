package idea.src;
//postion of an element in an infinite array

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ElementInAInfiniteSortedArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] givenarray = getvalue();

        arrangedata(givenarray);

        System.out.println("enter the element you want to search for");
        int target = in.nextInt();

        int position = elementposition(givenarray,target);


        System.out.println(Arrays.toString(givenarray));
        System.out.println(position);
    }

    static int[] getvalue() {
        int n = 1;
        int[] array = new int[n];

        System.out.println("enter the integer and to stop enter non numeric value");
        for(int i = 0 ; i >=0 ; i++) {
            try {
                array[i] = in.nextInt();
            } catch (InputMismatchException e) {
                in.next();
                n=i;// to remove the excess zeros
                break;
            }
            if (i == n-1) {
                array = Arrays.copyOf(array, n*2);
                n = n * 2;
            }
        }
        return Arrays.copyOf(array,n);
    }

    static void arrangedata(int[] array){
        for(int i = 0 ; i < array.length-1 ; i++){
            int temp=0;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
    }

    static int elementposition(int[] array,int target){
        int n = 0,m=0;

        while(true){
//         if(array[m]=='\0'){
//             m=m-1;
//         }else{
             if(array[m]<target){
                 if(array[m+1]>=Integer.MIN_VALUE){
                     n=m+1;
                     m=m+1;
                 }else{
                     return -1;
                 }
             }else{
                 int mid;
                 while(true){
                     mid=n+(m-n)/2;
                     if(n>m){
                         return -1;
                     }
                     if(array[mid]==target){
                         return mid;
                     }else if(array[mid]<target){
                         n=mid+1;
                     }else{
                         m=mid-1;
                     }
                 }
             }
//         }
        }
    }
}
