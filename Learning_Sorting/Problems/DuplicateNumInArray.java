package idea.src.Learning_Sorting.Problems;

import java.util.Arrays;
import java.util.ArrayList;

public class DuplicateNumInArray {
    public static void main(String[] args){
        int[] array = {9,6,7,7,5,4,2,2,1};
        sort(array);
        System.out.println(Arrays.toString(search(array)));
    }
    static void sort(int[] array){
        int i =0;
        while(i<array.length){
            if(array[array[i]-1]!=array[i]){
                swap(array,i,array[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] array,int i1,int i2){
        int temp=array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }
    static int[] search(int[] array){
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0 ; i<array.length;i++){
            if(array[i]!=i+1){
                list.add(array[i]);
            }
        }
        int[] newarr= new int[list.size()];
        for(int i = 0;i<list.size();i++){
            newarr[i]=list.get(i);
        }
        return newarr;
    }
}
