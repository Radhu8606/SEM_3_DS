import java.util.Scanner;
public class MultiplicationOf2Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and cloumn of the matrix1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter row and cloumn of the matrix2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] m1 = new int[r1][c1];
        int [][] m2 = new int[r2][c2];
        int [][] m = new int[r1][c2];
        if(c1 != r2){
            System.out.println("Plaz enter valid row and column");
        }
        else{
        System.out.println("enter element in first matrix");
           for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j] = sc.nextInt();
            }
           }
           System.out.println("enter element in second matrix");
           for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j] = sc.nextInt();
            }
           }
           for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                m[i][j] = 0;
                for(int k=0;k<c1;k++){
                    m[i][j] += m1[i][k] * m2[k][j];
                    
                }
            }
           }
           System.out.println("new array");
           for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               System.out.println(m[i][j]);
            }
           }
    }
  }
}
