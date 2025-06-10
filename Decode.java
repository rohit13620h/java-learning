package idea.src;

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

        boolvalue=getbooleanvalue(value,boolvalue);
        char[] result = new char[boolvalue.length/8];
        converttobase256ascii(boolvalue,result);

        for(char c:result){
            System.out.print(c);
        }

    }

    static boolean[] getbooleanvalue(int[] value,boolean[] boolvalue){
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

        int n=0,count=0;

        for(int i=value.length-1; i>=0;i--){
            for(int j = 0 ; j < 6 ; j++){
                if(value[i]==-1){
                    count++;
                    break;
                }

                if(value[i]==1){
                    boolvalue[j+n]=true;
                    value[i]=0;
                }else if(value[i]==0){
                    continue;
                }else if(value[i]%2==1){
                    boolvalue[j+n]=true;
                }else {
                    boolvalue[j+n]=false;
                }
                value[i]=value[i]/2;
         }
            n=n+6;
        }
        return rotateboolvalue(boolvalue,count*8);
    }

    static boolean[] rotateboolvalue(boolean[] boolvalue,int num){
        int len=boolvalue.length;
        boolean[] result = new boolean[len-num];
        for(int i = len-1;i>num;i--){
            result[len-1-i]=boolvalue[i];
        }
        return result;
    }

    static void converttobase256ascii(boolean[] boolvaue,char[] result){
        int temp,n=0;
        for(int i=0 ; i<result.length;i++){
            temp = 0;
            for(int j = 0 ; j<8 ; j++){
                if(boolvaue[j+n]){
                    temp+=(int)Math.pow(2,7-j);
                }
            }
            result[i]=(char) temp;
            n+=8;
        }
    }
}
