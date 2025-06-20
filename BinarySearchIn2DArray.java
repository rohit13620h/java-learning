package idea.src;

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

        return result;
    }

}
