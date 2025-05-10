import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[1]=7;
        arr[3]=5;
        arr[2]=6;
        arr[4]=8;
        arr[0]=0;
        System.out.println(arr[2]);
        System.out.println(arr.length);//to find the size of the array

    for (int num=0;num<arr.length;num++){
        System.out.print(arr[num]+" ");
    }
//does same thing
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //OR
        System.out.println(Arrays.toString(arr));



    }

}
// datatype[] variable-name = new datatype[size];
// datatype[] variable-name = {...,....,..,..,.}
// int[]array; decleration of the array
// array = new int[size] ; initialization of the array
//so  int[]array=new int[size]

/*for int[] array=new int[5]  array[1],[2]...... will have a default value of 0 but for int[] array will have a default
value will be null and forstring [] str=new string[5] default value will be null

 */
