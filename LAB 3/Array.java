import java.util.Scanner;
public class Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you want in array:");
		int n = sc.nextInt();
		int[]  a= new int[n];
		System.out.println("Enter element:");
		for(int i=0;i<n;i++){
			
			a[i]=sc.nextInt();
		}
		System.out.println("display array");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}