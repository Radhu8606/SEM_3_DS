import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		int count=1;
		for(int i=2;i<=a;i++){
			if(a%i == 0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Given number is prime number");
		}
		else{
			System.out.println("Given number is not prime");
		}
	}
}