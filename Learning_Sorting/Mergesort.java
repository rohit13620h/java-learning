package idea.src.Learning_Sorting;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] array = {9,6,0,3,98,65};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array,int start,int end){
        if(end==start){
        }else if(end-start==1){
            if(array[start]>array[end]){
                swap(array,start,end);
            }
        }else{
            int size=end-start+1;
            int mid =  start+(end-start)/2;
            int[] newarray=array.clone();
            sort(newarray,0,mid-1);
            sort(newarray,mid,size-1);
            merge(array,newarray,start,mid-1,mid,size-1);
        }
    }

    static void merge(int[] array,int[] newarray,int lowstart,int lowend, int highstart,int highend){
        for(int i = 0 ; i<=highend ; i++){
            if(lowstart==lowend+1){
                array[i]=newarray[highstart];
                highstart++;
                continue;
            }else if(highstart==highend+1){
                array[i]=newarray[lowstart];
                lowstart++;
                continue;
            }
            if(newarray[lowstart]>newarray[highstart]){
                array[i]=newarray[highstart];
                highstart++;
            }else{
                array[i]=newarray[lowstart];
                lowstart++;
            }
        }
    }

    static void swap(int[] array,int index,int last){
        int temp=array[index];
        array[index]=array[last];
        array[last]=temp;
    }
}
