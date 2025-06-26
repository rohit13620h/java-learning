package idea.src.Learning_Sorting.Problems;
//suppose a array for 0 to N but with a num missing i.e. size of array = n,now find the missing num

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] array = {7,6,0,3,2,5,9,4,10,12,15,14,13,8,1};
        int num = missingnum(array);
        System.out.println(Arrays.toString(array));
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
        int i=0;
        while(i<array.length){
            if(array[i]<array.length && array[array[i]]!=array[i]){
                swap(array,i,array[i]);
            }else{
                i++;
            }
//        if(array[i]!=i){
//         if(array[i]== array.length){
//             i++;
//             continue;
//         }
//            swap(array,array[i],i);
//        }else{
//            i++;
//        }
        }
    }
    static void swap(int[] array,int first,int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }

}
