package idea.src.Learning_Methods.Problems;
//in a array find the no fo numbers with evenno of digits

public class Evennoofdigits {
    public static void main(String[] args) {
        int[] arr={25,6,42,658,5684};
        System.out.println(check(arr));
    }
    private static int check(int[] arr) {
        int count=0;
        for(int i : arr){
        for(int j = 1;j>0;j++){
            i = i/10;
            if(i<1){
            break;
            }
            i=i/10;
            if(i<1){
                count++;
            }
        }
        }
        return count;
    }
}
