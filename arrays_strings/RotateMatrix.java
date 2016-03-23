package arrays_strings;

import java.util.Scanner;

/**
 * Created by shubhamgoyal on 3/22/16.
 */
public class RotateMatrix {

    public static void rotate(int[][] input, int n)
    {
        for(int pos = 0; pos < n/2; pos++)
        {
            int start = pos;
            int end = n - 1 - start;
            for(int i = start; i < end; i++)
            {
                int offset = i - start;
                int data = input[start][i];

                input[start][i] = input[end - offset][start];

                input[end - offset][start] = input[end][end - offset];

                input[end][end - offset] = input[i][end];

                input[i][end] = data;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n; j++)
            {
                input[i][j] = sc.nextInt();
            }
        }
        PrintMatrix.printMatrix(input, n);
        rotate(input, n);
        PrintMatrix.printMatrix(input, n);
        rotate(input,n);
        PrintMatrix.printMatrix(input, n);

    }
}
