import java.util.Scanner;
public class DeleteInArray {
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
        System.out.println(("Enter index of number:"));
        int index = sc.nextInt();
    
    for(int i=0;i<index;i++){
        array[i] = arr[i];
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
