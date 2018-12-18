package s02_Stack.v1_Array_Stack.v1_ArrayStack;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
