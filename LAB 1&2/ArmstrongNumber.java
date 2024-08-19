public class ArmstrongNumber{
	public static void main(String args[]){
		for(int i=1;i<=1000;i++){
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstrong(int number){
         int originalnumber = number;
         int numberofdigit = String.valueOf(number).length();
         int sum=0;
         while(number>0){
         	int digit = number % 10;
         	sum += Math.pow(digit,numberofdigit);
         	number = number/10;
         }
         return sum == originalnumber;
   	}
}