package StackQueue;

/**
 * Created by shubhamgoyal on 3/29/16.
 */
public class Main {

    public static void main(String[] args) {

        myStack st1 = new myStack();
        st1.push(20);
        st1.push(39);
        st1.push(40);
        st1.push(43);
        st1.printStack();
        System.out.println();
        st1.pop();
        st1.printStack();

    }

}
