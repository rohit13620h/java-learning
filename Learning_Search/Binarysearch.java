package idea.src.Learning_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args){
     Scanner in=new Scanner(System.in);

        System.out.println("enter the size of array of random element from 0 to 10000 you want ");
        int n =  in.nextInt();
        int[] list = new int[n];
        for(int i = 0 ; i<n-4; i=i+5){
            list[i]=(int)Math.floor(Math.random()*10001);
            list[i+1]=(int)Math.floor(Math.random()*10001);
            list[i+2]=(int)Math.floor(Math.random()*10001);
            list[i+3]=(int)Math.floor(Math.random()*10001);
            list[i+4]=(int)Math.floor(Math.random()*10001);
        }


        for(int  i = 0 ; i < n-1 ; i++){
            int temp;
            for (int j = i ; j < n ; j++){
                if(list[i]>list[j]){
                        temp = list[i];
                        list[i]=list[j];
                        list[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(list));

        System.out.println("enter the number you want to search");
        int num= in.nextInt();
        int start = 0,end=n-1,middle;

        while(true){
            middle=(start+end)/2;  // or middle= start + (end-start)*0.5;  because the sum of those num for some case might be bigger then the int type can holdd
            if(list[middle]==num){
                System.out.println("the target is at index "+ middle);
                break;
            }
            if(start<end){
                System.out.println("the target doesnot exist in the array");
                break;
            }
            if(num<list[middle]){
                end=middle-1;
                continue;
            }
            if(num>list[middle]){
                start=middle+1;
                continue;
            }

        }
    }
}
