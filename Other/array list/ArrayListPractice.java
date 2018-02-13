/**
 * AP Computer Science									Name ___________________________
 * ArrayList Review/Self-Quiz
 * 
 * Read this code and predict the output. Then run the program to check your predictions.
 */
 
import java.util.ArrayList;

public class ArrayListPractice
{
	public static void main(String[] pirateSayings)
	{
		ArrayList<String> letters = new ArrayList<String>();
		
		// #0
		System.out.println(letters.size() + " " + letters.isEmpty());
								
		// #1
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");

		System.out.println(letters.size() + " " + letters.isEmpty());

		// #2 
		System.out.println(letters);
		System.out.println(letters.get(3));

		// #3
		letters.add("e");
		letters.add(2,"x");
		System.out.println(letters);
				
		// #4
		letters.set(0,"z");
		letters.remove("c");	
		letters.remove(3);
		System.out.println(letters);
		
		// #5
		for (int i=letters.size()-1; i>=0; i--)
			System.out.print(letters.get(i));
		System.out.println();	
		
		// #6
		for (String let: letters)
			System.out.print(let);
		System.out.println();
			
		// #7
		ArrayList<String> more = new ArrayList<String>();
		more.add("q");
		more.add("r");
		more.add("s");
		
		for (String let : more)
			letters.add(0, let);
			
		System.out.println(letters);
	}
}
