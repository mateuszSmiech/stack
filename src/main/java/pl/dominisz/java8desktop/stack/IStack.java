package pl.dominisz.java8desktop.stack;

public interface IStack<E> {

    void push(E element);
    E pop();
    boolean isEmpty();

}
