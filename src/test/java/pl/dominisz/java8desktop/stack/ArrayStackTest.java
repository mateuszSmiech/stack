package pl.dominisz.java8desktop.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayStackTest {

    @Test
    @DisplayName("Created stack should be empty")
    public void createStack() {
        IStack<String> stack = new ArrayStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("should enlarge stack")
    public void enlargeStack() {
        int count = 100;
        IStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; count > i; i++) {
            stack.push(i);
        }

        for (int i = 0; count > i; i++) {
            Integer element = stack.pop();
            assertEquals(count - i - 1, element.intValue());
        }
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("should contain one element agter adding element to empty stack.")
    @SuppressWarnings("unchecked")
    void push() {
        IStack<String> stack = new ArrayStack();
        String element = "element";
        stack.push(element);
        String actualElement = stack.pop();
        assertEquals(element, actualElement);
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("should remove element from the stack.")
    void pop() {

    }

    @Test
    @DisplayName("should check if stack is empty.")
    void isEmpty() {
        IStack<String> stack = new ArrayStack<>();
        String element = "element";
        stack.push(element);
        stack.pop();
        stack.isEmpty();
    }
}