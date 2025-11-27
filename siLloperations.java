// Node class represents a single node of the linked list
class Node {
    int data;      // Stores the value
    Node next;     // Points to the next node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// Class containing all linked list operations
class ListOfFunction {
    static Node head;   // Head of the linked list
// Insert a node at the beginning of the list
    public static void insert(int data) {
        Node newnode = new Node(data);   // Create new node
        newnode.next = head;             // Link new node to current head
        head = newnode;                  // Update head
    }
// Display all nodes and also count them
    public static void display() {
        Node temp = head;
        int count = 0;
        while (temp != null) {                  // Traverse list
            System.out.print(temp.data + " ");  // Print data
            count++;                            // Count nodes
            temp = temp.next;                   // Move to next node
        }
        System.out.println("\nCount = " + count);
    }
    // Reverse the linked list
    public static void reverseList() {
        Node prev = null;      // Will become new head
        Node current = head;   // Start from original head
        Node next;
        while (current != null) {
            next = current.next;   // Save next node
            current.next = prev;   // Reverse the link
            prev = current;        // Move prev forward
            current = next;        // Move current forward
        }
        head = prev;   // Update head to new first node
    }
// Search for a value in the list
    public static boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {   // If key found
                return true;
            }
            temp = temp.next;         // Move forward
        }
        return false;   // If not found
    }
// Insert a node at a given index
    public static void indexinsert(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {     // If inserting at head
            insert(data);
            return;
        }
        Node temp = head;
        // Move to the node before the index
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {    // If index is invalid
            System.err.println("Index out of bounds.");
            return;
        }
        newNode.next = temp.next;   // Link new node
        temp.next = newNode;        // Insert new node
    }
public static void deleteIndex(int index) {
    if (head == null) {
        System.out.println("No data");
        return;
    }
// deleting the first node
    if (index == 0) {
        head = head.next;
        return;
    }
    Node temp = head;
// traverse to the node before the index
    for (int i = 0; temp != null && i < index - 1; i++) {
        temp = temp.next;
    }
// index is out of bounds
    if (temp == null || temp.next == null) {
        System.out.println("out of range");
        return;
    }
// delete the node
    temp.next = temp.next.next;
}
public static void debyvalue(int value){
    // Check if the list is empty
    if(head == null){
        System.out.println("No data");
        return;
    }
// Check if the head node itself contains the value to delete
    if(head.data == value){
        head = head.next; // Move head to the next node, effectively deleting current head
        return;
    }
    Node temp = head;
    // Traverse the list to find the node before the one that contains the value
    while(temp != null && temp.next.data != value){
        temp = temp.next;
    }
// If we reached the end of the list without finding the value
    if(temp == null){
        System.out.println("not found");
        return;
    }
// Delete the node containing the value by skipping it
    temp.next = temp.next.next;
}


}
// Main class to test the linked list functions
public class siLloperations {
    public static void main(String[] args) {
// Insert elements (inserting at head)
        ListOfFunction.insert(10);
        ListOfFunction.insert(20);
        ListOfFunction.insert(30);
// Display current list
        ListOfFunction.display();
// Reverse the list
        ListOfFunction.reverseList();
        ListOfFunction.display();
// Search for a value in the list
        boolean found = ListOfFunction.search(20);
        System.out.println("Found: " + found);
// Insert value at index 2
        ListOfFunction.indexinsert(70, 2);
        ListOfFunction.display();
        ListOfFunction.deleteIndex(2);
        ListOfFunction.display();
        ListOfFunction.debyvalue(10);
        ListOfFunction.display();
    }
}
