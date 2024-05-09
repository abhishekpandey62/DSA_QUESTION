
class LinkedLL {
    static Node head;
    int size;
    LinkedLL(){
        size=0;
    }

   
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
           this.next=null;

        }
    
        
    }
    public void add(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
            
        }
        temp.next=newNode;

    }
    public void printLinkList(Node head){
        if(head==null){
            System.out.println("Does not Exist ");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }

    }

    public Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
            
        }
        return slow;

    } 


    public  static Node reverse(Node temp){
    if(temp==null || temp.next==null){
    return temp;

    }
    Node lastNode=reverse(temp.next);
    Node tempNext=temp.next;
    tempNext.next=temp;
    temp.next=null;
    return lastNode;
}

public boolean palindrom(LinkedLL.Node head){
    if(head==null) return false;
    Node Mid=mid(head);
   
    Node lastNode=reverse(Mid.next);
    Node curr=head;
    while (lastNode !=null) {
        if(curr.data!=lastNode.data){
            return false;
        }
        lastNode=lastNode.next;
        curr=curr.next;
    }
    return true;
}
    public static void main(String[] args) {
        LinkedLL ll=new LinkedLL();
       
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(3);
        ll.printLinkList(head);
        System.out.println(ll.palindrom(head));

        
    }
    
}
