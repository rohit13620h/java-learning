package idea.src.Learning_Loops;

public class Conditional {
    public static void main(String[] args) {
        /* syntax of if statements:
        if (boolean extression True or false){
        //body
        } else {
        // do this
        }
         */
        int s = 25400;
//        if (s > 10000) {
//            s = s + 2000;
//        }else {
//            s=s + 10000;
//        }
//        System.out.println("new salary " +s);

        if (s>10000) {
            s += 2000;  //  same as s = s + 2000
        } else if (s>20000){
            s+=3000;
        }else{
            s=+ 1000;}
        System.out.println("new salary : "+ s);
        }


    }
