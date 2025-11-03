package Linkedlist;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size = 0;
    }

    public void first(int value){
        Node node = new Node(value);
    }


// ----------------------------------------------- Inserting -------------------------------------------------

    public void insertFirst(int value){           // O(1)
        Node node = new Node(value);              // create a new node
        node.next = head;                         // point new node's next to current head   
        head = node;                              // update head to new node

        if(tail == null){                         // if the list was empty, update tail to new node
            tail = head;
        }
        size += 1;
    }
    
    public void insertLast(int value){      // O(1)
        if(tail == null){                 // if the list is empty
            insertFirst(value);
            return;
        }
        Node node = new Node(value);    // create a new node
        tail.next = node;
        tail = node;
        size += 1;                      // Increment size
    }

    public void insert(int value, int index){   // O(n)
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;
    }

    public void delete(int index){
        if(index==0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size -= 1;
            return;
        }
        if(index==size-1){
            Node temp = head;
            for(int i=0; i<size-2;i++){ 
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size -= 1;
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size -= 1;

    }

    public void listRev(){
        Node last = null;
        
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last  = temp;
            temp = temp.next;
        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.next;
        }
        
    }

// ------------------------------------------------- Node Class -------------------------------------------------


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }
}
