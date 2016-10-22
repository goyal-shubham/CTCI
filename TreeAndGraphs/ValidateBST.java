package TreeAndGraphs;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class ValidateBST
{
	public boolean validateBST(TreeNode root)
	{
		return 	validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean validateBST(TreeNode root, int min, int max)
	{
		if(root == null)
		{
			return true;
		}

		if(root.data <= min && root.data > max)
		{
			return false;
		}

		if(!validateBST(root.left, min, root.data) || !validateBST(root.right, root.data, max))
		{
			return false;
		}

		return true;
	}
}
