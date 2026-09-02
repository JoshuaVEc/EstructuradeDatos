package TDAs;


public class LinkedStack<E> extends SinglyLinkedList implements Stack<E>{



    @Override
    public E top() {
        E top = (E) first();
        return top;
    }

    @Override
    public E pop() {
        E pop = (E) removeFirst();
        return pop;
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }
}
