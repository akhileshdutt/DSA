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
        Node node = new Node(value);    // create a new node
        tail.next = node;
        tail = node;
        size += 1;                      // Increment size
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

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
