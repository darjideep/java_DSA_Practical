package Stack;

public class StackUsingArray {

    private int data[];
    private int top;

    public StackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }
    
    
}
