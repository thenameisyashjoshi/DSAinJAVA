class DoublyLinkedList {
class Node {
int data;
Node prev, next;
Node(int data) {
this.data = data;
}
}

Node head, tail;
// Add First
void addFirst(int data) {
Node newNode = new Node(data);
if (head == null) {
head = tail = newNode;
} else {
newNode.next = head;
head.prev = newNode;
head = newNode;
}
}

// Add Last
void addLast(int data) {
Node newNode = new Node(data);
if (tail == null) {
head = tail = newNode;
} else {
tail.next = newNode;
newNode.prev = tail;
tail = newNode;
}
}

// Delete First
void deleteFirst() {
if (head == null) return;
if (head == tail) {
head = tail = null;
} else {
head = head.next;
head.prev = null;
}
}

// Delete Last
void deleteLast() {
if (tail == null) return;
if (head == tail) {
head = tail = null;
} else {
tail = tail.prev;
tail.next = null;
}
}

// Display
void display() {
Node temp = head;
System.out.print(&quot;Doubly List: &quot;);
while (temp != null) {
System.out.print(temp.data + &quot; &quot;);
temp = temp.next;
}
System.out.println();
}
}
class CircularLinkedList {
class Node {
int data;
Node next;

Department of ECS Page 4
Node(int data) {
this.data = data;
}
}

Node head, tail;

// Add First
void addFirst(int data) {
Node newNode = new Node(data);
if (head == null) {
head = tail = newNode;
tail.next = head;
} else {
newNode.next = head;
head = newNode;
tail.next = head;
}
}

// Add Last
void addLast(int data) {
Node newNode = new Node(data);
if (head == null) {
head = tail = newNode;
tail.next = head;

} else {
tail.next = newNode;
tail = newNode;
tail.next = head;
}
}

// Delete First
void deleteFirst() {
if (head == null) return;
if (head == tail) {
head = tail = null;
} else {
head = head.next;
tail.next = head;
}
}

// Delete Last
void deleteLast() {
if (head == null) return;
if (head == tail) {
head = tail = null;
return;
}
Node temp = head;

while (temp.next != tail) {
temp = temp.next;
}
tail = temp;
tail.next = head;
}

// Display
void display() {
if (head == null) {
System.out.println(&quot;Circular List is empty&quot;);
return;
}
System.out.print(&quot;Circular List: &quot;);
Node temp = head;
do {
System.out.print(temp.data + &quot; &quot;);
temp = temp.next;
} while (temp != head);
System.out.println();
}
}

public class LinkedListOperations {
public static void main(String[] args) {
System.out.println(&quot;--- Doubly Linked List ---&quot;);

Department of ECS Page 4
DoublyLinkedList dll = new DoublyLinkedList();
dll.addFirst(10);
dll.addLast(20);
dll.addLast(30);
dll.display();
dll.deleteFirst();
dll.display();
dll.deleteLast();
dll.display();

System.out.println(&quot;\n--- Circular Linked List ---&quot;);
CircularLinkedList cll = new CircularLinkedList();
cll.addFirst(100);
cll.addLast(200);
cll.addLast(300);
cll.display();
cll.deleteFirst();
cll.display();
cll.deleteLast();
cll.display();
}
}
