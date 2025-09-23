import java.util.*;
import org.w3c.dom.Node;

public class MyLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }
    public static void insertAtPosition(int data , int position){
        Node newnode = new Node(data);
        if(position == 0){
            addFirst(data);
            return;
        }
        Node currNode = head;
        for(int i=0; i<position-1; i++){
            currNode = currNode.next;
            if(currNode == null){
                System.out.println("Position out of bounds");
                return;
            }
        }
        newnode.next = currNode.next;
        currNode.next = newnode;
        }
    public static void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public static void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public static void deleteAtSpecificPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position == 0){
            deleteFirst();
            return;
        }
        Node currNode = head;
        for(int i=0; i<position-1; i++){
            currNode = currNode.next;
            if(currNode == null || currNode.next == null){
                System.out.println("Position out of bounds");
                return;
            }
        }
        currNode.next = currNode.next.next;
    }
    public static void searchData(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        int position = 0;
        while(currNode != null){
            if(currNode.data == data){
                System.out.println("data is found at position: " + position);
                return;
            }
            currNode = currNode.next;
            position++;
        }
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            if(currNode.next == null){
                System.out.print("null");
            }
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void Insertion(){
         Scanner sc = new Scanner(System.in);
         System.err.println("Enter 1 to insert at first");
         System.err.println("Enter 2 to insert at last");
         System.err.println("Enter 3 to insert at specific position");
         int choice = sc.nextInt();
         switch(choice){
            case 1: 
              System.out.println("Enter data to insert at first: ");
              int data1 = sc.nextInt();
              addFirst(data1);
              break;
            case 2: 
              System.out.println("Enter data to insert at last: ");
              int data2 = sc.nextInt();
              addLast(data2);
              break;
            case 3:
              System.out.println("Enter data and position to insert at specific position: ");
              int data3 = sc.nextInt();
              int position = sc.nextInt();
              insertAtPosition(data3, position);
              break;
            default:
              System.out.println("Invalid choice");
              break;
         }
    }
    public static void Delection(){
         Scanner sc = new Scanner(System.in);
         System.err.println("Enter 1 to delete at first");
         System.err.println("Enter 2 to delete at last");
         System.err.println("Enter 3 to delete at specific position");
         int choice = sc.nextInt();
         switch(choice){
            case 1: 
                System.out.println("Deleting first node");
                deleteFirst();
                break;
            case 2:  
                System.out.println("Deleting last node");
                deleteLast();
                break;
            case 3:
                System.out.println("Enter position to delete at specific position: ");
                int position = sc.nextInt();
                deleteAtSpecificPosition(position);
                break;
            default:
                 System.out.println("Invalid choice");
            break;

         }
     }
    public static void Search(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data to search: ");
            int data = sc.nextInt();
            searchData(data);
    }
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----MENU----");
        while(true){
        System.out.println("Enter 1 to Insert");
        System.out.println("Enter 2 to Delete ");
        System.out.println("Enter 3 to Search ");
        System.out.println("Enter 4 to Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
               Insertion();
               printList();
               System.out.println("");
               break;
            case 2:
               Delection();
               printList();
               System.out.println("");
               break;
            case 3:
               Search();
               printList();
               System.out.println("");
               break;
            case 4:
               System.out.println("Exiting...");
               System.out.println("Thank you for using the LinkedList program");
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
               break;
        }
    }

    }
}

