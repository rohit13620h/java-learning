package idea.src.Learning_Loops;

import java.util.Arrays;

public class Loopwitharray {
    public static void main(String[] args){
        int[][] arr={
                {2,5,6,5},
                {3,5,6,8},
                {9,8,6}
        };
//to find the length of the array
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        // to print an array

        for(int[] ele:arr){// Arrays.toString() is used to print content of the array as string
            // Arrays.toString() is used for one dimentional arrau only if arr was ther instead fo ele it would have printed refremce address of element instead of element
            System.out.println(Arrays.toString(ele));
        }
// Arrays.deepToString() can be used for multi dimentional arraya
            System.out.println(Arrays.deepToString(arr));

        //loop with array
        for(int i=0;i < arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // advanced for loop for array //normal for loop can be transformed to that with alt enter
        for(int[] ele: arr){// here int[] is the type of data arr holds which is itself a array and ele takes data from arr one after another i.e. ele = arr[0] the ele = arr[1] and so on
            for(int element: ele){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
