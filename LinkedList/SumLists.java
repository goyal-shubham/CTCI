package LinkedList;

import java.util.LinkedList;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class SumLists {


    LL_Basic ll1 = new LL_Basic();
    LL_Basic ll2 = new LL_Basic();

    public LL_Basic sumListsBack()
    {
        LL_Basic sumll = new LL_Basic();
        LL_node temp1 = ll1.root;

        LL_node temp2 = ll2.root;
        int carry = 0;
        while(temp1 != null && temp2 != null)
        {
            int sum = (temp1.data + temp2.data ) % 10;
            sumll.insert(sum + carry);
            carry = (temp1.data + temp2.data + carry) / 10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while( temp1 != null)
        {
            sumll.insert(temp1.data  + carry);
            carry = (temp1.data + carry) /10;
            temp1 = temp1.next;
        }
        while( temp2 != null)
        {
            sumll.insert(temp2.data + carry);
            carry = (temp2.data + carry) /10;

            temp2 = temp2.next;
        }
        if(carry != 0)
        {
            sumll.insert(carry);
        }
        sumll.printList();
        return sumll;
    }


    //Follow-up
    public int sumListsForward()
    {
        LL_node temp1 = ll1.root;
        LL_node temp2 = ll2.root;
        int n1 = 0;
        int n2 = 0;
        while(temp1 != null && temp2 != null)
        {
            n1 = n1 * 10 + temp1.data;
            n2 = n2 * 10 + temp2.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null)
        {
            n1 = n1 * 10 + temp1.data;
            temp1 = temp1.next;

        }
        while(temp2 != null)
        {
            n2 = n2 * 10 + temp2.data;
            temp2 = temp2.next;

        }
        int sum = n1 + n2;
        // We can make a linked list for this if required.
//        System.out.println(n1 + n2);
        return sum;
    }



    public static void main(String[] args) {
        SumLists sl = new SumLists();
        sl.ll1.insert(7);
        sl.ll1.insert(1);
        sl.ll1.insert(8);
        sl.ll2.insert(5);
        sl.ll2.insert(5);
        sl.ll2.insert(9);
        sl.ll2.insert(2);
        sl.sumListsBack();
        System.out.println();
        System.out.println(sl.sumListsForward());

    }
}
