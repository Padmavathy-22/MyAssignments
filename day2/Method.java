package week1.day2;

import week1.day1.Car;
public class Method {
	public static void main(String[] args) {
		Car obj = new Car();
		int regNum= obj.getRegNum();
		System.out.println(regNum);
		boolean carpunct=obj.isCarPuncture();
		System.out.println(carpunct);
		obj.printCarName();
		float div=obj.divTwoNum(10, 5);
		System.out.println(div);
		
		
		
		
		
		
		
	}
	

}
