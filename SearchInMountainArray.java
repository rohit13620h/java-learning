package idea.src;
//from gemini ai
//will look on this again
//couldn't do because of not understanding mountain array, mountain array definition is not loose so no need to code for plateaus i.e. repeating elements

public class SearchInMountainArray {
    public static void main(String[] args){
        int[] array = {1,2,5,9,41,59,678,9841,65467,3256,327,65,51,23,21,10,6,2};
        int target = 65;

        int index = findTargetInMountainArray(array, target);
        System.out.println(index);
    }

    static int findTargetInMountainArray(int[] array, int target) {
        // Step 1: Find the peak element
        int peakIndex = findPeakIndex(array);

        // Step 2: Search in the ascending part (0 to peakIndex)
        int result = binarySearchAsc(array, target, 0, peakIndex);
        if (result != -1) {
            return result;
        }

        // Step 3: If not found, search in the descending part (peakIndex + 1 to end)
        return binarySearchDesc(array, target, peakIndex + 1, array.length - 1);
    }

    // Helper function to find the peak index using binary search
    static int findPeakIndex(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < array[mid + 1]) {
                // We are in the ascending part of the mountain
                // Peak is on the right side
                start = mid + 1;
            } else {
                // We are in the descending part, or mid is the peak
                // Peak is at mid or on the left side
                end = mid;
            }
        }
        // At the end of the loop, start == end, which is the peak index
        return start;
    }

    // Standard binary search for an ascending sorted array
    static int binarySearchAsc(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Binary search for a descending sorted array (comparison logic flipped)
    static int binarySearchDesc(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) { // If mid is greater, target must be to the right (further down)
                start = mid + 1;
            } else { // If mid is less, target must be to the left (further up)
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }
}



//package idea.src;
//
//public class SearchInMountainArray {
//    public static void main(String[] args){
//        int[] array = {1,2,5,9,41,59,678,9841,65467,3256,327,65,51,23,21,10,6,2};
//        int target = 65,start = 0,end = array.length-1,index;
//
//        index=check(array,target,start,end);
//
//        System.out.println(index);
//
//    }
//    static int check(int[] array,int target,int start,int end){
//
//        int mid,index=-1;
//        while(start<=end){
//            mid=start+(end-start)/2;
//            boolean[] check;
//
//            if(start == end){
//                if(array[start]==target){
//                    return start;
//                }
//                return-1;
//            }
//
//            check=checkfornonmountainarray(array,start,mid,end);
//
//            if(!check[2]){
//                System.out.println("the array only contain single value");
//                break;
//            }
//            if(check[0]){
//                index= binarysearch(array,target,start,mid,check[1]);
//                if(index!=-1){
//                    return index;
//                }
//                index=check(array,target,mid,end);
//            }else{
//                index= binarysearch(array,target,mid,end,check[1]);
//                if(index!=-1){
//                    return index;
//                }
//                index=check(array,target,start,mid);
//            }
//            break;
//        }
//        return index;
//    }
//
//    static int binarysearch(int[] array, int target, int start, int end, boolean check){
//        int start1=start,end1=end,mid;
//        if(!check){
//            for(int i = start;i<end;i++){
//                array[i]=-1*array[i];
//            }
//        }
//        while(start<=end){
//            mid=start+(end-start)/2;
//            if(array[mid]==target){
//                return mid;
//            }
//            if(array[mid]<target){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        if(!check){
//            for(int i = start1;i<end1;i++){
//                array[i]=-1*array[i];
//            }
//        }
//        return -1;
//    }
//
//    static boolean[] checkfornonmountainarray(int[] array, int start , int mid , int end){
//        boolean[] check=new boolean[3];
//        for(int i = 0 ; i<mid ; i++) {
//            if (array[start+i] > array[start] && array[mid]>array[mid-i]){
//                check[0]=true;
//                check[1]=true;
//                check[2]=true;
//                break;
//            }else if(array[start+1] < array[start] && array[mid]<array[mid-i]){
//                check[0]=true;
//                check[2]=true;
//                break;
//            }else if(array[mid+i] > array[mid] && array[end]>array[end-i]){
//                check[1]=true;
//                check[2]=true;
//                break;
//            }else if(array[mid+1] < array[mid] && array[end]<array[end-i]){
//                check[2]=true;
//                break;
//            }
//        }
//        return check;
//    }
//
//}
