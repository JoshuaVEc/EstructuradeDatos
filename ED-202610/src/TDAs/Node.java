package TDAs;

public class Node <E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;
    public Node(E e, Node<E> p, Node<E> n){
        element =e;
        prev = p;
        next=n;
    }
    public E getElement(){return element;}
    public Node<E> getNext(){return next;}
    public Node<E> getPrev(){return prev;}
    public void setPrev(Node<E> p){prev=p;}
    public void setNext(Node<E> n) {next=n;}
}
