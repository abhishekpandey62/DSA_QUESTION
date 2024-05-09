//Creat the Linked List :.............................................................................
public class LinerLinkedList {


    static Node head;
 
    private int size;
 
 
    LinerLinkedList() {
 
        size = 0;
 
    }
 
 // Create the node:..........................................................................................
 
    public class Node {
 
        String data;
 
        Node next;
 
 
        Node(String data) {
 
            this.data = data;
 
            this.next = null;
 
            size++;
 
        }
 
    }
 // Add first:.........................................................................................
 
   /*  public void addFirst(String data) {
 
        Node newNode = new Node(data);
 
        newNode.next = head;
 
        head = newNode;
 
    }*/
 
 //Add Last:............................................................................................
    public void addLast(String data) {
 
        Node newNode = new Node(data);
 
 
        if(head == null) {
 
            head = newNode;
 
            return;
 
        }
 
 
        Node lastNode = head;
 
        while(lastNode.next != null) {
 
            lastNode = lastNode.next;
 
        }
 
 
        lastNode.next = newNode;
 
    }
 // Print linked list:..................................................................................
 
    public void printList() {
 
        Node currNode = head;
 
 
        while(currNode != null) {
 
            System.out.print(currNode.data+" -> ");
 
            currNode = currNode.next;
 
        }
 
 
        System.out.println("null");
 
    }
 
    // Remove from first:.........................................................................................
   
  /*   public void removeFirst() {
 
        if(head == null) {
 
            System.out.println("Empty List, nothing to delete");
 
            return;
 
        }
 
 
        head = this.head.next;
 
        size--;
 
    }*/
 // Remove from last:..........................................................................................
 
  /*  public void removeLast() {
 
        if(head == null) {
 
            System.out.println("Empty List, nothing to delete");
 
            return;
 
        }
 
 
        size--;
 
        if(head.next == null) {
 
            head = null;
 
            return;
 
        }
 
 
        Node currNode = head;
 
        Node lastNode = head.next;
 
        while(lastNode.next != null) {
 
            currNode = currNode.next;
 
            lastNode = lastNode.next;
 
        }
 
 
        currNode.next = null;
 
    }*/
 
    // INsert in the anywhere:................................................................................
 
   /*  public void addInMiddle(int index, String data) {
 
        if(index > size || index < 1) {
 
            System.out.println("Invalid Index value");
 
            return;
 
        }
 
        size++;
 
 
        Node newNode = new Node(data);
 
        if(head == null || index == 1) {
 
            newNode.next = head;
 
            head = newNode;
 
            return;
 
        }
 
         Node currNode = head;
 
        for(int i=1; i<size; i++) {
 
            if(i == index) {
 
                Node nextNode = currNode.next;
 
                currNode.next = newNode;
 
                newNode.next = nextNode;
 
                break;
 
            }
 
            currNode = currNode.next;
 
        }
 
    }*/
   
    // Delete from anywhere:...............................................................................
    
 /*public void deleteInMiddle(int indxe){
     if(indxe>size || indxe<1){
         System.out.println("Invalid");
         return;
     }
     size--;
     Node temp=head;
     Node preNode=null;
     
     for(int i=1;i<=size;i++){
         if(i==indxe){
             
           temp=temp.next;  
         preNode.next=temp;
             
          
         }
        preNode=temp;
         temp=temp.next;
     }
 
    }*/
 
    // determine the size :...................................................................................
 
    public int getSize() {
 
        return size;
 
    }
 // polindromic......................................................................
 
    public static Node getMiddle(Node head) {
 
    Node fast = head;
 
    Node slow = head;
 
    while (fast.next != null && fast.next.next != null) {
 
        fast = fast.next.next;
 
        slow = slow.next;
 
    }
 
    return slow;
 
 }
 
 
 public static Node reverse(Node head) {
 
    Node prev = null;
 
    Node curr = head;
 
  
 
    while (curr != null) {
 
        Node next = curr.next;
 
        curr.next = prev;
 
        prev = curr;
 
        curr = next;
 
    }
 
    return prev;
 
 }
 
 
 
 public static boolean isPalindrome(Node head) {
 
    if(head == null || head.next == null) {
 
        return true;
 
    }
 
  
 
    Node firstHalfEnd = getMiddle(head);
   
    
    Node secondHalfStart = reverse(firstHalfEnd.next);
 
    Node firstHalfStart = head;
 
  
 
    while(secondHalfStart != null) {
 
        if(secondHalfStart.data != firstHalfStart.data) {
 
            return false;
 
        }
 
        secondHalfStart = secondHalfStart.next;
 
        firstHalfStart = firstHalfStart.next;
 
    }
 
  
 
    return true;
 
 }
 
   
    
  
 
 
 
    public static void main(String args[]) {
 
        LinerLinkedList list = new LinerLinkedList();
        
        list.addLast("this");
        list.addLast("is");
 
        list.addLast("a");
 
        list.addLast("a");
         list.addLast("is");
          list.addLast("this");
           // list.deleteInMiddle(3);
       list.printList();
 
 
       // list.removeFirst();
 
       // list.printList();
 
 
       // list.removeLast();
 
       // list.printList();
       // list.addInMiddle(3, "put");
      //  list.printList();
 
      // palindromic
 
      System.out.println(isPalindrome(head));
    }
 }
      
      
 
 
      
 
 
 
 
      
 
 
