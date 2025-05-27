package idea.src;

import java.util.Arrays;

public class CharsearchinString {
    public static void main(String[] args) {
        String str = "kekfoasgnabuewop";
        char target = 'h';
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(check(str,target));
    }
    static boolean check(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (int i =0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
