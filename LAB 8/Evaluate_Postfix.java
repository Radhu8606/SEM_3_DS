import java.util.Scanner;
import java.util.Stack;
public class Evaluate_Postfix{
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

	void Evalution_Postfix(String postfix){
		for(int i=0;i<postfix.length();i++){
		temp = postfix.charAt(i);
		if(Character.isDigit(temp)){
			s.push(Integer.parseInt(String.valueOf(temp)));
		}
		else{
           operand2 = s.pop();
           operand1 = s.pop();
           value = Perform_Operation(operand1,operand2,temp);
           s.push(value);
		}
	}
	  
  }
	
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter postfix string:");
    String postfix = sc.next();
    Evaluate_Postfix abc = new Evaluate_Postfix();
    abc.Evalution_Postfix(postfix);
    System.out.println(abc.s.pop());
	}
}