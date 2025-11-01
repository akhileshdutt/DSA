package Linkedlist;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertLast(100);
        list.insert(500,3);
        list.delete(3);
        list.display();

        DLL Dlist = new DLL();
        Dlist.insertFirst(10);
        Dlist.insertFirst(40);
        Dlist.insertFirst(30);
        Dlist.insertFirst(20);
        Dlist.insertLast(50);
        Dlist.display();
    }   

}
