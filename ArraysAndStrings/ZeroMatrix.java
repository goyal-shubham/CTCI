package ArraysAndStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by shubhamgoyal on 3/23/16.
 */
public class ZeroMatrix {

    public int m;
    public int n;

    public  void zero_matrix(int[][] data)
    {
        Set<Integer> vecx = new HashSet<Integer>();
        Set<Integer> vecy = new HashSet<Integer>();

        System.out.println("here");
        for(int i = 0 ; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(data[i][j] == 0)
                {
                    vecx.add(i);
                    vecy.add(j);
                }
            }
        }
        System.out.println(vecx);
        System.out.println(vecy);
        for(int i : vecy)
        {
            for(int j = 0; j < m; j++)
            {
                data[j][i] = 0;
            }
        }

        for(int i : vecx)
        {
            for(int j = 0; j < n; j++)
            {
                data[i][j] = 0;
            }
        }
    }


    public void zero_matrix_book(int[][] data)
    {
        boolean rowZero = false;
        boolean colZero = false;

        for(int i = 0; i < m; i++)
        {
            if(data[i][0] == 0)
            {
                colZero = true;
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(data[0][i] == 0)
            {
                rowZero = true;
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(data[i][j] == 0)
                {
                    data[i][0] = 0;
                    data[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++)
        {
            if(data[i][0] == 0)
            {
                for(int j = 0; j < n; j++)
                {
                    data[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < n; i++)
        {
            if(data[0][i] == 0)
            {
                for(int j = 0; j < m; j++)
                {
                    data[j][i] = 0;
                }
            }
        }

        if(rowZero)
        {
            for(int i = 0; i < n; i++)
            {
                data[0][i] = 0;
            }
        }

        if(colZero)
        {
            for(int i = 0; i < m; i++)
            {
                data[i][0] = 0;
            }
        }



    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ZeroMatrix zc = new ZeroMatrix();
        System.out.println("m");
        zc.m = sc.nextInt();

        System.out.println("n");
        zc.n = sc.nextInt();

        int[][] data = new int[zc.m][zc.n];
        for(int i = 0; i < zc.m ; i++)
        {
            for(int j = 0; j < zc.n; j++)
            {
                System.out.println("here" + i +" " + j);
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println("out");
        PrintMatrix.printMatrix(data, zc.m, zc.n);
        System.out.println();
        zc.zero_matrix(data);
        System.out.println();
        PrintMatrix.printMatrix(data, zc.m, zc.n);

        System.out.println();
        //zc.zero_matrix_book(data);
        System.out.println();
        PrintMatrix.printMatrix(data, zc.m, zc.n);


    }
}
