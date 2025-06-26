package idea.src.Learning_Sorting.Problems;
//a array of n size containing num [1,n] find the duplicate no

public class DuplicateNum {
    public static void main(String[] args) {
        int[] array = {9,6,5,8,4,7,2,2,3,1};
        sort(array);
        System.out.println(search(array));
    }
    static void sort(int[] array){
        int i=0;
        while (i < array.length) {
            if(array[array[i]-1]!=array[i]){
                swap(array,i,array[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] array,int index1,int index2){
        int temp = array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
    }
    static int search(int[] array){
        for(int i = 0; i<array.length;i++){
            if(array[i]!=i+1){
                return array[i];
            }
        }
        return -1;
    }
}
