import java.util.Scanner;
public class SwapNumber{
	static void Swap(int a,int b){
		int temp;
        temp = a;
        a=b;
        b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("before swap:");
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swap:");
	    Swap(a,b);
	}
}