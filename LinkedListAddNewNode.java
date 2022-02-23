package LinkedList;

public class LinkedListAddNewNode<K> implements INode<K> {
    private K key;
    private INode next;
    INode head = null;
    INode tail = null;

    public LinkedListAddNewNode(K key) {

        this.key = key;
    }

    public LinkedListAddNewNode() {
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    public static void main(String[] args) {
        LinkedListAddNewNode<Integer> myFirstNode = new LinkedListAddNewNode<>(56);
        LinkedListAddNewNode<Integer> mySecondNode = new LinkedListAddNewNode<>(70);
        LinkedListAddNewNode<Integer> newNode = new LinkedListAddNewNode<>(30);
        LinkedListAddNewNode uc3 = new LinkedListAddNewNode();
        uc3.append(myFirstNode);
        uc3.append(mySecondNode);
        uc3.PrintNode();
        uc3.insert(uc3, newNode, myFirstNode, mySecondNode);
        uc3.PrintNode();
    }

    //Appending the new nodes.
    private void append(INode newNode) {
        if (this.tail == null && this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    //inserting new node.
    public void insert(INode list, INode newNode, INode myFirstNode, INode mySecondNode) {
        INode tempNode = newNode;
        myFirstNode.setNext(tempNode);
        newNode = myFirstNode.getNext();
        newNode.setNext(mySecondNode);
    }
    //Printing the nodes
    public void PrintNode(){
        System.out.print("My Nodes : ");
        INode tempNode = this.head;
        while(tempNode.getNext()!= null){
            System.out.print(tempNode.getKey() + "->");
            tempNode = tempNode.getNext();
        }
        System.out.print(tempNode.getKey());
    }
}





