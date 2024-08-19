import java.util.*;

public class DuplicateNumInArray{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]:");
			a[i]=sc.nextInt();
		}
		int c=1;

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					c=2;
				}
			}
		}
		if (c==2){
			System.out.println("contains duplicate");
		}
		else{
			System.out.println("not contains duplicate");
		}
		
	}
}