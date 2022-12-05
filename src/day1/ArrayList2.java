package day1;
import java.util.ArrayList;
import org.testng.annotations.Test;
public class ArrayList2 
//count the no of names starting with alphabet A in a List.
{
	@Test
	public void regular()
	{
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ramakant");
		names.add("Umakant");
		names.add("Anshuman");
		names.add("Swasti");
		names.add("Aditya");
		int count = 0;
		for(int i =0;i<=names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}	
		}
		System.out.println(count);
	}
}
