package TreeAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class ListOfDepths
{
	// using Level-order traversal
	public ArrayList<LinkedList<TreeNode>> createListOfDepths(TreeNode root)
	{
		ArrayList<LinkedList<TreeNode>> listOfList = new ArrayList<>();
		if(root == null)
		{
			return null;
		}

		LinkedList<TreeNode> currentLevelList = new LinkedList<>();
		currentLevelList.add(root);

		while(!currentLevelList.isEmpty())
		{
			listOfList.add(currentLevelList);
			LinkedList<TreeNode> previousLevelList = currentLevelList;
			currentLevelList = new LinkedList<>();
			for(TreeNode nodes : previousLevelList )
			{
				if(nodes.left != null)
				{
					currentLevelList.add(nodes);
				}
				if(nodes.right != null)
				{
					currentLevelList.add(nodes);
				}
			}
		}
		return listOfList;
	}

	// ( Book Solution) using modified Pre-order Traversal
	public ArrayList<LinkedList<TreeNode>> createListOfDepthsPreOrder(TreeNode root)
	{
		ArrayList<LinkedList<TreeNode>> listOfList = new ArrayList<>();
		int level = 0;
		createListOfDepthsPreOrder(root, listOfList, level);
		return listOfList;
	}

	private void createListOfDepthsPreOrder(TreeNode root, ArrayList<LinkedList<TreeNode>> listOfList, int level)
	{
		if(root == null)
		{
			return;
		}
		LinkedList<TreeNode> currentLevelList = null;
		if(listOfList.size() == level)
		{
			currentLevelList = new LinkedList<>();
			listOfList.add(currentLevelList);
		}
		else
		{
			currentLevelList = listOfList.get(level);
		}

		currentLevelList.add(root);
		createListOfDepthsPreOrder(root.left, listOfList, level + 1);
		createListOfDepthsPreOrder(root.right, listOfList, level + 1);
	}
}
