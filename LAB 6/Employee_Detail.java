import java.util.Scanner;
public class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;
    Employee_Detail(){

    	System.out.println("enter employee id");
    	this.Employee_ID = sc.nextInt();
    	System.out.println("enter employee name");
    	this.Name = sc.nextLine();
    	System.out.println("enter employee designation");
    	this.Designation = sc.nextLine();
    	System.out.println("enter employee salary");
    	this.Salary = sc.nextDouble();
    }
    void display(){
        System.out.println(this.Employee_ID);
        System.out.println(this.Name);
        System.out.println(this.Designation);
        System.out.println(this.Salary);
    }
    public static void main(String args[]){
    	
         Employee_Detail emd = new Employee_Detail();
         emd.display();
    }
 }