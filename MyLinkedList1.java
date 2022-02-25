package LinkedList;

public class MyLinkedList1<K> implements INode<K>{
    private K key;
    private INode next;
    private INode head = null;
    private INode tail = null;

    public INode getHead() {
        return head;
    }

    public void setHead(INode head) {
        this.head = head;
    }

    public INode getTail() {
        return tail;
    }

    public void setTail(INode tail) {
        this.tail = tail;
    }

    public MyLinkedList1(K key) {
        this.key = key;
    }

    public MyLinkedList1(){
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
        MyLinkedList1<Integer> myThirdNode = new MyLinkedList1<>(56);
        MyLinkedList1<Integer> mySecondNode = new MyLinkedList1<>(30);
        MyLinkedList1<Integer> myFirstNode = new MyLinkedList1<>(70);
        MyLinkedList1 uc2 = new MyLinkedList1();
        uc2.add(myFirstNode);
        uc2.add(mySecondNode);
        uc2.add(myThirdNode);
        uc2.PrintNode();
    }

    public void add(INode newNode) {
        if(this.tail == null && this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

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

