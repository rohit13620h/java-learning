package idea.src;
//peak index in a mountain array     bytonic array
//the index at which the value of the data is highest

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args){
        int[] array = generatearray();
        System.out.println(Arrays.toString(array));

        peakindex(array);

    }
    static int[] generatearray(){
        int[] first_array,second_array,final_array;

        System.out.println("enter the integers for ascending and enter and non numeric to stop");
        first_array=newarray(true);
        System.out.println("enter the integers for descending and enter and non numeric to stop");
        second_array=newarray(false);

        final_array=addarray(first_array,second_array);

        return final_array;
    }

    static int[] newarray(boolean check){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0 ; i > -1 ; i++){
            try{
                list.add(in.nextInt());
            }catch(InputMismatchException e){
                in.next();
                break;
            }
        }

        if (check) {
            return arrangearray(converttoarray(list));
        }
        return negate(arrangearray(negate(converttoarray(list))));
    }

    static int[] converttoarray(ArrayList<Integer> lsit){
        int size = lsit.size();
        int[] array = new int[size];
        for(int i =0 ; i<size; i++){
            array[i]= lsit.get(i);
        }
        return array;
    }

    static int[] arrangearray(int[] array){
        for(int i =0 ; i <array.length-1;i++){
            int temp;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ;
            for(int j =i+1; j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
        return array;
    }

    static int[] negate(int[] array){
        for(int i = 0 ; i < array.length; i++){
            array[i]*=(-1);
        }
        return array;
    }

    static int[] addarray(int[] first,int[] second){
        int size1 = first.length,size2 = second.length;
        int[] result=new int[size1+size2];
        System.arraycopy(first,0,result,0,size1);
        System.arraycopy(second,0,result,size1,size2);
        return result;
    }

    static void peakindex(int[] array){
        int index,temp,value,mid,start,end;
        start = 0 ;
        end = array.length-1;
        outerloop :
        while(true){
            mid=start+(end-start)/2;
            if(start==end){
                index = start;
                value =  array[start];
                break;
            }
            for(int i = 1 ; i > 0; i++){
                if(start<=mid-i&&array[mid]>array[mid-i]) {
                        start = mid;
                        break;
                }else if(end>=mid+i&&array[mid]>array[mid+i]){
                    end = mid;
                    break;

                }else{
                    index=mid;
                    value=array[mid];
                    break outerloop;
                }
            }
        }
        System.out.println(index);
        System.out.println(value);
    }

}
