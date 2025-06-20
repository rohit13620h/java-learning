package idea.src;
//if matrix is sorted in rowwise and columnwise manner

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args){
        int[][] array = {{1,5,9},
                        {2,9,18},
                        {9,15,50}};
        int target = 15;

        System.out.println(Arrays.toString(search(array,target)));
    }
    static int[] search(int[][] array,int target){
        int[] result={-1,-1};
        int cols=0,rows=array.length-1,mid;
        while(rows>-1&&cols<array[0].length){
            if(array[rows][cols]==target){
                return new int[]{rows,cols};
            }
            if(array[rows][cols]<target){
                cols++;
            }else{
                rows--;
            }
        }
        return result;
    }

}
