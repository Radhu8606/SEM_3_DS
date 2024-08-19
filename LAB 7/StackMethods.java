import java.util.Scanner;
public class StackMethods{
	Scanner sc = new Scanner(System.in);
	static int [] stack;
	static int top=-1;
	static int size;

	StackMethods(int size){
		stack = new int[size];
		this.size = size;
	}
	static void push(int x){
		if(top>= size-1){
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		stack[top] = x;
		return;
	}


	static int pop(){
        if(top == -1){
        	System.out.println("Stack Underflow");
        	return(-1);
        }
        top--;
        return (stack[top+1]);
	}


    static int peep(int i){
    	if(top-i+1<=0){
    		System.out.println("Stack Underflow");
    		return(-1);
    	}
    	return(stack[top-i+1]);
    }

    static void change(int n,int j){
    	if(top-j+1<=0){
    		System.out.println("Stack Underflow");
    	}
    	(stack[top-j+1]) = n;
    }

    static void display(){
         for(int i=0;i<=top;i++){
         	System.out.println(stack[i]);
         }

    }   


    	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
    		StackMethods s= new  StackMethods(10);


       
       System.out.println("enter element:");
       int x = sc.nextInt();
       push(x);
       
       
       pop();

       System.out.println("enter that index from where you want to delete element:");
       int i = sc.nextInt();
        peep(i);

       System.out.println("Enter that index where you want to change element:");
       int j = sc.nextInt();

       System.out.println("Enter element which you want to change:");
       int n = sc.nextInt();
       change(j,n);
       
       System.out.println("Push");
       
       display();

       System.out.println("Pop");
       
       display();
       
       System.out.println("Peep");
       
       display();
       
       System.out.println("Change");
       
       display();
	}
}