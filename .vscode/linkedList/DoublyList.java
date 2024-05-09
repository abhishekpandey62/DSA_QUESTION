public class DoublyList {
     Node head;
    Node tail=null;
    int size;
    DoublyList(){
        size=0;
    }
    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data= data;
            prev=null;
            next=null;
        }
    }
    //Add a Node;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    public void addNode(int item){
        Node newNode= new Node(item);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            head.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;


        }
    }
    public void printList(){
        Node curr=head;
        if(head==null){
            System.out.println("Sorry your list is Empty");
            return;
        }
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
            
        }

    

        
    }

    public void ReverseDublyList(){
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.next;
        }
        head= temp.prev;

    }
    public static void main(String[] args) {
        DoublyList list=new DoublyList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.printList();
        list.ReverseDublyList();
        list.printList();
    }

    
        
    
}
   

    
    
        
    

    

