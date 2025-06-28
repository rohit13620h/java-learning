package idea.src.Learning_Sorting.Problems;
//in an array of integer find smallest positive missing num starting from 1

public class FirstMissingPositiveNum {
    public static void main(String[] args){
        int[] array = {5,2,3,4};
        sort(array);
        int ans = search(array);
        System.out.println(ans);
    }
    static int search(int[] array){
        for(int i = 1;i<array.length;i++){
            if(array[i]!=i){
                return i;
            }
        }
        if(array[0]!=array.length){
            return array.length;
        }
        return array.length+1;
    }

    static void sort(int[] array){
        int num =0;
        while(num<array.length){
            if(array[num]>array.length-1 || array[num]<0){
                num++;
            }else if(array[array[num]]!=array[num]){
                swap(array,array[num],num);
            }else{
                num++;
            }
        }
    }

    static void swap(int[] array, int i,int index){
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
}
