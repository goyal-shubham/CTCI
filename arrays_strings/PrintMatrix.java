package arrays_strings;

/**
 * Created by shubhamgoyal on 3/22/16.
 */
public class PrintMatrix {

    public static void printMatrix(int[][] input , int n)
    {
        printMatrix(input,n,n);

    }

    public static void printMatrix(int[][] input , int n, int m)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

    }
}
