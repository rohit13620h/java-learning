package idea.src.Learning_String;

public class StringBuilder_intro {
    public static void main(String[] args) {
        //stringbuilder is a class similar to string
        //in string when + operation is used everytime a new object is created generating a big space time complexicity
        //but stringbuilder doesnot created new object i.e stringbuilder is not inmutable
        //stringbuilder does not funtion with + it has its own methods to wrk with

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.indexOf("cba"));
        builder.deleteCharAt(4);
        System.out.println(builder);
    }
}
