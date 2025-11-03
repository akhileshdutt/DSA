package Linkedlist;

public class circulerLL {                              // 
    
    private Node head;
    private Node tail;

    public circulerLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);                      
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.next= head;
            tail = node;
        }
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while (temp!=head);
        }
        System.out.println("HEAD"); 
    }
    
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
    }


}
