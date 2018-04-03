package pl.dominisz.java8desktop.stack;

import java.util.Arrays;

public class ArrayStack<E> implements IStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int counter = 0;


    public ArrayStack() {
        elements = new Object[DEFAULT_CAPACITY];
        counter = 0;
    }

    @Override
    public void push(E element) {
        //dodanie elementu do tablicy
        if (counter == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
        elements[counter] = element;
        counter++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (counter > 0) {
            counter--;
            return (E) elements[counter];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }
}
