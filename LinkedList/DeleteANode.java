package LinkedList;

/**
 * Created by shubhamgoyal on 3/24/16.
 */
public class DeleteANode {

    public void deleteANode(LL_node n)
    {
        if( n == null || n.next == null)
        {
            System.out.println("Error");
            return;
        }

        LL_node temp = n.next;
        n.data = temp.data;
        n.next = temp.next;
    }
}
