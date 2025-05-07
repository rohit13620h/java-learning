import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

      /*  if(fruit.equals("mango")){
            //// == checks the reference as if two variable are pointing to same object or not
            ////while .equals checks the sequence of the character in the string
            System.out.println("king of fruits");
        }
        if(fruit.equals("apple")){
            System.out.println("a sweet red fruits");
        }*/
        ////this is repetitive so in these cases switch case can be used

       switch (fruit) {
           case "mango":
               System.out.println("king of fruits");
               break;
           // we cannot use two cases for same object
           case "apple", "Apple":
               System.out.println("sweet red fruit");
               break;
//break; is needed if break was not present when the object satisfies the case then also the switch case willnot stop
//suppose grapes satisfies the case then the print will be small fruit  /n  round fruit    /n  enter a valid fruti
           case "grapes":
               System.out.println("small fruits");
//       break;
           case "orange":
               System.out.println("round fruit");
//       break;
           default:
               System.out.println("enter a valid fruit");
       }
// we can make the code neater but clicking in switch and presssing alt enter
               switch (fruit) {
                   case "mango" -> System.out.println("king of fruits");
                   case "apple", "Apple" -> System.out.println("sweet red fruit");
                   case "grapes" -> System.out.println("small fruits");
                   case "orange" -> System.out.println("round fruit");
                   default -> System.out.println("enter a valid fruit");
               }

        System.out.println("enter a day from 1 to 7");
               int day = input.nextInt();
       switch (day){
           case 2-> System.out.println("monday");
           case 3 -> System.out.println("tuesday");
           case 4 -> System.out.println("wednesday");
           case 5 -> System.out.println("thursday");
           case 6 -> System.out.println("friday");
           case 7 ->{
               System.out.println("holiday");
               System.out.println("saturday");
           }
           case 1 -> System.out.println("sunday");

       }

    }

}
