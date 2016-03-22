package arrays_strings;

import java.util.Arrays;
import java.util.Scanner;

public class checkPermutation {
	
	public static char[] sorting(String s)
	{
		char[] st1 = s.toCharArray();
		Arrays.sort(st1);
		return st1;
	}
	
	public static boolean permutationMap(char[] input1, char[] input2)
	{
		int[] data = new int[128];
		for(int i = 0; i < input1.length; i++)
		{
			data[input1[i]]++;
		}
		for(int i = 0; i < input2.length; i++)
		{
			data[input2[i]]--;
			if(data[input2[i]] == -1)
			{
				System.out.println("not permutation");
				return false;
			}
		}
		System.out.println("Permutation");
		return true;
	}
	
	public static boolean permutation(char[] data1, char[] data2)
	{
		if(data1.length != data2.length)
		{
			System.out.println("Not permutation");
			return false;
		}
		for(int i = 0; i < data1.length; i++)
		{
			if(data1[i] != data2[i])
			{
				System.out.println("Not permutation");
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String input1 = sc.nextLine();
			String input2 = sc.nextLine();
			input1 = input1.replaceAll(" ", "");
			input2 = input2.replaceAll(" ", "");
			char[] data1 = sorting(input1);
			char[] data2 = sorting(input2);
			if(permutation(data1, data2))
			{
				System.out.println("Pemutation");
			}
			if(permutationMap(data1, data2)){
				
			}
		}
				
	}
	
	
	
}
