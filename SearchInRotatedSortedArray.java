package idea.src;
//search in rotated sorted array
//rotated sorted array = array with one rotation is if all the element index is increased by 1 and the last element come to 0 index
//and array  can have many rotation
//in this question the elements are not repeated



public class SearchInRotatedSortedArray {
    public static void main(String[] args){

        int[] array = {23,26,59,96,458,1649,2,5,7,8,9,10,15};
        int target = 7;

        int position = positionofhighest(array);

        int index = findelement(array,target,position);

        System.out.println(index);

    }

    static int positionofhighest(int[] array){
        int index=-1,start=0,end=array.length-1,mid;

        while(start<=end){
            mid=start+(end-start)/2;

            if (array[mid - 1] > array[mid]) {
                index=mid-1;
                break;
            }else if(array[mid]>array[mid+1]){
                index=mid;
                break;
            }

            if(array[start] > array[mid]){
                end=mid-1;
            }else if(array[end] < array[start]){
                start=mid+1;
            }else{
                return -1;
            }

        }

        return index;
    }

    static int findelement(int[] array, int target , int position){
        int index=-1,start=0,end=array.length-1;

        if(position==-1){
            return binarysearch(array,target,start,end);
        }
        if(target >= array[start] && target <= array[position]){
            return binarysearch(array,target,start,position);
        }
        if(target >= array[position+1] && target <= array[end]){
            return binarysearch(array,target,position+1,end);
        }
        return index;
    }

    static int binarysearch(int[] array,int target,int start,int end){
        int mid;
        while(true){
            mid=start+(end-start)/2;
            if(start>end){
                return -1;
            }
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

    }

}
