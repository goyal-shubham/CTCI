package LinkedList;

/**
 * Created by shubhamgoyal on 3/23/16.
 */

public class LL_Basic {

    LL_node root ;

    public LL_Basic() {
        this.root = null;
    }

    public void printList()
    {
        if(root == null)
        {
            System.out.println("Empty");
            return;
        }
        LL_node temp = root;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insert(int data)
    {
        LL_node node = new LL_node(data);
        if(root == null)
        {
            root = node;
            return;
        }
        LL_node temp = root;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;

    }

    public void remove(int data)
    {
        LL_node temp = root;
        if(root == null)
        {
            System.out.println("Empty list");
            return;
        }
        if(temp.data == data)
        {
            //temp.next;
        }
        while(temp != null)
        {
            if(temp.data == data)
            {
              //  temp.next;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {


    }


}
