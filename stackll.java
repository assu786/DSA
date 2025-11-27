// Class to represent each node in the linked list
class Node {
    int data;     // Stores the value of the node
    Node next;    // Reference to the next node in the stack

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;   // Initialize node data
        this.next = null;   // Next is initially null
    }
}

// Class to implement stack using linked list
class StackLL {
    private Node top;  // Points to the top node of the stack

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = top;            // Link the new node to the current top
        top = newNode;                 // Update top to the new node
    }

    // Method to pop an element from the stack
    public void pop() {
        if (top == null) {             // Check if the stack is empty
            System.out.println("Stack Underflow"); // If empty, print underflow message
            return;                    // Exit the method
        }
        System.out.println("Popped: " + top.data); // Print the value being popped
        top = top.next;                // Move top to the next node
    }

    // Method to view the top element without removing it
    public void peek() {
        if (top == null) {             // Check if the stack is empty
            System.out.println("Stack is Empty"); // Print message if empty
        } else {
            System.out.println("Top element: " + top.data); // Print the top element
        }
    }

    // Method to display all elements of the stack
    public void display() {
        if (top == null) {             // Check if the stack is empty
            System.out.println("Stack is Empty"); // Print message if empty
            return;                    // Exit the method
        }
        Node temp = top;               // Temporary node to traverse the stack
        while (temp != null) {         // Loop until the end of the stack
            System.out.print(temp.data + " -> "); // Print current node's data
            temp = temp.next;          // Move to the next node
        }
        System.out.println("NULL");    // Indicate the end of the stack
    }
}

// Main class to test the stack
public class stackll {
    public static void main(String[] args) {
        StackLL stack = new StackLL(); // Create a new stack object

        stack.push(10);                // Push 10 onto the stack
        stack.push(20);                // Push 20 onto the stack
        stack.push(30);                // Push 30 onto the stack

        stack.display();               // Display the stack: 30 -> 20 -> 10 -> NULL
        stack.peek();                  // Show the top element: 30
        stack.pop();                   // Pop the top element: 30
        stack.display();               // Display stack after pop: 20 -> 10 -> NULL
    }
}
