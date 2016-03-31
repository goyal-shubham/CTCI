package StackQueue;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class myQueue {

    node first;
    node last;

    public myQueue() {
        this.first = null;
        this.last = null;
    }


    public void printQueue()
    {
        node temp = first;
        while(first != null)
        {
            System.out.println(first.data);
            temp = temp.next;
        }

    }


    public void enqueue(int data)
    {
        node n = new node(data);
        if( first == null)
        {
            last = n;
            first = last;
        }
        else
        {
            last.next = n;
            last = n;
        }
    }

    public Object dequeue()
    {
        if(first != null)
        {
            int data = first.data;
            first = first.next;
            return data;
        }
        return null;
    }

}
