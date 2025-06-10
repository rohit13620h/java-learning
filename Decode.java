package idea.src;


import java.util.Arrays;

public class Decode {
    public static void main(String[] args) {
        String str = "RGFuZyB5b3UgZGlkIGl0IC4gWW91IHRyaWVkIHRvIHVzZSB0aGUgYWkgbG9sIA==";
        char[] ch = str.toCharArray();
        int size = ch.length;
        int[] value = new int[size];
        boolean[] boolvalue= new boolean[size*6];

        for (int i = 0; i < size; i++) {
            value[i] = ((int) ch[i]);
        }

        getbooleanvalue(value,boolvalue);

        boolvalue=getrightboolsize(boolvalue);

        char[] result = new char[boolvalue.length/8];

        converttobase256ascii(boolvalue,result);

    }

    static void getbooleanvalue(int[] value,boolean[] boolvalue){
        for(int i=0;i<value.length;i++){
            if(value[i]>64 && value[i]<91){
                value[i]=value[i]-65;
            }else if(value[i]>96 && value[i]<123){
                value[i]=value[i]-71;
            }else if(value[i]>47 && value[i]<59){
                value[i]=value[i]+4;
            }else if(value[i] == 47){
                value[i] = 63;
            }else if(value[i] == 43){
                value[i] = 62;
            }else{
                value[i]=-1;
            }
        }

        int n=0;

        for(int i=value.length-1; i>=0;i--){
            for(int j = 0 ; j < 6 ; j++){
                int mod = value[i]%2;
                if(value[i]==1){
                    boolvalue[j+n]=true;
                    value[i]=0;
                }else if(value[i]==0){
                    continue;
                }else if(mod==1){
                    boolvalue[j+n]=true;
                }else if(mod==0){
                    boolvalue[j+n]=false;
                }else{
                    n=n-4;
                    break;
                }
                value[i]=value[i]/2;
         }
            n=n+6;
        }

        rotateboolvalue(boolvalue);
    }

    static void rotateboolvalue(boolean[] boolvalue){
        boolean temp ;
        int len=boolvalue.length;
        for(int i = 0;i<len/2;i++){
            temp=boolvalue[i];
            boolvalue[i]=boolvalue[len-1-i];
            boolvalue[len-1-i]=temp;
        }
    }

    static boolean[] getrightboolsize(boolean[] boolvalue){
        boolean[] boolarray=new boolean[boolvalue.length];
        System.arraycopy(boolvalue,8,boolarray,0,376);
        return Arrays.copyOf(boolarray,376);
    }

    static void converttobase256ascii(boolean[] boolvaue,char[] result){
        int temp;
        for(int i=0 ; i<result.length;i++){

        }

    }

}
