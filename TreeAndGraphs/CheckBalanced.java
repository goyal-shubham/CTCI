package TreeAndGraphs;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class CheckBalanced
{
	public boolean checkBalanced(TreeNode root)
	{
		if(checkHeight(root) != -1)
		{
			return true;
		}
		return false;
	}

	public int checkHeight(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}

		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1)
		{
			return -1;
		}

		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1)
		{
			return -1;
		}

		int heightDiff = Math.abs(leftHeight - rightHeight);
		if(heightDiff <= 1)
		{
			return Math.max(leftHeight, rightHeight) + 1;
		}
		else
		{
			return -1;
		}
	}
}
