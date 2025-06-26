package idea.src.Learning_Search;

public class Linearsearch {
    public static void main(String[] args){
        int[] arr={2,3,5,6,8,9,6};
        int target = 55;

        System.out.println(check(arr,target));
    }
    static boolean check(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i = 0 ;i<arr.length;i++){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}
