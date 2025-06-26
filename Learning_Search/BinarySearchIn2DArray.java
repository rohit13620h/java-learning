package idea.src.Learning_Search;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args){

        int[][] array = {{1,5,9},
                         {2,9,18},
                         {9,15,50}};
        int target = 15;

        int[] result=search(array,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] array,int target){
        int[] result = {-1,-1};
        int cols=0,srows=0,erows=array.length-1,mid;
        while(srows!=erows){
            mid=srows+(erows-srows)/2;
            if(array[mid][cols]==target){
                return new int[] {mid,cols};
            }else if(array[mid][cols]>target){
                erows=mid;
            }else{
                srows=mid+1;
            }
        }
        result=binarysearch(array[srows],srows,target);

        return result;
    }

    static int[] binarysearch(int[] array,int rows,int target){
        int start = 0 , end = array.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(array[mid]==target){
                return new int[] {rows,mid};
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
