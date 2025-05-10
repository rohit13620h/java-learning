import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the order of the first matrix");
        int a=input.nextInt() , b= input.nextInt();
        System.out.println("enter the order of the second matrix");
        int A= input.nextInt() , B=input.nextInt();
        if (b==A){
            int[][] matrix1= new int[a][b];
            int[][] matrix2= new int[A][B];
            System.out.println("for First matrix");
            takevalue(matrix1,a,b);
            System.out.println("for Second matrix");
            takevalue(matrix2,A,B);

            int[][] multi=new int [a][B];
            int temp=5;
            for(int i=0;i<a;i++){
                for(int k=0;k<B;k++){
                    temp=0;
                    for (int j=0;j<b;j++){
                        temp=temp+(matrix1[i][j]*matrix2[j][k]);
                    }
                    multi[i][k]=temp;
                }
            }
            for(int i=0; i<a;i++){
                System.out.print('|');
                for(int j=0; j<B; j++){
                    System.out.print(multi[i][j]+"  ");
                }
                System.out.print("\b\b|\n");
            }
        }
else{
            System.out.println("the columb of first matrix must be equal to row of second matrix");
}
}
    static void takevalue(int[][] matrix,int a,int b){
        Scanner input= new Scanner(System.in);
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("enter the elemnt of the postion  MATRIX "+(i+1)+' '+(j+1)+' ');
                matrix[i][j]=input.nextInt();
            }
        }
}

}