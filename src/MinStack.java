

public class MinStack {

    private class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;

        }
    }
   Node mainStack_top;

   Node minValue_top;

   int currentMin;

    public MinStack() {
        this.mainStack_top = null;
        this.minValue_top = null;

    }

    public void push(int val) {

        // set data in the allocated node
        Node mainStackNode = new Node(val);
        // set the .next pointer of the new node to point to the current
        // top node of the list
        mainStackNode.next = mainStack_top;


        // update top pointer
        mainStack_top = mainStackNode;
        System.out.println("current top of main stack: " + mainStack_top.data);


        if(minValue_top == null || val <= minValue_top.data){

            currentMin = val;
            Node minStackNode = new Node(currentMin);
            minStackNode.next = minValue_top;
            minValue_top = minStackNode;
            System.out.println("current top of min stack: " + minValue_top.data);

        }



    }

    public void pop() {

        // check for stack underflow
        if (mainStack_top == null)
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }


//        This leaves us still needing to implement MinStack's pop(...) method. The value we actually need to pop is always on the top of the main underlying Stack. However, if we simply popped it from there, the min-tracker Stack would become incorrect once its top value had been removed from the main Stack.
//
//        A logical solution would be to do the following additional check and modification to the min-tracker Stack when MinStack's pop(...) method is called.

        System.out.println("Top of main stack  " + top());
        System.out.println("Top of min stack " + minValue_top.data);
        if(top() == minValue_top.data){
            System.out.println("Number popped off min stack: " + minValue_top.data);
            minValue_top = this.minValue_top.next;
            //System.out.println("New top of min stack " + minValueStack.data);
        }

        System.out.println("Number popped off main stack: " + mainStack_top.data);
        mainStack_top = this.mainStack_top.next;

    }

    public int top() {
        // check for an empty stack
        if (mainStack_top == null) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return mainStack_top.data;

    }


    //getMin has Time Complexity: O(1)
    //This is because there is an auxilary stack that stores the current min value for all the numbers below it

    public int getMin() {

        // check for an empty stack
        if (minValue_top == null) {
            System.out.println("No min value stack is empty!");
            System.exit(-1);
        }
        return minValue_top.data;

    }
}
