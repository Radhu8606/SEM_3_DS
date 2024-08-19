import java.util.Scanner;
public class Game {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    String [] str = new String[size];
    System.out.println("Enter word:");
    for(int i=0;i<size;i++){
        str[i] = sc.nextLine();
    }
    System.out.println("Enter a random number:");
    int a = sc.nextInt();
    System.out.println(str[a]);
  }
}