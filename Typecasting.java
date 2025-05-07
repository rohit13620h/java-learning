import java.util.Scanner;

public class Typecasting {
    //converting one datatype to another
    public static void main(String[] args) {
      /* Scanner input = new Scanner(System.in);
        System.out.println("enter integer");
        int n = input.nextInt();
        Float f = input.nextFloat();
        // for floar nextfloat only and for int next int only
        System.out.println("int"+ n );
        System.out.println("float"+f);*/

     /*   Scanner input2 = new Scanner(System.in);
        System.out.println("enter float");
        // int i = input2.nextInt();   for float input it will give error
        // destination datatype should be greater then the source datatype float contain int and decimal but int ony int so float can read int but int cant read float
        // similar thing happpens with char"character" and string ' '  " "
        float ff = input2.nextFloat();
        System.out.println("float"+ ff);
        /* automatic typecasting may not fulfill your need so u can also change datatype manually
        u can change int to float but not vice versa
        to do so   int num (int)(67.56f); this will give integer value 67 of the float value */

      /*  // automatic type promotion in expression
        int a = 257;
               // byte b = a; will give error since byte can only store value till 256 so wht we can do is
        byte b = (byte) (a);
        //what it is doing is a%256  ie 257 modulus 256 which is 1
        System.out.println(b);
        */

     /*  byte a= 70;
       byte b= 40;
       byte c= 100;
       int d = (a*b)/c;
        System.out.println(d);
        //a,b,c can only store till 256 but a*b is clearly more then it . it is because when doing the eqution a and b behave as integer
        // i e  a,b c are stored as byte but when used in expression they promot datatype  ie automatic type promotion
       */

/*       byte  b = 90 ;
       b= b+10;
    so when porforming the expression the byte b converts to integer and after finishing the expression the value b +10 which is now integer due to
    automatic promotion can not be assigned to b which is byte data type and is not a greater datatype then integer
    to store the value of b we need to do casting
     b = (byte) (b+10);
     System.out.println(b);
      because of the automatic type casting  if we
      int a = 'a'
      if we give output we will get 97 and for A 65
      during performing expression byte short and character value are promoted to integer
      but in expression eg(a+s,a*b) if even one variable is long then the result is long if one is float result is floar if double =double

        int i  = 12;
        byte b = i;
        System.out.println(b);
        above code wont work but below will , even tho 12 can be stored in byte  a greater datatype int cant be converted to byte datatayte
        but byte datatype can be stored in int
        byte b = 12;
        int i = b;
        System.out.println(i);  */

// s= float - int +char +double
// the s must be double ,if there was not double then the result must be float , if no float then int and finally char
// double s = f-i+c+d


    }

}
