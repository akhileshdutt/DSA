package Linkedlist;

public class DLL {

    Node head;

    public void insertFirst(int value){           // O(1)
        Node node = new Node(value);             // create a new node
        node.next= head;                         // link new node to old head
        node.prev= null;                     // new node is going to be the first node, so prev is null
        if(head != null){                           
            head.prev = node;                  // old head's prev points to new node    
        }
        head = node;                          // update head to new node
    }

    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
        node.prev = temp;
    }

    public void display(){
        Node temp = head;
        System.out.print("null <- ");
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        } 
        System.out.print("null");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
