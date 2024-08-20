package org.example;

/*
Implement a last-in-first-out (LIFO) stack using only two queues.
The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue,
which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively.
You may simulate a queue using a list or deque (double-ended queue) as long as
you use only a queue's standard operations.


Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False

 */
public class C_0701_ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty()); // return False
    }

    private static class MyStack {
        private Node head;

        public MyStack() {
        }

        public void push(int x) {
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

        }

        public int pop() {
            if (head == null) {
                throw new IllegalStateException("Stack is empty");
            }
            int result = head.value;
            head = head.next;
            return result;
        }

        public int top() {
            return head.value;
        }

        public boolean empty() {
            return head == null;
        }

        private static class Node {
            Integer value;
            Node next;

            public Node(Integer value) {
                this.value = value;
            }
        }
    }
}
