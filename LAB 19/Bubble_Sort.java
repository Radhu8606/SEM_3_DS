import java.util.Scanner;

public class Bubble_Sort {
    Scanner sc = new Scanner(System.in);

    public void bubble() {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int exchs;
        for (int i = 0; i < n - 1; i++) {
            exchs = 0;
            for (int j = 0; j < n - 1 - i; j++) {  
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    exchs++;
                }
            }
           
            if (exchs == 0) {
                break;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Bubble_Sort a = new Bubble_Sort();
        a.bubble();
    }
}
