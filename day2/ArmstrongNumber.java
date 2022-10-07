package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=0;
		int sum=0,a=0;
		int temp=num;
		
		while(num > 0){
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if (sum==temp) {
			System.out.println("The num is Armstrong");
		
	}
	
		
	}

}
