#include <iostream>
using namespace std;

class Stack{
    private:
    int top;
    int size;
    int* array; // pointer to some location

    public:
    Stack(int size){
        this->top = -1;
        this->size = size;
        this->array = new int[size]; // initialised the next Size*4 bytes from that location 
        // int array[size];
    }
    
    // funcion declatation
    bool isFull();
    bool isEmpty();
    void push(int x);
    int pop();
    

};

bool Stack::isFull(){
    return top==size;
}
bool Stack::isEmpty(){
    return top==-1;
}

void Stack::push(int x){
    if(isFull()){
        cout<<"Stack is full"<< endl;
    }
    else{
        array[++top] = x;
    }
}

int Stack::pop(){
    if(isEmpty()){
        cout<<"Stack is empty"<<endl;
        return 0;
    }
    else{
        return array[top--];
    }
}

int main(){
    Stack s(5);
    cout << "Is stack empty? " << (s.isEmpty() ? "Yes" : "No") << endl;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    cout << "Is stack full? " << (s.isFull() ? "Yes" : "No") << endl;
    s.push(60); // Should print stack is full
    cout << "Popped: " << s.pop() << endl;
    cout << "Popped: " << s.pop() << endl;
    cout << "Popped: " << s.pop() << endl;
    cout << "Popped: " << s.pop() << endl;
    cout << "Popped: " << s.pop() << endl;
    cout << "Popped: " << s.pop() << endl; // Should print stack is empty
    cout << "Is stack empty? " << (s.isEmpty() ? "Yes" : "No") << endl;
    return 0;
}
