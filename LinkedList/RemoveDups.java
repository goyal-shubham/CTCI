package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by shubhamgoyal on 3/24/16.
 */
public class RemoveDups {

    LL_Basic myLL = new LL_Basic();


    public void removeDupsSets()
    {
        LL_node temp = myLL.root;
        LL_node previous = null;

        HashSet<Integer> mySet = new HashSet<>();
        while(temp != null)
        {
            if(mySet.contains(temp.data))
            {
                previous.next = temp.next;
            }
            else
            {
                mySet.add(temp.data);
                previous = temp;
            }
            temp = temp.next;
        }
    }

    public void removeDups()
    {
        LL_node temp = myLL.root;
        while(temp != null)
        {
            LL_node temp1 = temp;
            while(temp1.next != null)
            {
                if(temp1.next.data == temp.data)
                {
                    temp1.next = temp1.next.next;
                }
                else
                {
                    temp1 = temp1.next;
                }
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        RemoveDups rd = new RemoveDups();
        rd.myLL.insert(50);
        rd.myLL.insert(150);
        rd.myLL.insert(510);
        rd.myLL.insert(510);
        rd.myLL.insert(50);
        rd.myLL.insert(501);
        rd.myLL.printList();
        System.out.println();
        rd.removeDups();
        rd.myLL.printList();
        System.out.println();

        rd.myLL.insert(50);
        rd.myLL.insert(150);
        rd.myLL.insert(510);
        rd.myLL.insert(510);
        rd.myLL.insert(50);
        rd.myLL.insert(501);
        rd.myLL.printList();
        System.out.println();
        rd.removeDupsSets();
        rd.myLL.printList();
    }
}
