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
        if(root.data == data)
        {
            root = root.next;
            return;
        }
        LL_node temp1 = root.next;
        while(temp1 != null)
        {
            if(temp1.data == data)
            {
                temp.next = temp1.next;
                temp1.next = null;
                return;
            }

            temp = temp.next;
            temp1 = temp1.next;

        }
        System.out.println("Data not found");
    }

    public static void main(String[] args) {

        LL_Basic myLL = new LL_Basic();
        myLL.insert(8);
        myLL.insert(10);
        myLL.insert(18);
        myLL.insert(28);
        myLL.insert(83);
        myLL.insert(82);

        myLL.printList();
        System.out.println();
        myLL.remove(82);
        myLL.remove(82);
        myLL.remove(18);
        myLL.printList();

    }


}
