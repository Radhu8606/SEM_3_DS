import java.util.Scanner;
public class DeleteInAssendingOrder{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array:");
       int size = sc.nextInt();
       int[] arr = new int[size];
       int[] array = new int[size-1];
       System.out.println("Enter element:");
       for(int i=0;i<size;i++){
        arr [i] = sc.nextInt();
       }
       System.out.println(("Enter number which you want to delete:"));
        int number = sc.nextInt();
        int index = 0;
        while(index<arr.length && arr[index]<number){
        array[index] = arr[index];
            index++;
       }
       for(int i=index;i<size-1;i++){
        array[i] = arr[i+1];
    }
    System.out.println("new array");
    for(int i=0;i<size-1;i++){
        System.out.println(array[i]);
    }  
	}
}