package LinkedList;

public class LinkedListDeleteLastNode<K> implements INode<K> {
    private K key;
    private INode next;
    INode head = null;
    INode tail = null;

    public LinkedListDeleteLastNode(K key) {
        this.key = key;
    }

    public LinkedListDeleteLastNode() {
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
        LinkedListDeleteLastNode<Integer> myFirstNode = new LinkedListDeleteLastNode<>(56);
        LinkedListDeleteLastNode<Integer> mySecondNode = new LinkedListDeleteLastNode<>(30);
        LinkedListDeleteLastNode<Integer> myThirdNode = new LinkedListDeleteLastNode<>(70);
        LinkedListDeleteLastNode uc5 = new LinkedListDeleteLastNode();
        uc5.append(myFirstNode);
        uc5.append(mySecondNode);
        uc5.append(myThirdNode);
        uc5.PrintNode();
        uc5.deleteNode();
        uc5.PrintNode();
    }

    private void deleteNode() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tail.setNext(null);
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
