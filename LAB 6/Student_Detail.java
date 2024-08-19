import java.util.Scanner;
public class Student_Detail{
	int Enrollment_No;
	String Name;
	int Semester;
	double CPI ;
	Student_Detail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter enrollment");
		this.Enrollment_No = sc.nextInt();
		System.out.println("enter name");
		this.Name = sc.next();
		System.out.println("enter semester");
		this.Semester = sc.nextInt();
		System.out.println("enter cpi");
		this.CPI = sc.nextDouble();
	}
     void display(){
        System.out.println("Student enrollment number"+this.Enrollment_No);
        System.out.println("Student name"+this.Name);
        System.out.println("Student semester"+this.Semester);
        System.out.println("Student CPI"+this.CPI);
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of person whose details we want:");
		int n = sc.nextInt();
		Student_Detail [] array = new Student_Detail[n];
		for(int i=0;i<n;i++){
			System.out.println("person"+(i+1));
			array[i] = new Student_Detail();
			array[i].display();
		}
		
	}
}