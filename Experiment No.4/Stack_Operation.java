interface Stack {
    int size = 5; // Stack size

    void push(int element);  // Pushes an element into the stack
    int pop();               // Removes and returns the top element
    void display();          // Displays stack elements
    boolean overflow();      // Checks if the stack is full
    boolean underflow();     // Checks if the stack is empty
}
class IntegerStack implements Stack {
    private int[] stack;
    private int top;

    IntegerStack() {
        stack = new int[size]; // Allocate memory for stack
        top = -1; // Initialize stack as empty
    }

    @Override
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed to stack.");
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
public class Stack_Operation {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.pop(); // Test underflow condition

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Test overflow condition

        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
