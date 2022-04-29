package Ch10_ObjectOrientedThinking.Ch10_6_StackClass;

import java.util.Arrays;

public class StackOfIntegers {
    private Integer[] elements;
    private int size;
    private int DEFAULT_SIZE = 16;

    public StackOfIntegers() {
        elements = new Integer[DEFAULT_SIZE];
    }

    public StackOfIntegers(int capacity) {
        size = capacity;
        elements = new Integer[size];
    }

    public boolean empty() {
        return elements[0] == null;
    }

    public boolean isFull() {
        return elements[elements.length - 1] != null;
    }

    public Integer peek() {
        if (!this.empty()) {
            int lastIndex = getLastIndex();
            return elements[lastIndex];
        }
        return null;
    }

    public void push(int value) {
        if (!this.isFull()) {
            int lastIndex = getLastIndex();
            elements[lastIndex + 1] = value;
        }
        else
            System.out.println("stack is full. " + value + " is not added");
    }

    public Integer pop() {
        if (!this.empty()) {
            int lastIndex = getLastIndex();
            int lastElement = elements[lastIndex];
            elements[lastIndex] = null;
            return lastElement;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    private int getLastIndex() {
        int index = elements.length;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                index = i;
                break;
            }
        }
        return index - 1;
    }

    public String getContent() {
        return Arrays.toString(elements);
    }

}
