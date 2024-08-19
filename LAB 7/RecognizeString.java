import java.util.Scanner;
public class RecognizeString{
	static char [] s = new char[100];
	static int top = 1;
	char x;
	public  void push(char x){
		if(top>= s.length-1){
			System.out.println("Stack Overflow");
			return;
		}
		
		x = s[++top];
		return;
	}

	static char pop(){
        if(top == -1){
        	System.out.println("Stack Underflow");
        	return '\0';
        }
        
        return (s[top--]);
	}

	public void recognize(String str){
		
         s[++top] = 'c'; // Push 'c' onto the stack
        int i = 0;
        while (i < str.length() && str.charAt(i) != ' ') {
            char next = str.charAt(i);
            push(next);
            i++;
        }
        
        // Skip the space character
       

        while (i < str.length() && str.charAt(i) != ' ') {
            char next = str.charAt(i);
            char x = pop();
            if (next != x) {
                System.out.println("Invalid String");
                return;
            }
            i++;
        }

        if (i == str.length()) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
       RecognizeString reg = new RecognizeString();
       reg.recognize(str);
	}
}