package Practies;

public class reversenumber {
	
	public static void main (String arge[]) {
		
		int num=12345, rev=0;
		
		while(num !=0) {
			int digit = num % 10;
			
			rev=rev*10 + digit;
			
			num = num/10;
		
		}
		
		System.out.print(rev);
			
			
			
			
		}
	

}
