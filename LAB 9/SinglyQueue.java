import java.util.Scanner;
public class SinglyQueue{
	static int[] queue ;
    static 	int front = -1; 
static int rear = -1;
    static int size;
	int x;
	int y;

	SinglyQueue(int size){
        queue = new int[size];
		this.size = size;
	}

	static void enqueue(int x){
        if(rear >= size){
        	System.out.println("Queue Overflow");
        }
        else{
        	rear = rear+1;
        	queue[rear] = x;
        	if(front == 0){       	
        	front = front+1;
        	return;
        }
        
      }
        
	}

	int dequeue(){
		if(front == 0){
			System.out.println("Queue Underflow");
		}
		else{
			x = queue[front];
			if(front == rear){
               front = rear = 0;
			}
			else{
				front = front+1;
			}
			return y;
		}
		
	}
	void display(){
        for(int i=front;i<=rear;i++){
        	System.out.println(queue[i]);
        }
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		SinglyQueue q= new  SinglyQueue(10);
		System.out.println("Enter element");
		for(int i=0;i<size;i++){	
		int x = sc.nextInt();
		enqueue(x); 
		}
          q.dequeue();
          q.dequeue();

          q.display();
	}
}
