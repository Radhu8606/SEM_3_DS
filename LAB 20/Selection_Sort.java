import java.util.Scanner;

public class Selection_Sort {
    Scanner sc = new Scanner(System.in);

    public void selection() {  // Correct method declaration
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_index]) {  
                    min_index = j;
                }
            }

            if (min_index != i) {
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Selection_Sort sorter = new Selection_Sort();
        sorter.selection();  // Call the selection sort method
    }
}
