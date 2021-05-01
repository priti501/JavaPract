package Practies;

public class fabonnaciseries {

	public static void main(String[] args) {
		
		int a =0, b=1, num;
		
		System.out.print(a+" "+b);
		
		for(int i=1; i<=20; i++) {
			
			num = a+b;
			
			System.out.print(" "+num);
			
			a=b;
			b=num;
		}

	}

}
