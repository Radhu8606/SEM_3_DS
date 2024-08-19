import java.util.Scanner;
public class FactorialRecursion{
	 static int CalculateFactorial(int n){
        if(n<=1){
        	return 1;
        }
        return CalculateFactorial(n-1)*n;
	 }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		System.out.println("Factorial is:"+ CalculateFactorial(n)); 	
		}
}