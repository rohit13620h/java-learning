package idea.src;

public class CeilingOfANumByBs {
    public static void main(String[] args) {
        int[] arr =  {2,5,9,12,45,68,98,156,589,985,989};
        int ceilingtarget = 3;
        // ceiling of a num here is the smallest no greater or equal to the target in the array
        int start = 0,end=arr.length-1,ans=0;

if(ceilingtarget>arr[arr.length-1]){
    System.out.println("givin nunber ceiling lies out side the array");
}else{
    do{
        int mid=start+(end-start)/2;

        if(ceilingtarget==arr[mid]){
            end=mid;
            break;
        }

        if(ceilingtarget<arr[mid]){
            end = mid;
            continue;
        }
        if(ceilingtarget>arr[mid]){
            start = mid+1;
        }
    }while (end-start>1);

    if(arr[start]==ceilingtarget||arr[start]>ceilingtarget){
        ans=arr[start];
    }
    else{
        ans=arr[end];
    }
}

        System.out.println(ans);
    }
}
