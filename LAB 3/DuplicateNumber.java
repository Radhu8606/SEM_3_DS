import java.util.Scanner;
public class DuplicateNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you want in array:");
		int n = sc.nextInt();
		int[]  a= new int[n];
		System.out.println("Enter element:");
		for(int i=0;i<n;i++){
			
			a[i]=sc.nextInt();
		}
		System.out.println("Enter that number which ypu want to check:");
		int check = sc.nextInt();
		for(int i=0;i<n;i++){
			if(check == a[i]){
				System.out.println("Array contains duplicate number");
			}
		}
	}
}