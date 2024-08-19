public class Copy{
	static class Node{
		int info;
		Node link;
		public  Node(int data){
			this.info = data;
			this.link = null;
		}
	}
	Node first = null;
	
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
     public Copy copyLL(){
     	if(first==null){
     		return null;
     	}
     	Node temp=first;
     	Copy L=new Copy();
     	while(temp!=null){
     	// System.out.println("HHEll");

     		L.insertAtFirst(temp.info);
     		temp=temp.link;
     	}
     	return L;
     }
    
     void display(Node first){
      	Node temp = first;
     	while(temp != null){
     		
     		System.out.println(temp.info);
     		temp = temp.link;
     	}
     }
   
	public static void main(String args[]){
      Copy inf = new Copy();
		  inf.insertAtFirst(20);
		  inf.insertAtFirst(21);
		  inf.insertAtFirst(22);
		  System.out.println("Original Linked List");
		  inf.display(inf.first);
		  // inf.display(inf.first);
	      Copy copy = inf.copyLL();
	      
	      System.out.println("Copied Linked List");
	      copy.display(copy.first);
	}
}