package week1.day1;

public class Car {
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		String output = obj.getColour();
		System.out.println(output);
		int num = obj.addThreeNum(2, 4, 3);
		System.out.println(num);
		int regNum =obj.getRegNum();
		System.out.println(regNum);
		int diff = obj.subTwoNum(3,2);
		System.out.println(diff);
		float multiply=obj.mulThreeNum(2, 4, 5);
		System.out.println(multiply);
		float div = obj.divTwoNum(10, 5);
		System.out.println(div);
		boolean carpunct=obj.isCarPuncture();
		System.out.println(carpunct);
		
	}
	
	
	
	public void printCarName() {
	    System.out.println("Honda");
		}
	 private String getColour() {
		String colour = "Blue";
		return colour;
		
	}
		public boolean isCarPuncture() {
			boolean carpunct = true;
			return carpunct;
			
		}
		
		public int getRegNum() {
			int regNum = 8888;
			return regNum;
			
		}
		 int addThreeNum(int num1, int num2, int num3) {
			return num1+num2+num3;
			
		}
		private int subTwoNum(int num1, int num2) {
			int diff =num1-num2;
			return diff;
		}
		 float mulThreeNum(int num1,int num2, int num3) {
			float multiply = num1*num2*num3;
			return multiply;
			
		}
		public int divTwoNum(int num1, int num2) {
			int div = num1/num2;
			return div;
		}
}
		
	



	