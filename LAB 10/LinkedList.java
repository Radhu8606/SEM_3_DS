	public class LinkedList{
	public  Node first = null;
	 
	 class Node{
		int info;
		Node link;
		public  Node(int data){
			this.info = data;
			this.link = null;
		}
	}
	// //to push an element
	// void push(int data){
	// 	 //create a new node
    //  	Node newNode = new Node(data);
    //    newNode.info = data;
    //    newNode.link = first; 
	// }
     //insert at first
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

     //insert at last
     public void insertAtLast(int data){
          //create a new node
     	Node newNode = new Node(data);

        //checks that first is null or not
     	if(first == null){
     		first = newNode;
     		return;
     	}
     	//first is not null therefor add a new node at last position
     	else{
     		Node last = first;
     		while(last.link != null){
     			last = last.link;
     		}
     		last.link = newNode;
     	}
     }

     //delete at first
     public void deleteAtFirst(){
     	//checks linkedlist is empty or not
     	if(first == null){
     		System.out.println("Linked List is empty");
     	}
     	else{
     		Node save = first;
     		first = first.link;
     		save = null;
     	}
     }
     
     //delete at last
     public void deleteAtLast(){
     	Node save=first;
     	Node pred=null;
     	if(first == null){
     		System.out.println("Linked list is empty");
     	}
     	else{
     	while(save.link!=null){
     		pred=save;
     		save=save.link;
     	}
     }
     	pred.link=null;
     	
     }
     //delete a node from given position
     void deleteAtFixedPosition(int x){
          //checks linkedlist is empty or not
     	if(first == null){
     		System.out.println("Linked List is empty");
     	}
     	else{
     		Node temp = first;
     		Node prev = null;
     	   //checks that we delete the node that node is first or not
     		if(temp.info == x){
               first = temp.link;
               return;
     		}
     		else{
     			while(temp.link != null && temp.info != x){
     				prev = temp;
     				temp = temp.link;
     			}
     			if(temp == null){
     				System.out.println("X is not in linked list");
     			}
     			else{
     				prev.link = temp.link;
     			}
     			
     		}
     	}
     }
     //insert a node in sorted linked list
     void insord(int data){
     	Node current = null ; 
            //to create a new node
     	Node newNode = new Node(data);

     	//if node which we want to insert is at first position
     	if(first == null || newNode.info <= first.info ){
     		newNode.link = first;
     		first = newNode;
     }
     else{
          while(current.link != null && newNode.info >= current.link.info){
          	current = current.link;
          }
          newNode.link = current.link;
          current.link = newNode;
     }
}
     //display the linkedlist
      void display(){
      	Node temp = first;
     	while(temp != null){
     		
     		System.out.println(temp.info);
     		temp = temp.link;
     	}
     	//System.out.println(temp.info);
     }

	public static void main(String[] args) {
		LinkedList inf = new LinkedList();
		 // inf.push(20);
		 // inf.push(21);
		 // inf.push(22);
		 // inf.push(23);
		 // inf.push(24);
	     inf.insertAtFirst(25);
	     inf.insertAtFirst(29);
	     // inf.display();
	     inf.insertAtFirst(34);
	     //inf.display();
	     // inf.deleteAtFirst();
	     // inf.display();
	      //inf.deleteAtLast();
	     // inf.display();
	      //inf.deleteAtFixedPosition(30);
	     // inf.display();
	      inf.insord(19);
	      inf.display();
	} 
}