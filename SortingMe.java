package idea.src;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class SortingMe {
    static Scanner in = new Scanner(System.in);
    static boolean check = false;

    static void caseno(){
//  This has many problem
//        like multiple use of Scanner on sane source which is not efficent
//        will not work if input is 2154X
//        there is a simplifed way like using try-catch-inputMismatchexception ir yse hasNextInt
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("enter the elementsn and any other key at the end to stop entering data");
//        String str,str2;
//        while(true){
//        str=in.nextLine();
//        Scanner check1 = new Scanner(str);
//        Scanner check2 = new Scanner(str);
//        str2 = check1.next().trim();
//        Scanner check3 = new Scanner(str2);
//        int val = (int)check3.next().trim().charAt(0);
//
//        if(val<=47||val>=58){
//            break;
//        }
//        list.add(check2.nextInt());
//        }
//        System.out.println(list);
    ArrayList<Integer> list = new  ArrayList<>(50) ;
        System.out.println("enter the element and enter any other key to stop");
        while(true){
            try{
                list.add(in.nextInt());
            }
            catch(InputMismatchException e){
                in.nextLine();
                System.out.println("size of the set is : " + list.size());
            break;
            }
        }
        System.out.println("how do you want to sort the data \n enter 1 for ascending \n enter 2 for descening");
        switch (in.nextInt()){
            case 1 :
                list = neglist(list,list.size());
                check = true;
                break;
            case 2 :
                break;
        }
        int temp=0;
        for(int i = 0 ;  i<list.size() ; i ++){
            for(int j = i+1 ; j<list.size() ; j++){
                if(list.get(i)<list.get(j)){
                    temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        while(check){
            list = neglist(list,list.size());
            break;
        }
        System.out.println(list);
    }
    static void caseyes(){
        System.out.println("enter the size of the set");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the set");
        for(int i=0 ; i<n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("do you want to arrange in ascending or descending \n enter 1 for ascending \n enter 2 for descending");
        switch (in.nextInt()) {
            case (1):
                arr=negarr(arr,n);
                check = true;
                break;
            case (2):
                break;
        }
        for(int i = 0 ; i<n ; i++){
            for (int j = i+1 ; j<n ; j++){
                if(arr[i]<arr[j]){
                    int temp;
                    temp =   arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        while(check){
            arr=negarr(arr,n);
            break;
        }
        System.out.println(Arrays.toString(arr));
    }
    static int[] negarr(int[] arr, int n) {
        for(int i = 0 ; i<n ; i++){
            arr[i]=-1*arr[i];
        }
        return arr;
    }
    private static ArrayList<Integer> neglist(ArrayList<Integer> list, int size) {
        for(int i=0;i<size;i++){
            list.set(i,list.get(i)*(-1));
        }
        return list;
    }
    public static void main(String[] args){
    while(true){
        System.out.println("do you know the size of the data");
        switch (in.next().trim()) {
            case "no" , "No" -> {
                caseno();
            }
            case "yes" , "Yes" -> {
                caseyes();
            }
            default -> {
                System.out.println("please enter you response in yes or no");
                continue;
            }
        }
    break;
    }
}
}