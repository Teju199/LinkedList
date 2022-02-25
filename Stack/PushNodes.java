package Stack;

import LinkedList.INode;
import LinkedList.MyLinkedList1;

public class PushNodes<K> implements INode<K> {
    private K key;
    static MyLinkedList1 myLinkedList1 = new MyLinkedList1();
    private INode head;
    private INode next;

    public PushNodes(K key) {
        this.key = key;
    }

    public PushNodes(){
    }

    public static void main(String[] args) {
        PushNodes<Integer> myThirdNode = new PushNodes<>(56);
        PushNodes<Integer> mySecondNode = new PushNodes<>(30);
        PushNodes<Integer> myFirstNode = new PushNodes<>(70);
        PushNodes pushNodes = new PushNodes();
        pushNodes.push(myFirstNode);
        pushNodes.push(mySecondNode);
        pushNodes.push(myThirdNode);
        myLinkedList1.PrintNode();
        INode peak = pushNodes.peak(myLinkedList1);
        System.out.println();
        System.out.println("Peak : ");
        System.out.print(peak.getKey());
    }

        public void push(INode newNode) {
            myLinkedList1.add(newNode);
        }


        public INode peak(MyLinkedList1 myLinkedList1){
            return myLinkedList1.getHead();
        }


    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return this.next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }
}
