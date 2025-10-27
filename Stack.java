public class stack {
public int[] arr;
public int tos;
public stack(int size) {
arr = new int[size];
tos = -1;
}
public void push(int value) {
System.out.println("Running: push()");
if (tos == arr.length - 1) {
System.out.println("Stack Overflow");
displayArray();
return;
}
arr[++tos] = value;
System.out.println("Pushed: " + value);
display();
displayArray();
}
public int pop() {
System.out.println("Running: pop()");
if (tos == -1) {
System.out.println("Stack Underflow");
displayArray();
return -1;
}
int popped = arr[tos--];
System.out.println("Popped: " + popped);
display();
displayArray();
return popped;
}
public int peek() {
System.out.println("Running: peek()");
if (tos == -1) {
Program :- Using Stack

import java.util.Scanner;
Name :- Yash Joshi
Roll no :- 27
Sec :- B Batch:- B2

System.out.println("Stack is empty");
return -1;
}
System.out.println("Top element: " + arr[tos]);
return arr[tos];
}
public void display() {
System.out.print("Stack: ");
if (tos == -1) {
System.out.print("Empty");
} else {
for (int i = 0; i <= tos; i++) {
System.out.print(arr[i] + " ");
}
}
System.out.println();
}
public void displayArray() {
System.out.print("Array: ");
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter stack size: ");
int size = sc.nextInt();
stack s = new stack(size);
// User input for initial array values
size + "S)y:st"e)m;.out.print("Enter number of initial elements to push (<= " +
int n = sc.nextInt();
if (n > size) n = size;
for (int i = 0; i < n; i++) {
System.out.print("Enter element " + (i + 1) + ": ");
int val = sc.nextInt();
s.push(val);
}
while (true) {
4.Display 5S.yDsitsepml.aoyutA.rprraiynt6l.nE(xi"t\"n)C;hoose operation: 1.Push 2.Pop 3.Peek

int choice = sc.nextInt();
switch (choice) {
case 1 -> {
System.out.print("Enter value to push: ");
int val = sc.nextInt();
s.push(val);
}
case 2 -> s.pop();
case 3 -> s.peek();
case 4 -> {

Output :-

System.out.println("Running: display()");
s.display();
s.displayArray();
}
case 5 -> {
System.out.println("Running: displayArray()");
s.displayArray();
}
case 6 -> {
System.out.println("Exiting...");
sc.close();
return;
}
default -> System.out.println("Invalid choice!");
}
}
}
}
