public class MiddleCharacter {

	public static void main(String[] args) {
		String str="Nani";
		int length=str.length();
		if(length%2==0) {
			char ch1=str.charAt(length/2-1);
			char ch2=str.charAt(length/2);
			System.out.println("midlle charecter: "+ch1+ch2);
		}
		else {
			char ch=str.charAt(length/2);
			System.out.println(ch);
		}

	}

}