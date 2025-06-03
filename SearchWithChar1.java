package idea.src;
//smallest char greater then or equal to the target

public class SearchWithChar1 {
    public static void main(String[] args) {
        char[] letters={'f','h','k','m','p'};
        char target ='l';

        char ans = check(letters,target);
        if(ans =='\0'){
            System.out.println("the smallest character greater then or equal to target does not exist in the array");
        }else{
            System.out.println(ans);
        }

    }

    private static char check(char[] letters , char target) {
        int end = letters.length-1,start=0,mid;
        if(target>letters[end]){
            return '\0';
        }
        while(start<=end){
            if(end-start==1){
                if(letters[start]<target){
                    return letters[end];
                }
                return letters[start];
            }
            mid=start+(end-start)/2;
            if(letters[mid]==target){
                return letters[mid];
            }else if(letters[mid]<target){
                start = mid + 1;
            } else if (letters[mid]>target) {
                end = mid;
            }

        }
        return '\0';
    }
}
