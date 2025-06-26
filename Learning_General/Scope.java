package idea.src.Learning_General;

public class Scope {
// scope -- where u can access the value of the variable
//    if we initialized a value in a varible the the variable will exist for those inside{} inside which the varible is initialized
public static void main(String[] args) {
    int a = 90;
    int b = 900;
    {
//       int a   this will give error since is has been already initialized but it can be modified
        a = 99;
        int c = 111;
    }
//    System.out.println(c);  this will give error because the variable initialized in a block of code will remain there only
// but already initialized value can be used there and if already initialized variable if modified inside the block then it affects outside also

//    even in loop(for(i=1;i<=10;i++){} we cannot use the value of i outside the block of code

}

static void scope(){
//    System.out.println(a);    it will nor work we cannot access a
    int c= 9000; //also the value of cannot be accessed outside of the funtion

}

}
