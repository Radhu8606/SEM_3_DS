import java.util.Scanner;
public class LAB61{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		System.out.println("Enter number:");
		int b = sc.nextInt();
        swap(a,b);

	}
	public static void swap(int a,int b){
      int temp;
      temp = a;
      a=b;
      b=temp;
      System.out.println("a"+a);
      System.out.println("b"+b);
	}
}