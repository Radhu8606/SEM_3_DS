import java.util.Scanner;
public class TemperatureConversion{
	//convert fahrenhit to celsius
	static void Fahrenhit(int f){
        double celsius = ((f - 32)*(5.0/9.0));
        System.out.println("Celsius of given fahrenhit:"+celsius);
	}

	 static void Celsius(int c){
		double fahrenhit = (c*(9.0/5.0))+32;
		System.out.println("Fahrenhit of given celsius:"+fahrenhit);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for convert into celsius and enter 2 for convert into fahrenhit:");
		int n = sc.nextInt();

		if(n==1){
			System.out.println("Enter temperature in fahrenhit:");
		    int f = sc.nextInt();
		    Fahrenhit(f);
		}
		else if(n==2){
			System.out.println("Enter temperature in celsius:");
		    int c = sc.nextInt();
		    Celsius(c);
		}
		else{
			System.out.println("plz enter valid number");
		}
	}
}