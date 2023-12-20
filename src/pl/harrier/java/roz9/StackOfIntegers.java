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

    public void push(int valaue) {
        elements[size] = valaue;
        size++;
    }

    public int pop() {
        size--;
        return elements[size];
    }

    public int getSize() {
        return size;
    }
}
