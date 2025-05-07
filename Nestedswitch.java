//nestedcase if inside if swutch inside switch etc

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter your id");
        int id = input.nextInt();
        System.out.println("enter your department");
        String s = input.next();

        switch (id){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                switch (s){
                    case ("it") -> System.out.println("information technology");
                    case ("lab") -> System.out.println("lab assistant");
                    default -> System.out.println("no valid department");
                }
                break;
            default:
                System.out.println("enter a valid id");
        }
    }
}
