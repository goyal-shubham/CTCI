package LinkedList;

import ArraysAndStrings.PrintMatrix;

import java.util.*;

/**
 * Created by shubhamgoyal on 3/23/16.
 */
public class MatchMatrix {

    public static int n;
    public int[][] data ;
    public int[][] MyGraph;
    public int[][] result;

    public void initializeMatrix()
    {
        data  = new int[n][n];
        MyGraph = new int[n*n][n*n];
        result = new int[n][n];


    }

    boolean[][] visited = new boolean[n][n];
    Integer[][] distance = new Integer[n][n];
    List<Integer[]> queue = new ArrayList<Integer[]>();

    public void Maze(int i, int j, int dist)
    {
        if(i == n - 1 && j == n - 1)
        {
            result[i][j] = dist + 1;
            return;
        }

        if( i >= 0 && j >= 0 && i < n && j < n && data[i][j] == 1)
        {
            result[i][j] = dist + 1;

            Maze( i + 1, j , dist + 1);

            Maze(i , j + 1, dist + 1);

            Maze( i + 1, j + 1, dist + 1);

        }

    }

    


    public void BFS(int[][] data)
    {
        int i = 0;

        boolean[] visited = new boolean[n*n];
        int[] distance = new int[n*n];
        List<Integer> queue1 = new ArrayList<Integer>();
        queue1.add(i);
        visited[i] = true;
        distance[i] = 0;
        while(!queue1.isEmpty())
        {
            int vertex = queue1.remove(0);
            int temp = vertex;
            while(temp < n*n)
            {
                if(data[vertex][temp] == 1 && !visited[temp])
                {
                    queue1.add(temp);
                    visited[temp] = true;
                    distance[temp] = distance[vertex] + 1;
                }
                temp++;
            }

        }
        System.out.println(distance[n-1]);
    }

    public void FindMatch()
    {
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {

                if(checkSquare(data[i][j] , i , j) ){
                    System.out.println( "checkSquare " + i + " " + j );

                }

                if(checkRow(data[i][j] , i , j))
                {
                    System.out.println("checkRow " + i + " " + j );
                }
                if(checkCol(data[i][j] , i , j))
                {
                    System.out.println("checkCol" + i + " " + j );
                }
                if(checkDiagonal(data[i][j] , i , j))
                {
                    System.out.println( "checkDiagonal " + i + " " + j );
                }
//                System.out.println(checkRow(data[i][j] , i , j) + " " + i + " " + j );
//
//                System.out.println(checkCol(data[i][j] , i , j) + " " + i + " " + j );
//
//                System.out.println(checkDiagonal(data[i][j] , i , j) + " " + i + " " + j );

            }

        }
    }

    public boolean checkSquare(int a, int i, int j)
    {
        if(i + 1 < n && j + 1 < n)
        {
            if(a == data[i+1][j] && a == data[i+1][j+1] && a == data[i][j+1])
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkRow(int a, int i, int j)
    {
        if( n - j >= 4)
        {
            for( int k = 0; k < 3; k++)
            {
                if(a != data[i][++j])
                {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    public boolean checkCol(int a, int i, int j)
    {
        if( n - i >= 4)
        {
            for( int k = 0; k < 3; k++)
            {
                if(a != data[++i][j])
                {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    public boolean checkDiagonal(int a, int i, int j)
    {
        if( n - i >= 4 && n - j >= 4)
        {
            for( int k = 0; k < 3; k++)
            {
                if(a != data[++i][++j])
                {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatchMatrix mm = new MatchMatrix();
        mm.n = sc.nextInt();
        mm.initializeMatrix();
        for(int i = 0; i < mm.n; i++)
        {
            for(int j = 0; j < mm.n; j++)
            {
                mm.data[i][j] = sc.nextInt();
            }
        }

        mm.Maze(0,0,0);
        PrintMatrix.printMatrix(mm.result, n);
        //mm.FindMatch();
      // mm.BFS(mm.MyGraph);
    }

}
