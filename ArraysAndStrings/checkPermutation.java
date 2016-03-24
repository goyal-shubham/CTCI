package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class checkPermutation {
	
	static String input1;
	static String input2;
	
	public static String sorting(String s)
	{
		char[] st1 = s.toCharArray();
		Arrays.sort(st1);
		return new String(st1);
	}
	
	public static void permutation()
	{
		input1 = sorting(input1);
		input2 = sorting(input2);
		
		if(input1.equals(input2))
		{
			System.out.println("permutation");
		}
	}
	
	public static boolean permutationMap()
	{
		int[] data = new int[128];
		char[] data1 = input1.toCharArray();
		for(char c: data1)
		{
			data[c]++;
		}
		
		for(int i = 0; i < input2.length(); i++)
		{
			int c = (int) input2.charAt(i);
			data[c]--;
			if(data[c] < 0)
			{
				System.out.println("Not permutaion");
				return false;
			}
		}
		System.out.println("Permutation");
		return true;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of operations");
		int n = sc.nextInt();
		sc.nextLine();
		while(true){
			System.out.println("Enter first string");
			input1 = sc.nextLine();
			System.out.println("Enter second String");
			input2 = sc.nextLine();
			permutation(); // myMethod
			permutationMap(); // BookMethod
			
		}
				
	}
	
	
	
}
