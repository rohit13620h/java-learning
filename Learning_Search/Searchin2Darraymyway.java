package idea.src.Learning_Search;
//ifmatrix is sorted in rowwise ans columnwise manner

import java.util.Arrays;

public class Searchin2Darraymyway {
    public static void main(String[] args){
        int[][] array = {{1,5,9},{2,9,18},{9,15,50}};
        int target = 555;

        int[] result = binarysearch2d(array,target);

        System.out.println(Arrays.toString(result));

    }

    static int[] binarysearch2d(int[][] array , int target){
        int[] returnarray={-1,-1};
        for(int i = array.length-1;i>-1;i--){
            try{
                if(array[i][i]<=target){
                    int result=binarysearch(array[i],target,i);
                    if(result==-1){
                        int mid,start=i,end=array.length-1;
                        while(start<=end){
                            mid=start+(end-start)/2;
                            if(array[mid][i]==target){
                                returnarray[0]=mid;
                                returnarray[1]=i;
                                break;
                            }else if(array[mid][i]<target){
                                start=mid+1;
                            }else{
                                end=mid-1;
                            }
                        }
                        break;
                    }
                    returnarray[0]=i;
                    returnarray[1]=result;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException a){
                continue;
            }
        }
        return returnarray;
    }

    static int binarysearch(int[] array , int target,int start){
        int end = array.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            } else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
