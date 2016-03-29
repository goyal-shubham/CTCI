package LinkedList;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class LoopDetection {

    LL_Basic ll1 = new LL_Basic();

    public int checkLoop()
    {
        LL_node slow = ll1.root;
        LL_node fast = ll1.root;
        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast)
            {
                break;
            }

        }
//        System.out.println("loop break");

        if(fast == null && fast.next == null)
        {
            return 0;
        }

        slow = ll1.root;
        while( slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;

    }

    public static void main(String[] args) {
        LoopDetection p = new LoopDetection();
        p.ll1.insert(1);
        p.ll1.insert(11);
        p.ll1.insert(22);
        p.ll1.insert(22);
        p.ll1.insert(22);
        p.ll1.insert(22);
        p.ll1.insert(22);
        p.ll1.insert(22);
        p.ll1.insert(21);
        p.ll1.insert(12);
        p.ll1.insert(112);
        p.ll1.insert(1122);
        p.ll1.insert(121);
        p.ll1.insert(1212);
        p.ll1.insert(13);


        //Making loop
        LL_node temp = p.ll1.root;
        while( temp.data != 12)
        {
            temp = temp.next;
        }

        LL_node temp1 = p.ll1.root;
        while(temp1.data != 13)
        {
            temp1 = temp1.next;
        }
        temp1.next = temp;


        System.out.println(p.checkLoop());
    }
}
