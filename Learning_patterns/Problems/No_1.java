package idea.src.Learning_patterns.Problems;
//*
//**
//***
//****
//***
//**
//*
public class No_1 {
    public static void main(String[] args) {
        int num=0;
        for(int i =1; i<8;i++){
            if(i>4){
                num++;
                num++;
            }
            for(int j =1;j<=i-num;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
