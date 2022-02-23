package LinkedList;

public class MyLinkedListAppend<K> implements INode<K> {
    private K key;
    private INode next;
    INode head = null;
    INode tail = null;

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

    public MyLinkedListAppend(K key) {
        this.key = key;
    }

    public MyLinkedListAppend() {
    }

    public static void main(String[] args) {
        MyLinkedListAppend<Integer> myFirstNode = new MyLinkedListAppend<>(56);
        MyLinkedListAppend<Integer> mySecondNode = new MyLinkedListAppend(30);
        MyLinkedListAppend<Integer> myThirdNode = new MyLinkedListAppend(70);
        MyLinkedListAppend uc2 = new MyLinkedListAppend();
        uc2.append(myFirstNode);
        uc2.append(mySecondNode);
        uc2.append(myThirdNode);
        uc2.PrintNode();
    }

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
