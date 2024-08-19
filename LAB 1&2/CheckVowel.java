import java.util.Scanner;
public class CheckVowel{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char character = sc.next().toUpperCase().charAt(0);
		if(character == 'A' || character =='E' || character =='I' || character =='O' || character =='U'){
			System.out.println("Given character is consonant");
		}
		else{
			System.out.println("Given character is vowel");
		}
	}
}