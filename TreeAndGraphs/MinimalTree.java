package TreeAndGraphs;

/**
 * Created by shubham.goyal on 9/23/16.
 */
public class MinimalTree
{
	public TreeNode createMinimalTree(int[] data)
	{
		if(data == null)
		{
			return null;
		}

		return createMinimalTreeAux(data, 0 , data.length - 1);
	}

	private TreeNode createMinimalTreeAux(int[] data, int start, int end)
	{
		if(end < start)
		{
			return null;
		}
		int mid = (start + end )/ 2;
		TreeNode root = new TreeNode(data[mid]);
		root.left = createMinimalTreeAux(data, start, mid - 1);
		root.right = createMinimalTreeAux(data, mid + 1, end);
		return root;
	}
}
