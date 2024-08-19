import java.util.Scanner;
public class PositionOfNumbers{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int minposition = 0;
      int maxposition = 0;
      System.out.println("Enter how many number you want:");
      int n = sc.nextInt();
      int [] a = new int[n];
      System.out.println("Enter element:");
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      for(int i=1;i<n;i++){
      	if(a[i]<a[minposition]){
      		minposition=i;
      	}
      	if(a[i]>a[maxposition]){
      		maxposition=i;
      	}
     }
     System.out.println("Minimum:"+minposition);
     System.out.println("Maximum:"+maxposition);
  }
}