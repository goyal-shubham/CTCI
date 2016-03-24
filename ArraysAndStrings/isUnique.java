package ArraysAndStrings;
import java.util.HashMap;
import java.util.Scanner;

public class isUnique {
	
	static boolean isUnique(char[] data)
	{
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for(int i = 0; i < data.length; i++)
		{
			if(!map.containsKey(data[i]))
			{
				map.put(data[i], true);
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int flag = 0;
		char[] data = input.toCharArray();
		for(int i = 0; i < data.length; i++)
		{
			for(int j = i+1; j < data.length; j++)
			{
				if(data[i] == data[j])
				{
					System.out.println("Not unique");
					flag = 1;
					break;
				}
			}
		}
		if( flag == 0)
		{
			System.out.println("Is Unique");
		}
		if(!isUnique(data))
		{
			System.out.println("Not unique");
		}
		else
		{
			System.out.println("Is Unique");
		}
		
	}
}
