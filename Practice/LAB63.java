import java.util.Scanner;
public class LAB63{
	String name;
    int semester;
    double cpi;
    int enrollment_number;

	public student_Detail(String name,int semester,double cpi,int enrollment_number){
       this.name = name;
       this.semester = semester;
       this.cpi = cpi;
       this.enrollment_number = enrollment_number;
	}
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 student_Detail[] student = new student_Detail[5];

		 for(int i=1;i<=5;i++){
		 	System.out.println("enrollment_number");
		 	int enrollment_number = sc.nextInt();
            System.out.println("name");
		 	String name = sc.nextLine();
		 	System.out.println("semester");
		 	int semester = sc.nextInt();
		 	System.out.println("cpi");
		 	double cpi = sc.nextDouble();
		 }
	}
}