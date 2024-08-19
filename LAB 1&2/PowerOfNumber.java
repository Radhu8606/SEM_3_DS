import java.util.Scanner;
public class PowerOfNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		System.out.println("Give the power of number:");
		int b = sc.nextInt();
		int ans=1;
		for(int i=0;i<b;i++){
			ans = ans*a;
		}
		System.out.println("Power of given number is:"+ans);
	}
}