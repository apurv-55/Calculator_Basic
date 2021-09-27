package Project_Calculator_Simplilearn_Copy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Calci_App 
{
	public static void main(String[] Arg)
	{
		final String inputexp = ReadInput.read_input();
		
		Queue<String> operators;
		Queue<String> numbers;
		
		String numbers_Arr[] = inputexp.split("[-+*/]");
		String oper_Arr[] = inputexp.split("[0-9]+");
		
		numbers = new LinkedList<String>(Arrays.asList(numbers_Arr));
		operators = new LinkedList<String>(Arrays.asList(oper_Arr));
		
		Double result = Double.parseDouble(numbers.poll());
		
		while (!numbers.isEmpty())
		{
			String opr = operators.poll();
			
			Operate operate;
			
			switch(opr)
			{
			case "+":
				operate = new Add();
				break;
			
			case"-":
				operate = new Subtract();
				break;
			
			case"*":
				operate = new Multiplication();
				break;
				
			case"/":
				operate = new Division();
				break;
				
				default:
					continue;
			
			}
			
			Double num = Double.parseDouble(numbers.poll());
			
			result = operate.getResult(result, num);
			
			
		}
		System.out.println("Result is " + result);
	}
}
