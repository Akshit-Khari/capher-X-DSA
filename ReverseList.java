class Node{
    int data;
    Node next;


    Node(int data){
        this.data = data;
        this.next = null;

    }

}

public class ReverseList{

    public static Node reverseList(Node head){
        Node prev  =null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println("Null");
    }


    public static void main(String[] args){

        Node head = new Node(11);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(18);

        printList(head);

        head = reverseList(head);

        printList(head);
    }

}