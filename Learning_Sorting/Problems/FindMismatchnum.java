package idea.src.Learning_Sorting.Problems;
//given a array from 1 to n but one num is duplicated and another is missing find both

import java.util.Arrays;

public class FindMismatchnum {
    public static void main(String[] args){
        int[] array = {9,3,2,8,5,6,4,1,1};
        sort(array);
        System.out.println(Arrays.toString(search(array)));
    }
    static int[] search(int[] array){
        for(int i =0;i<array.length;i++){
            if(i+1!=array[i]){
                return new int[] {array[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void sort(int[] array){
        int i = 0;
        while(i<array.length){
            if(array[array[i]-1]!=array[i]){
            swap(array,i,array[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] array,int first,int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}
