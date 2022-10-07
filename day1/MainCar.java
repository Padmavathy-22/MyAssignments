package week1.day1;

public class MainCar {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		int output = obj.addThreeNum(2, 4, 3);
		System.out.println(output);
		float div = obj.divTwoNum(15, 3);
		System.out.println(div);
		boolean carpunct = obj.isCarPuncture();
		System.out.println(carpunct);
		int regNum =obj.getRegNum();
		System.out.println(regNum);
		float multiply = obj.mulThreeNum(2, 5, 10);
		System.out.println(multiply);
		
	}

}

