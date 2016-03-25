package String.Reverse;
//This program has been written to reverse a given string. 
import java.util.Scanner;

public class StringReverse {

	public void AcceptString()
	{
		String strWord;								//	Declaration of string variable.
		Scanner cS = new Scanner(System.in);		// Creating an object to accept a string.
		
		System.out.println("Please enter a string to be reversed :"); //Requesting user to enter a string.
		strWord = cS.nextLine();					// accepting a string from the user.
		
		System.out.println("The original word :");		// printing the original word.
		System.out.println(strWord);
		char []cRWord = strWord.toCharArray();			//converting string into a word.
		
		System.out.println("The reversed word :");		// printing the reverse word with for loop.
		for(int i = cRWord.length-1; i>=0; i-- )
		{
			System.out.print(cRWord[i]);
		}
	}
	
	public static void main(String[] args) {
		
		StringReverse objStr = new StringReverse();		// Creating an object for class.
		objStr.AcceptString();							// Calling a method from the class.
		
	}
	
}
