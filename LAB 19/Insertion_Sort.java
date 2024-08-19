import java.util.Scanner;

public class Insertion_Sort {
    Scanner sc = new Scanner(System.in);

    public void insertion() {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int k = 0; k < n; k++) {
            array[k] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {  // Correct loop control
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;  // Decrement j
            }
            array[j + 1] = key;  // Place the key in its correct position
        }

        System.out.println("Sorted array:");
        for (int m = 0; m < n; m++) {
            System.out.println(array[m]);
        }
    }

    public static void main(String[] args) {
        Insertion_Sort i = new Insertion_Sort();
        i.insertion();
    }
}
