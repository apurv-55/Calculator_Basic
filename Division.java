package Project_Calculator_Simplilearn_Copy;

public class Division implements Operate
{
	@Override
	public Double getResult(Double...numbers)
	{
		Double res = numbers[0];
		
		for (int i = 1; i< numbers.length; i++)
		{
			res /= numbers[i];
		}
		return res;
	}
}
