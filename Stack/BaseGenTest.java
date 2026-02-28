package Stack;

public class BaseGenTest {
    public static void main(String[] args) {
        System.out.println("========== TESTING BaseStack (Integer Stack) ==========\n");
        
        BaseStack intStack = new BaseStack(5);
        
        // Test isEmpty on empty stack
        System.out.println("Is stack empty? " + intStack.isEmpty());
        System.out.println("Is stack full? " + intStack.isFull() + "\n");
        
        // Push operations
        System.out.println("--- Pushing elements ---");
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        System.out.println("Is stack full? " + intStack.isFull());
        intStack.push(60); // This should say stack is full
        System.out.println();
        
        // Peek operation
        System.out.println("--- Peek Operation ---");
        System.out.println("Top element (peek): " + intStack.peek() + "\n");
        
        // Display all elements
        System.out.println("--- Display all elements ---");
        intStack.display();
        System.out.println();
        
        // Pop operations
        System.out.println("--- Pop Operations ---");
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Popped: " + intStack.pop());
        System.out.println();
        
        // Display after popping
        System.out.println("--- Display after popping ---");
        intStack.display();
        System.out.println();
        
        // Continue popping
        System.out.println("--- Continue popping ---");
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Is stack empty? " + intStack.isEmpty());
        System.out.println("Trying to pop from empty stack:");
        intStack.pop();
        System.out.println();
        
        
        System.out.println("\n========== TESTING GenStack (Generic Stack - String) ==========\n");
        
        GenStack<String> stringStack = new GenStack<>(4);
        
        // Test with String elements
        System.out.println("--- Pushing String elements ---");
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Cherry");
        stringStack.push("Date");
        System.out.println("Is stack full? " + stringStack.isFull());
        stringStack.push("Elderberry"); // Should say full
        System.out.println();
        
        // Peek and display
        System.out.println("--- Peek and Display ---");
        System.out.println("Top element: " + stringStack.peek());
        stringStack.display();
        System.out.println();
        
        // Pop string elements
        System.out.println("--- Pop String elements ---");
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
        stringStack.display();
        System.out.println();
        
        
        System.out.println("========== TESTING GenStack (Generic Stack - Double) ==========\n");
        
        GenStack<Double> doubleStack = new GenStack<>(3);
        
        // Test with Double elements
        System.out.println("--- Pushing Double elements ---");
        doubleStack.push(3.14);
        doubleStack.push(2.71);
        doubleStack.push(1.41);
        System.out.println("Is stack empty? " + doubleStack.isEmpty());
        doubleStack.push(1.73); // Should say full
        System.out.println();
        
        // Peek and display
        System.out.println("--- Peek and Display ---");
        System.out.println("Top element: " + doubleStack.peek());
        doubleStack.display();
        System.out.println();
        
        // Pop double elements
        System.out.println("--- Pop Double elements ---");
        System.out.println("Popped: " + doubleStack.pop());
        System.out.println("Is stack empty now? " + doubleStack.isEmpty());
        System.out.println("Popped: " + doubleStack.pop());
        System.out.println("Popped: " + doubleStack.pop());
        System.out.println("Trying to pop from empty stack:");
        doubleStack.pop();
        System.out.println();
        
    }
}
