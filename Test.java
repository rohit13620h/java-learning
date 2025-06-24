package idea.src;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = { 20, 15,9,5};
        int[] newarray=array.clone();
        sort(array,newarray,0,array.length-1);
        if (array.length==2){
            array=newarray;
        }
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array,int[] newarr, int start, int end){
            if(end-start<=1){
                if(newarr[start]>newarr[end]){
                    swap(newarr,start,end);
                }
            }else{
                int mid=start+(end-start)/2;
                sort(newarr,array,start,mid);
                sort(newarr,array,mid+1,end);
                merge(array,newarr,start,mid,mid+1,end);
            }

    }

    static void merge(int[] array,int[] newarray,int start,int mid,int aftermid,int end){
        for(int i = start ; i<=end ; i++){
            if(newarray[start]>newarray[aftermid]){
                array[i]=newarray[aftermid];
                aftermid++;
            }else{
                array[i]=newarray[start];
                start++;
            }
            if(start>mid){
                for(int j=i+1;j<=end;j++){
                    array[j]=newarray[aftermid];
                    aftermid++;
                }
                break;
            }else if(aftermid>end){
                for(int j =i+1;j<=end;j++){
                    array[j]=newarray[start];
                    start++;
                }
                break;
            }

        }
    }

    static void swap(int[] array,int index,int last){
        int temp=array[index];
        array[index]=array[last];
        array[last]=temp;
    }
}
