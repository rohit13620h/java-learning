package idea.src.Learning_Methods;

public class Methodpractice {
    public static void main(String[] args) {
//    sum();
//    sum();
//   int ans =  sum2();
//        System.out.println(ans);
        System.out.println(sum3(89, 87));
        System.out.println(greet());
        changegreet();  //thin wont change the value
        System.out.println(greet());
    }
// this is usefull when u have to do one sequence of code multuple time u can call/use this group of code just by saying sum()

    /*here void means that when we call this the sum() will not have any value null it will perform the expression only
    but we can give valur to the sum() if we use static int sum() and finish with return sum*/
//        static void sum(){
//        Scanner in = new Scanner(System.in);
//        int num1,num2,sum;
//
//        System.out.println("enter the first number");
//        num1 = in.nextInt();
//        System.out.println("enter the second number");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("the sum : " + sum);

/*static int sum2(){
               Scanner in = new Scanner(System.in);
               int num1,num2;

               System.out.println("enter the first number");
               num1 = in.nextInt();
               System.out.println("enter the second number");
               num2 = in.nextInt();
               int sum = num1 + num2;
              return sum ;

           }*/

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static String greet() {
//        String greeting = "namaste";
//        return greeting;
        return "namaste";
    }
static String changegreet(){
        String greeting = "good day";
        return greeting;
}



}

/*
    access modifier ( more defined in oop) return_type(void or int or String  ) name () {
        // body
        return statement;  */

