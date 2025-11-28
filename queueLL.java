class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    this.next=null;
    }
}
    class qlinkedlist{
        private Node front;
        private Node rear;
        public void enqueue(int data){
            Node newnode=new Node(data);
            if(rear==null){
                rear=front=newnode;
                return;
            }
            rear.next=newnode;
            rear=newnode;
        }
        public void dequeue(){
            if(front==null){
                System.out.println("empty");
                return;
            }
            front=front.next;
            if(front==null){
                rear=null;
            }
        }
        public void display(){
        if(front == null){
            System.out.println("Queue underflow");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

        public void frontvalue(){
            if(front==null){
                System.out.println("empty");
                return;
            }
            System.out.println(front.data);
        }
    }
    
    public class queueLL {
    public static void main (String args[]){
        qlinkedlist ob=new qlinkedlist();
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.display();
        ob.frontvalue();
        ob.display();
        ob.dequeue();
        ob.display();
    }
}
