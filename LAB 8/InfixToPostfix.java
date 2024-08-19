import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix{
	int top = 1;
	char polish = ' ';
	int rank = 0;
	char temp;
	Stack<Character> s = new Stack<>();
        int spf(char next){
          if(next == '+' || next == '-'){
            return 2;
          }
          else if(next == '*' || next == '/'){
            return 4;
          }
          else if(next == '^'){
            return 5;
          }
          else if(next>='A' && next<='Z' || next>='a' && next<='z'){
            return 8;
          }
          else if(next == '('){
            return 0;
          }
          else{
            System.out.println("Enter valid syntax");
            return -1;
          }
        }
        int ipf(char next){
          if(next == '+' || next == '-'){
            return 1;
          }
          else if(next == '*' || next == '/'){
            return 3;
          }
          else if(next == '^'){
            return 6;
          }
          else if(next>='A' && next<='Z' || next>='a' && next<='z'){
            return 7;
          }
          else if(next == '('){
            return 9;
          }
          else if(next == ')'){
            return 0;
          }
          else{
            System.out.println("Enter valid syntax");
            return -1;
          }
        }

        int rank(char temp){
            if(temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '^'){
              return -1;
            }
            else if(temp>='A' && temp<='Z' || temp>='a' && temp<='z'){
              return 1;
            }
            else{
              return -2;
            }
        }
	public void Postfix(String str){
      s.push('(');
      String polish="";
      for(int i=0;i<str.length();i++){
      	char next = str.charAt(i);
      	while(next != ' '){
      		if(top < 1){
      			System.out.println("Invalid String");
      			return;
      		}
      		else{
      			while(spf(s.peek()) > ipf(next)){
                    char temp =s.pop() ;
                    polish = polish + temp;
                    rank = rank + rank(temp);
                    if(rank < 1){
                    	System.out.println("Invalid String");
                      return ;
                    }
      			}
      		
      		if(spf(s.peek()) != ipf(next)){
      			s.push(next);
      		}
      		else{
      			s.pop();
      		}
      	}
      }
    }
      	if(top != 0 && rank!= 1){
      		System.out.println("Invalid String");
      	}
      	else{
      		System.out.println("Valid String");
      	}

      
        if(rank == 1 && str.isEmpty()){
          System.out.println(polish);
        }

      
	}

	
	
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter String:");
     String str = sc.next();
     InfixToPostfix obj = new InfixToPostfix();
     obj.Postfix(str);
}}