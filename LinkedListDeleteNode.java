package LinkedList;

public class LinkedListDeleteNode<K> implements INode<K>{
    private K key;
    private INode next;
    INode head = null;
    INode tail = null;

    public LinkedListDeleteNode(K key) {

        this.key = key;
    }

    public LinkedListDeleteNode() {
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
        LinkedListDeleteNode<Integer> myFirstNode = new LinkedListDeleteNode<>(56);
        LinkedListDeleteNode<Integer> mySecondNode = new LinkedListDeleteNode<>(30);
        LinkedListDeleteNode<Integer> myThirdNode = new LinkedListDeleteNode<>(70);
        LinkedListDeleteNode uc4 = new LinkedListDeleteNode();
        uc4.append(myFirstNode);
        uc4.append(mySecondNode);
        uc4.append(myThirdNode);
        uc4.PrintNode();
        uc4.deleteNode();
        uc4.PrintNode();
    }

    private void deleteNode() {
        INode tempNode = head.getNext();
        head = tempNode;
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

