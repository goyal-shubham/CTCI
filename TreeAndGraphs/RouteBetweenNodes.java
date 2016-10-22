package TreeAndGraphs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class RouteBetweenNodes
{

	public static boolean search(Graph g, Node start, Node end)
	{
		if( start == end)
		{
			return true;
		}

		LinkedList<Node> myQueue = new LinkedList<>();
		start.state = State.VISITING;
		myQueue.add(start);
		while(!myQueue.isEmpty())
		{
			Node current = myQueue.removeFirst();
			if(current != null)
			{
				for(Node n : current.getAdjacentList())
				{
					if(n.state != State.VISITED)
					{
						if(n == end)
						{
							return true;
						}
						else
						{
							n.state = State.VISITING;
							myQueue.add(n);
						}
					}
				}
			}
			current.state = State.VISITED;
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int noOfVertices = sc.nextInt();
		Graph myGraph = createNewGraph(noOfVertices);
		Node[] vertices = myGraph.getVertices();

		Node start = vertices[0];
		Node end = vertices[5];
		if(search(myGraph, start, end))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

	private static Graph createNewGraph(int noOfVertices)
	{
		Graph g = new Graph(noOfVertices);

		Node[] vertices = g.getVertices();
		vertices[0] = new Node("a");
		vertices[1] = new Node("b");
		vertices[2] = new Node("c");
		vertices[3] = new Node("d");
		vertices[4] = new Node("e");
		vertices[5] = new Node("f");

		vertices[0].addAdjacentList(vertices[1]);
		vertices[0].addAdjacentList(vertices[2]);
		vertices[1].addAdjacentList(vertices[2]);
		vertices[3].addAdjacentList(vertices[4]);
		vertices[3].addAdjacentList(vertices[5]);
		vertices[4].addAdjacentList(vertices[2]);
		vertices[5].addAdjacentList(vertices[4]);
		vertices[5].addAdjacentList(vertices[0]);
		g.printGraph();
		return g;

	}
}

enum State
{
		VISITED, VISITING, UNVISITED
}

class Graph
{
	private Node[] vertices;
	public int noOfVertices;

	public Graph(int noOfVertices)
	{
		this.noOfVertices = noOfVertices;
		vertices = new Node[noOfVertices];
	}

	public Node[] getVertices()
	{
		return vertices;
	}

	public void printGraph()
	{
		for(Node n : vertices)
		{
			System.out.print(n.vertex + "->");
			LinkedList<Node> adjacentList = n.getAdjacentList();
			for(Node neighbor : adjacentList)
			{
				System.out.print(" " + neighbor.vertex);
			}
			System.out.println();
		}
	}

}

class Node
{
	String vertex;
	LinkedList<Node> adjacentList;
	State state;

	public Node(String vertex)
	{
		this.vertex = vertex;
		adjacentList = new LinkedList<>();
	}

	public void addAdjacentList(Node n)
	{
		this.adjacentList.add(n);
	}

	public LinkedList<Node> getAdjacentList()
	{
		return adjacentList;
	}
}
