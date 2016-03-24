package ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 3/23/16.
 */
public class StringRotation {

    public String s1;
    public String s2;

    public boolean isRotation()
    {
        s1 = s1+s1;
        return isSubstring();
    }

    public boolean isSubstring()
    {
        int j = 0;
        System.out.println(s1);
        System.out.println(s2);
        for(int i = 0 ; i < s1.length() && j <s2.length(); i++)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                j++;
                continue;
            }
            if(s1.charAt(i) != s2.charAt(j) && j != 0)
            {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringRotation sr = new StringRotation();
        sr.s1 = sc.nextLine();
        sr.s2 = sc.nextLine();
        System.out.println(sr.isRotation());

    }
}
