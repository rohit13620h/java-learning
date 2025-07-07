package idea.src.Learning_Recursion.Problems;
//divide and concuer recurence relation

import java.util.Arrays;

public class BinarySearchWithRecursion {
    public static void main(String[] args){
        int[] array={6,5,9,8,3,2,46,1,3,56,9,13,9,32,356,23};
        int target = 356;
        sort(array);
        int index=Bsearch(array,target,0,array.length-1);
        System.out.println(Arrays.toString(array));
        System.out.println(index);

    }
    static void sort(int[] array){
        for(int i =0 ;i<array.length-1;i++) {
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] array,int n , int m){
        int temp = array[n];
        array[n]= array[m];
        array[m]=temp;
    }
    static int Bsearch(int[] array,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]>target){
            return Bsearch(array,target,start,mid-1);
        }
        return Bsearch(array,target,mid+1,end);
    }
}
