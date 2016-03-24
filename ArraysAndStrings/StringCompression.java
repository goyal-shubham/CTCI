package ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 3/22/16.
 */
public class StringCompression
{

    public static void compressor(String input)
    {
        StringBuilder sb = new StringBuilder();
        char c = input.charAt(0);
        int count  = 1;
        sb.append(c);
        for(int i = 1; i < input.length(); i++)
        {
            char c1 = input.charAt(i);
            if(c1 == c)
            {
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(c1);
                count = 1;
                c = c1;
            }
        }
        sb.append(count);
        if(input.length() == sb.length() / 2)
        {
            System.out.println(input);
        }
        else
        {
            System.out.println(sb.toString());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        compressor(input);
    }
}
