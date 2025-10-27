public class Stack {
private int[] stack;
private int top;
private int size;

public FixedSizeStack(int size) {
this.size = size;
stack = new int[size];
top = -1;
}

public void push(int value) {
if (top == size - 1) {
System.out.println(&quot;Stack Overflow&quot;);
return;
}
stack[++top] = value;
}

public int pop() {
if (top == -1) {
System.out.println(&quot;Stack Underflow&quot;);
return -1;
}
return stack[top--];
}

public int peek() {
if (top == -1) {
System.out.println(&quot;Stack is Empty&quot;);
return -1;
}
return stack[top];
}

public static void main(String[] args) {
FixedSizeStack s = new FixedSizeStack(4);
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
System.out.println(&quot;Top element: &quot; + s.peek());
System.out.println(&quot;Popped: &quot; + s.pop());
System.out.println(&quot;Top element after pop: &quot; + s.peek());


}
}
