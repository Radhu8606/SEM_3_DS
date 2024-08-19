import java.util.Scanner;
public class LAB52{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] a1 = new int[3][2];
		int [][] a2 = new int[2][3];
		int [][] a = new int[3][3];
		System.out.println("enter element in first array");
		for(int i=0;i<3;i++){
           for(int j=0;j<2;j++){
           	a1[i][j] = sc.nextInt();
           }
		}
        System.out.println("enter element in second array");
		for(int i=0;i<2;i++){
           for(int j=0;j<3;j++){
           	a2[i][j] = sc.nextInt();
           }
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j] = a1[i][j]*a2[i][j];
			}
		}

		System.out.println("new array");
		for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
           	System.out.println(a[i][j]);
           }
		}
	}
}		