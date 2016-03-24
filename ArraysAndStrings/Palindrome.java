package ArraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class Palindrome {

	static String input1;


	public static boolean isPalin_optimal()
	{
		int odd = 0;
		char[] data1 = input1.toCharArray();
		int[] result = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c : data1)
		{
			if(c == ' ')
			{
				continue;
			}
			int i = Character.getNumericValue(c) - Character.getNumericValue('a');

			result[i]++;
			if(result[i] % 2 == 1)
			{
				odd++;
			}
			else
			{
				odd--;
			}


		}
		return odd <= 1;
	}

	public static boolean isPalin_permu()
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] data1 = input1.toCharArray();
		boolean oddFlag = false;
		int count = 0;
		for(int i = 0; i < input1.length(); i++)
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
		System.out.println(count);
		if( count % 2 == 0)
		{
			for( Integer i : map.values())
			{
				if(i % 2 == 1)
				{
					System.out.println("Not permutation");
					return false;
				}
			}

		}
		else
		{
			for( Integer i : map.values())
			{
				if(i % 2 == 1)
				{
					if(oddFlag != true)
					{
						oddFlag = true;
					}
					else
					{
						return false;
					}
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextLine();

		System.out.println(isPalin_permu());
		System.out.println(isPalin_optimal());
		sc.close();
	}
}
