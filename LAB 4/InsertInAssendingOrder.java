import java.util.Scanner;
public class InsertInAssendingOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] array = new int[size+1];
        System.out.println("Enter element:");
        for(int i=0;i<size;i++){
         arr [i] = sc.nextInt();
        }
       System.out.println("Enter element which want to insert:");
       int number = sc.nextInt();
       int index = 0;
       while(index<arr.length && arr[index]<number){
        array[index] = arr[index];
            index++;
       }
       array[index]=number;
       for(int i=index;i<size;i++){
        array[i+1] = arr[i];
       }
       System.out.println("new array");
    for(int i=0;i<size+1;i++){
        System.out.print
        (array[i]);
    }
    }
}
