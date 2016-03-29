package LinkedList;

import java.util.LinkedList;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class Intersection {

    LL_Basic ll1 = new LL_Basic();
    LL_Basic ll2 = new LL_Basic();

    public int checkIntersection()
    {
        int l1 = 0;
        int l2 = 0;
        LL_node temp1 = ll1.root;
        LL_node temp2 = ll2.root;
        LL_node tail1 = null;
        LL_node tail2 = null;
        if(temp1 == null || temp2 == null)
        {
            return 0;
        }

        while(temp1 != null)
        {
            l1++;
            temp1 = temp1.next;
            tail1 = temp1;
        }

        while(temp2 != null)
        {
            l2++;
            temp2 = temp2.next;
            tail2 = temp2;
        }

        if(tail1 != tail2)
        {
            return 0;
        }

        //Get smaller in temp1
        if(l1 > l2)
        {
            temp1 = ll2.root;
            temp2 = ll1.root;

        }
        else
        {
            temp1 = ll1.root;
            temp2 = ll2.root;
        }
        int diff = Math.abs(l1 - l2);
        while(diff-- > 0 && temp2 != null)
        {
            temp2 = temp2.next;
        }

        while( temp1 != temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1.data;
    }

    public static void main(String[] args) {
        Intersection inter = new Intersection();
        inter.ll1.insert(1);

        inter.ll1.insert(11);
        inter.ll1.insert(11);
        inter.ll1.insert(11);
        inter.ll1.insert(11);
        inter.ll1.insert(11);
        inter.ll1.insert(12);
        inter.ll1.insert(13);

        inter.ll2.insert(123);
        inter.ll2.insert(123);
        inter.ll2.insert(123);
        inter.ll2.insert(123);
        inter.ll2.insert(213);


        //Make intersecting linked List
        LL_node temp = inter.ll1.root;
        while( temp.data != 11)
        {
            temp = temp.next;
        }
        LL_node temp1 = inter.ll2.root;
        while(temp1.next != null)
        {
            temp1 = temp1.next;
        }
        temp1.next = temp;

        System.out.println(inter.checkIntersection());

    }

}
