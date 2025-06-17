package idea.src;
/*given subarray of non negative no and an num m and the array can be divided into m subarray non empty now find the
largetst sum among the sub array
 */

public class Largestsumamongsubarray {
    public static void main(String[] args) {
        int[] array = {7,2,5,10,8};
        int m = 3;

        int largestsum=div(array,m);

        System.out.println(largestsum);
    }

    static int div (int[] array , int m ){



    }

    static int findsum(int[] array, int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=array[i];
        }
        return sum;
    }

}
