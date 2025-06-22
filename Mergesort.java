package idea.src;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] array = {9,6,0,3,2,5,4,8,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array){
        if(array.length==1){
        }else if(array.length==2){
            if(array[0]>array[1]){
                int temp=array[0];
                array[0]=array[1];
                array[1]=temp;
            }
        }else{
            int mid =  array.length/2;
            int size = array.length;
            int[] newarray=new int[mid];
            int[] newarray2=new int[array.length-mid];
            System.arraycopy(array,0,newarray,0,mid);
            System.arraycopy(array,mid,newarray2,0,array.length-mid);
            sort(newarray);
            sort(newarray2);
            System.arraycopy(newarray,0,array,0,mid);
            System.arraycopy(newarray2,0,array,mid,array.length-mid);
            insertionsort(array);
        }
    }

    static void insertionsort(int[] array){
        int mid=array.length/2;
        for(mid=mid;mid<array.length;mid++){
            int tocheck=mid;
            for(int i = mid-1;i>=0;i--){
                if(array[tocheck]<array[i]){
                    int temp=array[tocheck];
                    array[tocheck]=array[i];
                    array[i]=temp;
                    tocheck--;
                }
            }
        }
    }
}
