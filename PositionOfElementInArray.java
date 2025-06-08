package idea.src;
//find the first and last postion of an element in an sorted array


import java.util.Arrays;

public class PositionOfElementInArray {
    public static void main(String[] args){
        int[] array = {2,3,5,6,7,7,7,7,8,9,9,9,10,16,16,16,91};
        int target = 9;

        System.out.println(Arrays.toString(check(array,target)));// my way
        System.out.println(Arrays.toString(check2(array,target)));// after refremce from kk and co pilot

    }

    static int[] check(int[] array,int target){
        int start = 0 ,end = array.length-1,mid=0;
        boolean check  = false;
        int[] result = {-1,-1};

        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid]==target){
                check=true;
            break;
            }
            if(target<array[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }

        if(!check){
            return result;
        }

        for(int i=mid ;i>=0;i--){
            if(check) {
                for (int j = mid ; j < array.length; j++) {
                    if (array[j] == target) {
                        result[1] = j ;
                        check = false;
                    }
                }
            }

            if(array[i]==target){
                result[0]=i ;
            }
        }
       return result;
    }

    static int[] check2(int[] array,int target){
        int[] result={-1,-1};
        result[0]=binarysearch(array,target,true);
        result[1]=binarysearch(array,target,false);
        return result ;
    }

    static int binarysearch(int[] array,int target,boolean check){
        int mid,ans=-1,start=0,end=array.length-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if(array[mid]==target){
                ans = mid;
                if(check){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(array[mid]<target){
                    start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return ans;
    }

}
