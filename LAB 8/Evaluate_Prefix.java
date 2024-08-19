import java.util.Stack;
import java.util.Scanner;
public class Evaluate_Prefix{
	int top = 0;
	int value = 0;
	Stack<Integer> s = new Stack<>();
	int operand1 ;
	int operand2;
	char temp;
	
    
    int Perform_Operation(int a,int b,char t){
    	if(t == '+'){
    		value = a+b;
    		return value;
    	}
    	else if(t == '-'){
           value = a-b;
    		return value;
    	}
    	else if(t == '*'){
            value = a*b;
    		return value;
    	}
    	else if(t == '/'){
            value = a/b;
    		return value;
    	}
    	else{
    		return -1;
    	} 
    }

	void Evalution_Prefix(String prefix){
		for(int i=prefix.length()-1;i>=0;i--){
		temp = prefix.charAt(i);
		if(Character.isDigit(temp)){
			s.push(Integer.parseInt(String.valueOf(temp)));
		}
		else{
           operand1 = s.pop();
           operand2 = s.pop();
           value = Perform_Operation(operand1,operand2,temp);
           s.push(value);
		}
	}
	  
  }
	
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter prefix string:");
    String prefix = sc.next();
    Evaluate_Prefix abc = new Evaluate_Prefix();
    abc.Evalution_Prefix(prefix);
    System.out.println(abc.s.pop());
	}
}