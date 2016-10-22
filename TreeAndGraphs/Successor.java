package TreeAndGraphs;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class Successor
{
	public TreeNode getSuccessor(TreeNode node)
	{
		if(node == null)
		{
			return null;
		}

		if(node.right != null)
		{
			TreeNode newNode = node.right;
			while(newNode.left != null)
			{
				newNode = newNode.left;
			}
			return newNode;
		}
		else
		{
			TreeNode current = node;
			TreeNode parent = current.parent;
			while(parent != null && parent.left != current)
			{
				current = parent;
				parent = current.parent;
			}

			return parent;
		}
	}
}
