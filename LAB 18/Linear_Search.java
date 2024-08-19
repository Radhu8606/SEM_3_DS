import java.util.Scanner;
public class Linear_Search{

	int Linear_Search_array(int n){
		Scanner sc =  new Scanner(System.in);
		int[] array = new int[n];
		System.out.println("Enter element:");
		for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
		}

		System.out.println("Enter element which you want to find:");
		int x = sc.nextInt();
        int index = -1;
		for(int i=0;i<n;i++){
			if(x == array[i]){
               index = i;
              break;  
			}
		}

		if(index == -1){
			System.out.println("Given element is not found");
		}
		else{
			System.out.println("Index of given element is:"+index);
		}

		return index;
	}


	public static void main(String args[]){
		 Linear_Search a = new Linear_Search();
		 a.Linear_Search_array(5);
	}
}