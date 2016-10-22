package TreeAndGraphs;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class FirstCommonAncestor
{
	public TreeNode firstCommonAncestor(TreeNode root, TreeNode firstNode, TreeNode secondNode)
	{
		if(root == null || firstNode == null || secondNode == null)
		{
			return null;
		}

		if(root == firstNode || root == secondNode)
		{
			return root;
		}

		TreeNode left = firstCommonAncestor(root.left, firstNode, secondNode);
		TreeNode right = firstCommonAncestor(root.right, firstNode, secondNode);

		if(left != null && right != null)
		{
			return root;
		}

		return left != null ? left : right;
	}
}
