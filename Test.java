package idea.src;
//lets see if a number is prime or not
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.println("enter any number");
        long num = input.nextInt();

if(num<0){
    System.out.println("the number is negative");
}
else if (num==0 || num==1){
    System.out.println("0 and 1 are neither prime not composite");
        }
        else {
        for(int i=2;i*i<num;i++){
         if(num%i==0){
             System.out.println("the number is composite");
             break;
         }
         if((i+1)*(i+1)>num) {
             System.out.println("the number is prime");
         }
        }
        }
    }
}