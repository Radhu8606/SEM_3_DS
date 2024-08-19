import java.util.Scanner;
public class ReplaceNumberInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter element:");
		for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
		}
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		System.out.println("Old Array");
        for(int i=0;i<size;i++){
            System.out.println(array[i]); 
		}
		System.out.println("Old A"+a);
		System.out.println("Old B"+b);
		int temp;
		temp = array[0];
		array[0] = b;
		b=temp;
		System.out.println("New Array");
        for(int i=0;i<size;i++){
            System.out.println(array[i]); 
		}
		System.out.println("New A"+a);
		System.out.println("New B"+b);
	}
}