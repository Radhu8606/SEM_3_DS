import java.util.Scanner;
public class AverageOfNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number:");
		int n = sc.nextInt();
		float sum = 0;
		for(int i=1;i<=n;i++){
            sum = sum+i;
		}
         float ave = sum/n;
         System.out.println("Average is:"+ave);
	}
}