import java.util.Scanner;
public class LAB71{
    Scanner sc = new Scanner(System.in);
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      System.out.println("enter element:");
        int x = sc.nextInt();
          push(x);
    }
    int top=-1;
    System.out.println("enter number of element you want");
    int n = sc.nextInt();
    int [] s = new s[n];
    public void push(int x){
       if(top>=n){
        System.out.println("Stack Overflow");
       }
       else{
        top++;
        s[top] = x;
       }
    }
}