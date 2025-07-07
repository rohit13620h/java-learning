package idea.src.Learning_String.Problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "jejem";
        System.out.println(check(str));
    }
    static boolean check(String str){
        int size = str.length();
        if(str==null || size==0){
            return true;
        }
        str.toLowerCase();
        for (int i = 0 ; i<=size/2;i++){
            if(str.charAt(i)!=str.charAt(size-1-i)){
                return false;
            }
        }
        return true;
    }
}
