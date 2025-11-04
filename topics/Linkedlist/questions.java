package Linkedlist;

public class questions {


    private Node head;
    private Node tail;

    private int size;
    public questions(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next= head;
        node.prev= null;
        if(head != null){                           
            head.prev = node;                  
        }
        head = node;
    }

    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node = node.next;
            }else{
                node.next = node.next.next;
            }
            node = node.next;
        }
    }

    public Node display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
        return head;
    }





    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
            this.next=null;
            this.prev=null;
        }

        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
        
}

