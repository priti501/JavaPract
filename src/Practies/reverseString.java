package Practies;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Diptesh";
		
		char[] ch = name.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			System.out.print(ch[i]);
		}

	}

}
