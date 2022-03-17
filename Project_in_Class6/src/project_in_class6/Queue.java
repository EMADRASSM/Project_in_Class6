package project_in_class6;

/**
 * Created by Arabic on 21/02/22.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E el);
    E dequeue();
    E first();
}
