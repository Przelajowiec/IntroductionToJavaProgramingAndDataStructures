package pl.harrier.java.roz9;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public StackOfIntegers() {
        this(16);
    }

    public boolean empty() {
        return size <= 0;
    }

    public void push(int value) {
        if (elements.length <= size) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }

    public int pop() {
        size--;
        return elements[size];
    }

    public int getSize() {
        return size;
    }

    public int peek() {
        return elements[size - 1];
    }
}
