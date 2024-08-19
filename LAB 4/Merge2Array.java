import java.util.Scanner;
public class Merge2Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();
		int [] a1 = new int[n];
		int [] a2 = new int[n];
		System.out.println("enter element in first array:");
		for(int i=0;i<n;i++){
             a1[i] = sc.nextInt();
		}
		System.out.println("enter element in second array:");
		for(int i=0;i<n;i++){
             a2[i] = sc.nextInt();
		}
		int [] c = new int[n+n];
		for(int j=0;j<(n+n);j++){
			if(j<5){
				c[j] = a1[j];
			}
			else if(j>4 && j<10){
				c[j] = a2[j-5];
			}
		}
     int  min = c[0];
      for(int k=0;k<(n+n);k++){
      	for(int r=0;r<(n+n);r++){
      		if(c[k]<c[r]){
      			int temp = c[k];
      			c[k] = c[r];
      			c[r] = temp;
      		}
      	}
      } 
      System.out.println("new array");
      for(int f=0;f<(n+n);f++){
      	System.out.println(c[f]);
      }
	}
}