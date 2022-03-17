package project_in_class6;

/**
 * Created by Arabic on 21/02/22.
 * @param <E>
 */
public class LinkedStack<E>implements Stack<E> {
    
    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    
    
    @Override
    public boolean isEmpty() {

        return list.isEmpty();
    }
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E el) {
        list.addFirst(el);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }


    @Override
    public E top() {
        return list.first();
    }

}
