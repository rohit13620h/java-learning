package idea.src.Learning_Search.Problems;
//something is worng

public class FloorOfANumByBs {
    public static void main(String[] args){
     int arr[] = {2,41,56,89,95,99,123,456,678,985};
     int target = 1000;

     if(target<arr[0]){
         System.out.println("floor of the given no does not lie in the array");
     }else{
         int start =0 , end = arr.length-1,mid;

         while(true){
             if(end==start){
                 System.out.println(start);
                 break;
             }
             if(end-start==1){
                if(target>arr[end]||target==arr[end]){
                    System.out.println(end);
                break;
                }
                else{
                    System.out.println(start);
                    break;
                }
             }
             mid = start + (end - start)/2;
             if (arr[mid]==target){
                 System.out.println(mid);
             break;
             }
             else if(arr[mid]<target){
                 start=mid;
             }
             else{
              end=mid-1;
             }
         }
     }
    }
}
