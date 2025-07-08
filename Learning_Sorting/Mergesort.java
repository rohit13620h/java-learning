package idea.src.Learning_Sorting;

import java.util.Arrays;

public class Mergesort{
    public static void main(String[] args){
        int[] array = {55,6,9,63,54,645,12,354,213,4};

        mergesort(array);
        System.out.println(Arrays.toString(array));

    }
    static void mergesort(int[] array){
        int start=0,end=array.length-1;
        int[] copyarray=array.clone();
        dividearray(array,copyarray,start,end);

    }
    static void dividearray(int[] array,int[] copyarray,int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        dividearray(array,copyarray,start,mid);
        dividearray(array,copyarray,mid+1,end);

        merge(array,copyarray,start,mid,end);
        System.arraycopy(copyarray,start,array,start,end-start+1);
    }
    static void merge(int[] array,int[] copyarray,int start,int mid,int end){
        int lowstart=start,lowend=mid,highstart=mid+1,highend=end;
        for(int i=start;i<=end;i++){

            if(lowstart>lowend){
                copyarray[i]=array[highstart];
                highstart++;
                continue;
            }else if(highstart>highend){
                copyarray[i]=array[lowstart];
                lowstart++;
                continue;
            }

            if(array[lowstart]>array[highstart]){
                copyarray[i]=array[highstart];
                highstart++;
            }else{
                copyarray[i]=array[lowstart];
                lowstart++;
            }
        }

    }
}