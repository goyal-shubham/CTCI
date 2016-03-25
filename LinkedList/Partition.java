package LinkedList;

/**
 * Created by shubhamgoyal on 3/24/16.
 */
public class Partition {

    LL_Basic myLL = new LL_Basic();

    //My Solution
    public void partition(int k)
    {
        if(myLL.root == null)
        {
            System.out.println("Empty list");
            return;
        }

        LL_Basic small = new LL_Basic();
        LL_Basic large = new LL_Basic();

        LL_node temp = myLL.root;
        while(temp != null)
        {
            if(temp.data < k)
            {
                small.insert(temp.data);
            }
            else
            {
                large.insert(temp.data);
            }
            temp = temp.next;
        }
        temp = small.root;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = large.root;
        System.out.println();
        small.printList();

    }

    //Book solution
    public void partition1(int k)
    {
        LL_node head = myLL.root;
        LL_node tail = myLL.root;

        LL_node temp = head.next;

        while(temp != null)
        {
            LL_node temp1 = temp.next;

            if(temp.data < k)
            {
                temp.next = head;
                head = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }

            temp = temp1;
        }

        tail.next = null;
        System.out.println();
        myLL.root = head;
        myLL.printList();
    }

    public static void main(String[] args) {

            Partition ktl = new Partition();
            ktl.myLL.insert(1250);
            ktl.myLL.insert(150);
            ktl.myLL.insert(10);
            ktl.myLL.insert(51);
            ktl.myLL.insert(50);
            ktl.myLL.insert(501);
            ktl.myLL.printList();
            ktl.partition(151);

            ktl.partition1(151);
    }
}
