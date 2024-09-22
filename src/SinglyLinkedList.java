public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){

    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

}
