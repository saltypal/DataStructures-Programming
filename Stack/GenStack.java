package Stack;
public class GenStack<T>{
    private int top;
    private int size;
    private T[] stk;
    // private int max;

    GenStack(int size){
        this.top=-1; // initialise stack counter to -1.
        this.size=size; // The size of the array is defined by the class object instatiation
        // this.stk = new T[size]; // size of stack is now size
        stk = (T[]) new Object[size]; // Generic array creation
        // this.max = size-1;
    }

    /*
    Functions needed for Stack:
    isFull: Check if stack is full (if top==size then return true) else return false => Stack is full
    isEmpty: Check if stack is empty(if top ==-1, then return true) else return false => Stack is empty
    Push: if stack is full, then break. Else Add to stack, Top++. ?(Return nothing)
    Pop: if stack is empty then then break. Else Remove from stack, Top--. (Return the value popped)
    size(): Return the number of elements in the stack
    peek(): Top most element in the stack
    */

    boolean isFull(){
        if(top==size){return true;}else return false;
    }

    boolean isEmpty(){
        if(top==-1){return true;} else return false;
    }

    void push(T x){
        if(isFull()){
            System.out.println("Stack is Full.");
            return; // Exit the method instead of using break
        }
        // Add the element to the stack and increment top
        stk[++top] = x;// top ++ will give top and THEN add 1. ++top will add and then assign value
        System.out.println(x + " is Added to Stack");
    }

    T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return null;
        }
        return stk[top--];
    }

    T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return null;
        }
        return stk[top];
    }

    void display(){
        if(isEmpty()){System.out.println("Stack is empty.");}
        System.out.println("===============================");
        for (int index = top; index >=0; index--) {
            System.out.println("Element "+index+": "+stk[index]);
            System.out.println("------------------------------");
        }
        System.out.println("===============================");

    }
}

