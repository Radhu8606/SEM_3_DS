import java.util.Scanner;
public class CircularQueue{
	static int [] queue;
	static int size;
	static int front = -1;
	static int rear = -1;
	CircularQueue(int size){
		 queue = new int[size];
		this.size = size;
	}
	 static void cqinsert(int x){
         if((rear + 1) % size == front){
         	System.out.println("Queue Underflow");
         	return;
         }
         else{
         	 if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;

        queue[rear] = x;
         }
	 }

	 void cqdelete(){
	 	if(front == -1){
	 		System.out.println("Queue Underflow");
	 	}
	 	else{
	 		// int y = queue[front];
	 		if(front == rear){
	 			front = rear = -1;
	 			
	 		}
	 		else{
	 			front = (front + 1) % size;
	 		}
	 	}
	 }

	 void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Hello"); 
        int i = front;
        while (true) {
            System.out.println(queue[i]);
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
    }
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    CircularQueue c = new CircularQueue(5);

    System.out.println("Enter element");
		for(int i=0;i<size;i++){	
		int x = sc.nextInt();
		c.cqinsert(x); 
		}
          c.cqdelete();
          c.cqdelete();
          c.cqdelete();

	}
}