package idea.src;
//suppose a array for 0 to N but with a num missing i.e. size of array = n,now find the missing num

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] array = {7,6,0,3,2,5,4,8,1};
        int num = missingnum(array);
        System.out.println(num);
    }

    static int missingnum(int[] array){
        int ans=array.length;
        sort(array);

        for(int i = 0 ; i<array.length ; i++){
            if(array[i]!=i){
                return i;
            }
        }
        return ans;
    }
    static void sort(int[] array){
        for (int i = 0 ;i<array.length-1;i++){
            for(int j = i;j>=0;j--){
                if(array[j+1]<array[j]){
                    swap(array,j+1,j);
                }else{
                    break;
                }
            }
        }

    }
    static void swap(int[] array,int first,int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }

}
