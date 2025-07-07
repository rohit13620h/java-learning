package idea.src.Learning_patterns.Problems;

//   *
//  ***
// *****
//  ***
//   *

public class NO_2 {
    public static void main(String[] args) {
        int gap = 3;
        int loop=0;
        for(int i =1; i<=7;i++){

            for(int j =1;j<=gap;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=7-2*gap;j++){
                System.out.print('*');
            }
            System.out.println();;
            if(i<4){
                gap--;
            }else{
                gap++;
            }
        }

    }
}
