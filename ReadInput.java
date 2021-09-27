package Project_Calculator_Simplilearn_Copy;

import java.util.Scanner;

public class ReadInput 
{

	public static String read_input()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Expression: \n");
		String input = scan.nextLine();
		
		scan.close();
		return input;
	}
}
