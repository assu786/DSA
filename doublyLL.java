class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class dlinkedlist{
    private Node head=null;
    private Node tail=null;
    public void insertend(int data){
        Node newnode=new Node(data);
        if (tail==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    public void insertfront(int data){
        Node newdata=new Node(data);
        if(head==null){
            head=tail=newdata;
            return;
        }
        newdata.next=head;
        head.prev=newdata;
        head=newdata;
    }
    public void printforward(){
        Node temp=head;
        while( temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
      }
      public void printbackword(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
      }
      public void deleteend(){
        if(tail==null){
            System.out.println("empty");
            return;
        }
        tail=tail.prev;
        if(tail!=null){
            tail.next=null;
        }
        else{
            head=null;
        }
      }
      public void deletefront(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        else{
            tail=null;
        }
      }
    }


public class doublyLL {
    public static void main(String args[]){
        dlinkedlist ob=new dlinkedlist();
        ob.insertend(10);
        ob.insertend(20);
        ob.insertfront(30);
        ob.insertfront(40);
        ob.printforward();
        ob.printbackword();
        ob.deleteend();
        ob.printforward();
        ob.deletefront();
        ob.printforward();
    }
    
}
