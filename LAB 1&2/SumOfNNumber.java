import java.util.Scanner;
public class SumOfNNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last number:");
		int n = sc.nextInt();
		int sum = CalculateSum(n);
		System.out.println("Sum is:"+sum);
	}
	public static int CalculateSum(int n){
		return (n*(n+1)*(n+2))/6;
	}
}