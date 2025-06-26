package idea.src.Learning_Search.Problems;
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

        int position = getrange(givenarray,target);

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
            int temp;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
    }

    static int getrange(int[] array,int target){
        int start = 0,end=1;
        while(true){
            if(check(end,array) || target<=array[end]){
                return binarysearch(array,target,start,end);
            }else{
                start=end+1;
                end=2*end;
            }
        }
    }

    static boolean check(int index,int[] array){
        try{
            int i =array[index];
            return false;

        }catch(ArrayIndexOutOfBoundsException e){
            return true;
        }
    }

    static int binarysearch(int[] array,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if (check(mid,array)) {
                end=mid-1;
                continue;
            }
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
