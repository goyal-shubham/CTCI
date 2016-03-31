package StackQueue;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class myStack {

    node top;

    public myStack()
    {
        this.top = null;
    }

    public void printStack()
    {
        node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public Integer pop()
    {
        if(top != null)
        {

            int data = top.data;
            top = top.next;
            return data;
        }

        return null;
    }

    public void push(int data)
    {
            node n = new node(data);
            n.next = top;
            top = n;
    }

    public Object top()
    {
        return top.data;
    }
}
