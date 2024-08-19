
import java.util.Scanner;
public class CountNode{
		class Node{
		int info;
		Node link;
		public  Node(int data){
			this.info = data;
			this.link = null;
		}
	}
	public  void insertAtFirst(int data){
         //create a new node
     	Node newNode = new Node(data);

        //checks that first is null or not
     	if(first == null){
     		first = newNode;
     		return;
     	}
     	//first is not null therefor adds a new node at first position
     	else{

            Node temp = first;
            first = newNode;
            first.link = temp;
        
     	}
     }
	Node first = null;
	Node save = null;
	int count = 0;
	public int Count_Node(){
		if(first == null){
			count = 0;
			return count;
		}
		else{
			save = first;
			while(save.link != null){
				save = save.link;
				count = count +1;
			}
			return count;
		}
	}
	public static void main(String args[]){
     CountNode inf = new CountNode();
		  inf.insertAtFirst(20);
		  inf.insertAtFirst(21);
		  inf.insertAtFirst(22);
		  inf.insertAtFirst(23);
		  inf.insertAtFirst(24);
	      inf.insertAtFirst(25);
	      inf.insertAtFirst(29);
	      inf.insertAtFirst(34);
	      inf.Count_Node();
	}
}