import java.util.Scanner;

public class Primenocheck {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter any no");
        int i = input.nextInt();
        boolean n = prime(i);
        System.out.println(n);
    }

    static boolean prime(int i){
        if(i<=1){
            return 5<3;
        }
        for(int n=2;n*n<=i;n++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
}
