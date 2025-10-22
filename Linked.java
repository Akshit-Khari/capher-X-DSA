public class Linked {

    static class Node{

        int data;
        Node chit;
        Node(){
            data = 0;
            chit = null;
        }
        Node(int val){
            this.data = val;
            chit = null;
        }
    }
    public static void main(String[] args){

        Node n1 = new Node(12);
        n1.chit = new Node(22);
        n1.chit.chit = new Node(42);
        n1.chit.chit.chit = new Node(52);
        n1.chit.chit.chit.chit = new Node(62);

        Node temp = n1;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.chit;
        }
        System.out.println(temp.data);

        int arr[] = {1,2,3,4,5};
        // create linded list from array

    }
}
