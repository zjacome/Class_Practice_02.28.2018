import java.util.Scanner;
public class Penultimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String object=in.next();
		String text=object;
		
		char s4=First(object);
		System.out.println("First letter is " +s4);
		char s5=Last(object);
		System.out.println("The penultimate letter is "+s5);
	

	}
	
	public static char First(String text) {
		
		char S3=text.charAt(0);
		return S3;
	}
	public static char Last(String text) {
		int S1=text.length();
		char S2=text.charAt(S1-2);
		return S2;
		
	}
}
