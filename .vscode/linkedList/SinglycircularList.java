public class SinglycircularList {
    static Node head;
    private int size;
    SinglycircularList(){
        size=0;
    }
   
    public class  Node {

    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
        size++;

    }
}
    //Add from last"""""""""""""""""""""""""
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                newNode.next=head;
                return;
            }
            else{
                Node curr=head;
                while (curr.next!=head) {
                    curr=curr.next;
                    
                }
                curr.next=newNode;
                newNode.next=head;
            }

        }
        //print ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        public void printList(Node head){
            Node curr=head;
            if(curr==head){
                System.out.print(curr.data+" ");
                curr=curr.next;

            }
            while (curr!=head) {
                System.out.print(curr.data+" ");
                curr=curr.next;
                
            }
            
        }
        public static void main(String[] args) {
            SinglycircularList list=new SinglycircularList();
            list.addLast(1);
            list.addLast(2);
            list.addLast(3);
            list.addLast(4);
            list.addLast(5);
           list.printList(head);

        }

        
    
    
}
