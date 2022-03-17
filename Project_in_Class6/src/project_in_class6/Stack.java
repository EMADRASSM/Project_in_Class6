package project_in_class6;

/**
 * Created by Arabic on 21/02/22.
 * @param <E>
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E el);
    E pop();
    E top();
}
