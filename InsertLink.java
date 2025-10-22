public class InsertLink {
    // insert the element in index position in linked list
    static class Node {

        int data;
        Node next;

        Node(){
            data = 0;
            next = null;

        }
        Node(int val){
            this.data = val;
            next = null;
        }

        Node head;

        public void insert(int ele , int ind){
            Node newNode = new Node(ele);
            if(ind == 0){
                newNode.next = head;
                head = newNode;
                return;
            }

            Node position = head;
            int count = 0;
            while(position != null && count < ind - 1){
                position = position.next;
                count++;

            }
            if(position == null){
                System.out.println("Index out of bounds");
                return;
            }
            newNode.next = position.next;
            position.next = newNode;
        }

        public static void main(String[] args){
            InsertLink list = new InsertLink();
           
        }
}

