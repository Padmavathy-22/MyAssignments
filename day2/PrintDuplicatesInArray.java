package week1.day2;



public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] input= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length1=input.length;
		int count;
		
		for (int i=0;i<length1-1;i++) {
			count=0;
			for(int j=i+1;j<length1;j++) {
				if(input[i]==input[j]) {
					count++;
					}
								}
				//System.out.println(count);
		
			if (count>0) {
				System.out.println(input[i]);
			}
	}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}