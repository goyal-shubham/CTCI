package arrays_strings;

import java.util.Scanner;

public class One_Away {
	
	public static boolean oneAway(String input1, String input2)
	{
		if(Math.abs(input1.length() - input2.length()) != 1)
		{
			return false;
		}
		
		if(input1.length() == input2.length())
		{
			return replacement(input1, input2);
		}
		else if(input1.length() + 1 ==  input2.length())
		{
			return substitution(input2, input2);
		}
		else if(input1.length() - 1 == input2.length())
		{
			return substitution(input1, input2);
		}
		return false;
	}
	
	public static boolean replacement(String input1, String input2)
	{
		boolean diff = false;
		for(int i = 0; i < input1.length(); i++)
		{
			if(input1.charAt(i) != input2.charAt(i))
			{
				if(diff)
				{
					return false;
				}
				diff = true;
			}
		}
		return true;
	}
	
	public static boolean substitution(String input1, String input2)
	{
		int diff = 0;
		for(int i = 0 ; i < input1.length(); i++)
		{
			if(input1.charAt(i) != input2.charAt(i + diff))
			{
				diff--;
				if( diff != -1)
				{
					return false;
				}
				
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		System.out.println(oneAway(input1, input2));
		
	}
	
	
	
}
