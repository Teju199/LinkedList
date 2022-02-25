package Stack;

import LinkedList.INode;
import LinkedList.MyLinkedList1;

public class StackPop<K> implements INode <K> {
    private K key;
    static MyLinkedList1 myLinkedList1 = new MyLinkedList1();
    static StackPop stackPop = new StackPop();
    private INode head;
    private INode tail;
    private INode next;

    public StackPop(K key) {
        this.key = key;
    }

    public StackPop() {
    }

    public static void main(String[] args) {
        StackPop<Integer> myThirdNode = new StackPop<>(56);
        StackPop<Integer> mySecondNode = new StackPop<>(30);
        StackPop<Integer> myFirstNode = new StackPop<>(70);
        StackPop StackPop = new StackPop();
        StackPop.push(myFirstNode);
        StackPop.push(mySecondNode);
        StackPop.push(myThirdNode);
        myLinkedList1.PrintNode();
        stackPop.pop(myLinkedList1);
        System.out.println();
    }

    public void pop(MyLinkedList1 myLinkedList1){
        while(myLinkedList1.getHead() != null) {
            INode head = stackPop.peak(myLinkedList1);
            System.out.println();
            System.out.println(head.getKey());
            INode tempNode = head.getNext();
            myLinkedList1.setHead(tempNode);
        }
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
