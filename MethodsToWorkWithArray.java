package idea.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsToWorkWithArray {


    // to get an array of up to infinite(like arraylist)
    static int[] getvalueinfinite() {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int[] array = new int[n];

        System.out.println("enter the integer and to stop enter non numeric value");
        for (int i = 0; i >= 0; i++) {
            try {
                array[i] = in.nextInt();
            } catch (InputMismatchException e) {
                in.next();
                n = i;// to remove the excess zeros
                break;
            }
            if (i == n - 1) {
                array = Arrays.copyOf(array, n * 2);
                n = n * 2;
            }
        }
        return Arrays.copyOf(array,n);
        //return array;
    }

    // to get a sorted array
    static int[] arrangedata(int[] array){
        int[] returnarray = new int[array.length];
        for(int i = 0 ; i < array.length-1 ; i++){
            returnarray[i]=0;
            for(int j = i+1 ; j < array.length ; j++){
                returnarray[i]=Math.min(returnarray[i],array[j]);
            }
        }
        return returnarray;
    }

    static int binarysearch(int[] array,int target){
        int start = 0 , end = array.length-1,mid;
        while(true){
            mid=start+(end-start)/2;
            if(start>end){
                return -1;
            }
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

    }

    static int[] negatearray(int[] array){
        for(int i = 0 ; i < array.length; i++){
            array[i]*=(-1);
        }
        return array;
    }

    static int[] addarrays(int[] first,int[] second){
        int size1 = first.length,size2 = second.length;
        int[] result=new int[size1+size2];
        System.arraycopy(first,0,result,0,size1);
        System.arraycopy(second,0,result,size1,size2);
        return result;
    }

    static int[] converttoarray(ArrayList<Integer> lsit){
        int size = lsit.size();
        int[] array = new int[size];
        for(int i =0 ; i<size; i++){
            array[i]= lsit.get(i);
        }
        return array;
    }



}
