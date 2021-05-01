package Practies;

public class CountCharacter {

	public static void main(String[] args) {
		
		String string = "Hello Diptesh";
		int count = 0;
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}

}
