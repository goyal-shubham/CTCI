package arrays_strings;

import java.util.Scanner;

public class URLify {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length = input.length();
		char[] data = input.toCharArray();
		int spaceCount = 0;
		for(int i = 0 ; i < length ; i++)
		{
			if( data[i] == ' ')
			{
				spaceCount++;
			}
		}
		int newLength = length + (spaceCount * 2);
		length--;
		char[] data1 = new char[newLength];
		for(int i = newLength - 1; i >= 0; i-- )
		{
			if(data[length] == ' ')
			{
				data1[i--] = '0';
				data1[i--] = '2';
				data1[i] = '%';
			}
			else
			{
				data1[i] = data[length];
			}
			length--;
		}
		for(int i = 0 ; i < data1.length; i++)
		{
			System.out.print(data1[i]);
		}
	}
}
