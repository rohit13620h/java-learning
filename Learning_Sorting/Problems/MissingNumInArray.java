package idea.src.Learning_Sorting.Problems;

import java.util.Arrays;

public class MissingNumInArray{
    public static void main(String[] args){
        int[] array = {2,3,1,4,7,8,5,3,2};
        sort(array);
        System.out.println(Arrays.toString(search(array)));
    }

    static int[] search(int[] array){
        int n = 0;
        int[] missnum=new int[n];
        for(int i = 1 ; i<array.length ; i++){
            if(array[i]!=i+1){
                n++;
                missnum=Arrays.copyOf(missnum,n);
                missnum[n-1]=i+1;
            }
        }
        return missnum;
    }
    static void sort(int[] array){
        int i = 0;
        while(i<array.length){
            if(array[i]<array.length && array[array[i]-1]!=array[i]){
                swap(array,i,array[i]-1);
            }else{
                i++;
            }
//            if(array[array[i]-1]==array[i]){
//                i++;
//                continue;
//            }
//            if(array[i]-1==i){
//                i++;
//            }else{
//                swap(array,array[i]-1,i);
//            }
        }
    }
    static void swap(int[] array, int i , int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
