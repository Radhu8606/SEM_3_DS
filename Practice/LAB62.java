import java.util.Scanner;
public class LAB62{
	public static void Employee_details_write(int employee_ID,String name,String designation,int salary){
	   System.out.println("print all details");
	   System.out.println(employee_ID);
	   System.out.println(name);
	   System.out.println(designation);
	   System.out.println(salary); 
	}
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter employee id");
	   int employee_ID = sc.nextInt();
	   System.out.println("enter name");
	   String name = sc.next();
	   System.out.println("enter designation");
	   String designation = sc.next();
	   System.out.println("enter salary");
	   int salary = sc.nextInt();
       Employee_details_write(employee_ID,name,designation,salary);
	}
}