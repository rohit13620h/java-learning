package idea.src.Learning_Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {1,6,2,8,3,5};
        bubblesort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {5,6,8,95,2};
        selectionsort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {555,92,62,8,9,65};
        selectionsortmin(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {555,92,62,8,9,65};
        insertionsort(array4);
        System.out.println(Arrays.toString(array4));

        int[] array5 = {3,1,2,5,4};
        cyclesort(array5);
        System.out.println(Arrays.toString(array5));
    }



    static void cyclesort(int[] array){
        //cycle sort sorts data of int type and strictly from 1 to n
        //i can also take.length and can by using one for look create data from 1 to n -2 but that might not be ideal when working with data
        int n=0;
        while(n<array.length-1){
            if(array[n]!=n+1){
                swap(array,n,array[n]-1);
            }else{
                n++;
            }

        }
    }

    static void insertionsort(int[] array){
        for(int i = 0 ; i < array.length-1;i++){
            for(int j =i+1;j>0;j--){
                if(array[j-1]>array[j]){
                    swap(array,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    static void selectionsortmin(int[] array){
            for(int j = 0;j< array.length;j++){
                int start=j;
                int last=array.length-1;
                int minindex=findindexofminimum(array,start,last);
                swap(array,minindex,start);
            }
    }
    static int findindexofminimum(int[] array, int start,int last){
        int index=start,min=array[index];
        for(int i = start ; i<=last ; i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }

    static void selectionsort(int[] array){
        //in selection sort maximum or minmun num is found and replaced with last or initial index
        for(int i = 0; i<array.length-1 ; i++){
            int last=array.length-1-i;
            int maxindex=findindexofmaximum(array,last);
            swap(array,maxindex,last);
        }
    }
    static int findindexofmaximum(int[] array, int last){
        int max=array[0],index=0;
        for(int i = 0 ; i<last ; i++){
            if(array[i]>max){
                max=array[i];
                index=i;
            }
        }
        return index;
    }
    static void swap(int[] array,int index,int last){
        int temp=array[index];
        array[index]=array[last];
        array[last]=temp;
    }

    static void bubblesort(int[] array){

//also known as sinking sort or exchange sort
//inplane sorting algorithm i.e no need to create new array and coppying data or constand space complexity

        int temp=0;
        boolean check=false;
        for(int i = 0 ; i < array.length-1;i++){
            for(int j = 0 ; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    check=true;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(!check){
                break;
            }
        }

    }
}
