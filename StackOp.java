package DSA;

class Stack {
    private int[] stack = new int[5];
    private int top = 0;

    // Push element into stack
    public void push(int data) {
        if (top == stack.length) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }

        stack[top] = data;
        top++;
        System.out.println(data + " pushed into stack.");
    }

    // Pop element from stack
    public int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    // Peek top element
    public int peek() {
        if (top == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top - 1];
    }

    // Display stack elements
    public void show() {
        if (top == 0) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");
        for (int i : stack) {
            System.out.println(i);
        }
    }
}

public class StackOp {

    public static void main(String[] args) {

        Stack nums = new Stack();

        nums.push(10);
        nums.push(20);
        nums.push(30);

        nums.show();

        System.out.println("Top element: " + nums.peek());

        System.out.println("Popped element: " + nums.pop());

        nums.show();

        nums.push(40);
        nums.push(50);
        nums.push(60);

        nums.show();
    }
}