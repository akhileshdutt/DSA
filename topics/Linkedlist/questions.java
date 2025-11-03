package Linkedlist;

public class questions {
    
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;


    // public void InsertRec(int value, int index){
    //     head = InsertRec(value, index, head);
    // }

    // private Node InsertRec(int value, int index, Node node){
    //     if(index == 0){
    //         Node temp = new Node(value, node);
    //         size++;
    //         return temp;
    //     }

    //     InsertRec(value, index--, node.next);
    //     return node;
    // }

    
}
