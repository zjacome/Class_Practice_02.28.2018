import java.util.Scanner;
public class Last_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String object=in.next();
		String text=object;
		
		int S1=text.length();
		
		char S2=text.charAt(S1-1);
		System.out.println("The last letter of the word is "+S2);
		
	}

}
