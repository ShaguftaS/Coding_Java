public class AppLL {
    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB ;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listlength(nodeA));
        System.out.println(listlength(nodeB));
    }
    public int listlength(Node aNode){

    }
}
