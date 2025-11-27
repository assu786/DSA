class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }
}
class ListOfFunction{
    static Node head;
    public static void insert(int data){
        Node newnode=new Node(data);
        newnode.next = head;
        head = newnode;
    }
    public static void display(){
        Node temp = head;
        int count=0;
        while(temp != null){
            System.out.print(temp.data+" ");
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
}
public class SingleLinkedList{
    public static void main(String[] args) {
        ListOfFunction.insert(10);
        ListOfFunction.insert(20);
        ListOfFunction.insert(30);
        ListOfFunction.display();
    }
     
    
}