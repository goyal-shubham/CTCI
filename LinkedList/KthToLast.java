package LinkedList;

/**
 * Created by shubhamgoyal on 3/24/16.
 */
public class KthToLast {

    LL_Basic myLL = new LL_Basic();


    //Book solution
    public int printKthToLast(LL_node head , int k)
    {
        if( head == null)
        {
            return 0;
        }

        int index = printKthToLast(head.next, k) + 1;
        if( index == k)
        {
            System.out.println(head.data);
        }
        return index;
    }

    //Book solution wrapper class
    public int KthToLast2(LL_node head, int k)
    {
        int[] index = new int[1];
        index[0] = 0;
        return KthToLast2(head, k , index).data;
    }

    public LL_node KthToLast2(LL_node head , int k, int[] index)
    {
        if( head == null)
        {
            return null;
        }

        LL_node temp = KthToLast2(head.next, k , index);
        if(temp != null)
        {
            return temp;
        }
        index[0]++;
        if( index[0] == k)
        {
            return head;
        }
        return temp;
    }


    //My Solution
    public int kthToLast(int k)
    {
        LL_node temp = myLL.root;
        LL_node temp1 = temp;
        int i = 1;
        while(temp != null && i <= k)
        {
            temp = temp.next;
            i++;
        }
        if( i != k + 1)
        {
            System.out.println("Not enough elements");
            return 0;
        }
        while(temp != null)
        {
            temp1 = temp1.next;
            temp = temp.next;
        }
        return temp1.data;

    }



    public static void main(String[] args) {
        KthToLast ktl = new KthToLast();
        ktl.myLL.insert(1250);
        ktl.myLL.insert(150);
        ktl.myLL.insert(10);
        ktl.myLL.insert(51);
        ktl.myLL.insert(50);
        ktl.myLL.insert(501);
        ktl.myLL.printList();
        System.out.println();
        System.out.println(ktl.kthToLast(6));
        System.out.println();
        ktl.printKthToLast(ktl.myLL.root, 6);
        System.out.println();
        System.out.println(ktl.KthToLast2(ktl.myLL.root, 6));
    }
}
