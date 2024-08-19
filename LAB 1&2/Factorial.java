import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		double a = sc.nextDouble();
		double ans=1;
		for(int i=1;i<=a;i++){
			
			ans = ans*i;
		}
		System.out.println("Factorial of given number is:"+ans);
	}
}