package arrays_strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] data1 = input1.toCharArray();
		boolean oddFlag = false;
		int count = 0;
		for(int i = 0;i < input1.length(); i++)
		{
			int i1 = 0;
			if(data1[i] == ' ')
			{
				continue;
			}
			if(map.containsKey(data1[i]))
			{
				i1 = map.get(data1[i]);
			}
			map.put(data1[i], i1 + 1);
			count++;
		}
		
		System.out.println(map);
		if( count % 2 == 0)
		{
			for( Integer i : map.values())
			{
				if(i % 2 == 1)
				{
					System.out.println("Not permutation");
					System.exit(0);
				}
			}
			
		}
		else
		{
			int oddCount = 0;
			int evenCount = 0;
			for( Integer i : map.values())
			{
				if(i % 2 == 1)
				{
					oddCount++;
				}
			}
			if(oddCount % 2 == 1)
			{
				System.out.println("not permutation");
				System.exit(0);
			}
		}
		System.out.println("permutation");
	}
}
