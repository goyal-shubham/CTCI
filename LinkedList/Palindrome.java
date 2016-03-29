package LinkedList;

import java.util.Stack;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class Palindrome {

    LL_Basic ll = new LL_Basic();

    public HeadAndTail reverse( LL_node head)
    {
        if( head == null)
        {
            return null;
        }
        HeadAndTail ht = reverse(head.next);
        LL_node newHead = new LL_node(head.data);
        newHead.next = null;

        if(ht == null)
        {
            return new HeadAndTail(newHead, newHead);
        }
        ht.tail.next = newHead;
        return new HeadAndTail(ht.head, newHead);

    }



    //Reverse Approach
    public boolean checkPalindrome()
    {

        HeadAndTail reversed = reverse(ll.root);
        LL_Basic rev = new LL_Basic();
//        ll.printList();
//        System.out.println();

        rev.root = reversed.head;
//        rev.printList();
        LL_node reversedHead = reversed.head;
        LL_node originalHead = ll.root;
        while(reversedHead != null && originalHead != null)
        {
            if(reversedHead.data != originalHead.data)
            {
                return false;
            }
            originalHead = originalHead.next;
            reversedHead = reversedHead.next;
        }
       return originalHead == null && reversedHead == null;
    }


    //Iterative Approach
    public boolean isPalindrome()
    {
        LL_node slow = ll.root;
        LL_node fast = ll.root;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null)
        {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
//        System.out.println(stack);
        while(slow != null)
        {
            if(stack.pop() != slow.data)
            {
                return false;
            }
            slow = slow.next;
        }
        return true;


    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.ll.insert(1);
        p.ll.insert(1);
        p.ll.insert(2);
        p.ll.insert(2);
        p.ll.insert(1);
        p.ll.insert(1);

        if(p.checkPalindrome())
        {
            System.out.println("Palidrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        if(p.isPalindrome())
        {
            System.out.println("Palidrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}



