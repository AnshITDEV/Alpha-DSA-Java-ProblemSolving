/*  

public class LinkedList{

       public static class Node{
              int data;
              Node next;

              public Node(int data){
                     this.data = data;
                     this.next = null;
              }
       }

       public static Node head;
       public static Node tail;

       public static void main(String args[]){
              LinkedList ll = new LinkedList();

              ll.head = new Node(1);
              ll.head.next = new Node(2);
       }
}


*/



/* 
public class LinkedList {

       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       public static Node head;
       public static Node tail;

       public void addFirst(int data){
              Node newNode = new Node(data);

              if(head == null){
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public static void main(String args[]) {
              LinkedList ll = new LinkedList();

              ll.addFirst(1);
              ll.addFirst(2);
       }
}

*/


/*  
public class LinkedList {

       public static class Node {
              
              int data;
              Node next;

              public Node ( int data ) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;

       public static void addFirst (int data) {

              Node newNode = new Node( data );

              if( head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public static void addLast ( int data ) {

              Node newNode = new Node( data );

              if( head == null ) {
                     head = tail = newNode;
                     return;

              }

              tail.next = newNode;
              tail = newNode;
       }

       public static void main(String args[]) {
              LinkedList ll = new LinkedList();

              ll.addFirst(3);
              ll.addFirst(5);

              ll.addLast(8);
              ll.addLast(10);
       }
}


*/


/* 
public class LinkedList {

       public static class Node {

              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;

       public static void addFirst(int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void add ( int idx, int data) {

              Node newNode = new Node(data);
              Node temp = head;
              int i = 0;

              while ( temp < idx-1 ) {
                     temp = temp.next;
                     i++;
              }

              newNode.next = temp.next;
              temp.next = newNode;
       }

       public static void addLast(int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;

              }

              tail.next = newNode;
              tail = newNode;
       }

       public void print(){            // O(n)
              if(head == null){
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

                     while(temp != null) {
                            System.out.print(temp.data+" -> ");
                            temp = temp.next;
                     }
                     System.out.println("null");
              }

              public static void main(String args[]) {
                     LinkedList ll = new LinkedList();

                     ll.print();

                     ll.addFirst(3);
                     ll.print();
                     
                     ll.addFirst(5);
                     ll.print();
                     
                     ll.addLast(8);
                     ll.print();
                     
                     ll.addLast(10);
                     ll.print();
                     
              }
       }

       */



/*  


public class LinkedList {

              public static class Node {

                     int data;
                     Node next;

                     public Node(int data) {
                            this.data = data;
                            this.next = null;
                     }

              }

              public static Node head;
              public static Node tail;

              public static void addFirst(int data) {

                     Node newNode = new Node(data);

                     if (head == null) {
                            head = tail = newNode;
                            return;
                     }

                     newNode.next = head;
                     head = newNode;
              }

              public void add(int idx, int data) {

                     if( idx == 0 ) {
                            addFirst(data);
                            return;
                     }

                     Node newNode = new Node(data);
                     Node temp = head;
                     int i = 0;

                     while ( i < idx - 1 ) {
                            temp = temp.next;
                            i++;
                     }

                     newNode.next = temp.next;
                     temp.next = newNode;
              }

              public static void addLast(int data) {

                     Node newNode = new Node(data);

                     if (head == null) {
                            head = tail = newNode;
                            return;

                     }

                     tail.next = newNode;
                     tail = newNode;
              }

              public void print() { // O(n)
                     if (head == null) {
                            System.out.println("LL is empty");
                            return;
                     }

                     Node temp = head;

                     while (temp != null) {
                            System.out.print(temp.data + " -> ");
                            temp = temp.next;
                     }
                     System.out.println("null");
              }

              public static void main(String args[]) {
                     LinkedList ll = new LinkedList();

                     ll.addFirst(3);
                     ll.addFirst(5);
                     ll.addLast(8);
                     ll.addLast(10);

                     ll.print();

                     ll.add(2,7);

                     ll.print();
                     
              }
       }
*/

/*

public class LinkedList {

       public static class Node {

              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;
       public static int size;

       public static void addFirst(int data) {

              Node newNode = new Node(data);
              size++;
              
              if (head == null) {
                     head = tail = newNode;
                     return;
              }
              
              newNode.next = head;
              head = newNode;
       }
       
       public void add(int idx, int data) {
              
              if (idx == 0) {
                     addFirst(data);
                     return;
              }
              size++;
              
              Node newNode = new Node(data);
              Node temp = head;
              int i = 0;
              
              while (i < idx - 1) {
                     temp = temp.next;
                     i++;
              }
              
              newNode.next = temp.next;
              temp.next = newNode;
       }
       
       public static void addLast(int data) {
              
              Node newNode = new Node(data);
              size++;
              
              if (head == null) {
                     head = tail = newNode;
                     return;

              }

              tail.next = newNode;
              tail = newNode;
       }

       public static int removeFirst () {
              if( size == 0 ) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if( size == 1 ) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }
              size--;

              int val = head.data;
              head = head.next;
              return val;
       }

       public static int removeLast () {
              if( size == 0 ) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }
              
              if( size == 1 ) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }

              Node prev = head;

              for ( int i = 0; i < size - 2; i++) {
                     prev = prev.next;
              }

              int val = tail.data;
              prev.next = null;
              tail = prev;
              size--;
              return val;
       }


       public void print() { // O(n)
              if (head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }
              System.out.println("null");
       }

       public static void main(String args[]) {
              LinkedList ll = new LinkedList();

              ll.addFirst(3);
              ll.addFirst(5);
              ll.addLast(8);
              ll.addLast(10);

              ll.print();

              ll.add(2, 7);

              ll.print();

              System.out.println(size);

              ll.removeFirst();
              ll.print();
              System.out.println(size);

              ll.removeLast();
              ll.print();
              System.out.println(size);

       }
}


*/

/* 

import org.w3c.dom.Node;

public class LinkedList {

       public static class Node {

              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;
       public static int size;

       public static void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void add(int idx, int data) {

              if (idx == 0) {
                     addFirst(data);
                     return;
              }
              size++;

              Node newNode = new Node(data);
              Node temp = head;
              int i = 0;

              while (i < idx - 1) {
                     temp = temp.next;
                     i++;
              }

              newNode.next = temp.next;
              temp.next = newNode;
       }

       public static void addLast(int data) {

              Node newNode = new Node(data);
              size++;

              if (head == null) {
                     head = tail = newNode;
                     return;

              }

              tail.next = newNode;
              tail = newNode;
       }

       public static int removeFirst() {
              if (size == 0) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if (size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }
              size--;

              int val = head.data;
              head = head.next;
              return val;
       }

       public static int removeLast() {
              if (size == 0) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if (size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }

              Node prev = head;

              for (int i = 0; i < size - 2; i++) {
                     prev = prev.next;
              }

              int val = tail.data;
              prev.next = null;
              tail = prev;
              size--;
              return val;
       }

       public void print() { // O(n)
              if (head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }
              System.out.println("null");
       }

       public static int search ( int key ) {

              Node temp = head;
              int i = 0; 

              while ( temp != null ) {
                     
                     if( temp.data == key ) {
                            return i;
                     }

                     temp = temp.next;
                     i++;
              }

              return -1;
       }

       public static void main(String args[]) {
              LinkedList ll = new LinkedList();

              ll.addFirst(3);
              ll.addFirst(5);
              ll.addLast(8);
              ll.addLast(10);

              ll.print();

              ll.add(2, 7);

              ll.print();

              System.out.println(size);

              ll.removeFirst();
              ll.print();
              System.out.println(size);

              ll.removeLast();
              ll.print();
              System.out.println(size);

              System.out.println("the number you are trying to search is at index "+ll.search(8));
       }
}


 */



/* 

iterative searching of the element in the linkedlist 



import org.w3c.dom.Node;

public class LinkedList {

       public static class Node {

              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;
       public static int size;

       public static void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void add(int idx, int data) {

              if (idx == 0) {
                     addFirst(data);
                     return;
              }
              size++;

              Node newNode = new Node(data);
              Node temp = head;
              int i = 0;

              while (i < idx - 1) {
                     temp = temp.next;
                     i++;
              }

              newNode.next = temp.next;
              temp.next = newNode;
       }

       public static void addLast(int data) {

              Node newNode = new Node(data);
              size++;

              if (head == null) {
                     head = tail = newNode;
                     return;

              }

              tail.next = newNode;
              tail = newNode;
       }

       public static int removeFirst() {
              if (size == 0) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if (size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }
              size--;

              int val = head.data;
              head = head.next;
              return val;
       }

       public static int removeLast() {
              if (size == 0) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if (size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }

              Node prev = head;

              for (int i = 0; i < size - 2; i++) {
                     prev = prev.next;
              }

              int val = tail.data;
              prev.next = null;
              tail = prev;
              size--;
              return val;
       }

       public void print() { // O(n)
              if (head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }
              System.out.println("null");
       }

       public static int search(int key) {

              Node temp = head;
              int i = 0;

              while (temp != null) {

                     if (temp.data == key) {
                            return i;
                     }

                     temp = temp.next;
                     i++;
              }

              return -1;
       }

       public static void main(String args[]) {
              LinkedList ll = new LinkedList();

              ll.addFirst(3);
              ll.addFirst(5);
              ll.addLast(8);
              ll.addLast(10);

              ll.print();

              ll.add(2, 7);

              ll.print();

              System.out.println(size);

              ll.removeFirst();
              ll.print();
              System.out.println(size);

              ll.removeLast();
              ll.print();
              System.out.println(size);

              System.out.println("the number you are trying to search is at index " + ll.search(8));
       }
}

*/



/*  Linked List Recursive Search



import org.w3c.dom.Node;

public class LinkedList {

       public static class Node {
              int data;
              Node next;

              public Node ( int data ) {
                     this.data = data;
                     this.next = null;
              }

       }

       public static Node head;
       public static Node tail;

       public void addFirst (int data) {

              Node newNode = new Node (data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public static int helper (Node head, int key) {

              if (head == null) {
                     return -1;
              }

              if (head.data == key) {
                     return 0;
              }

              int idx = helper(head.next, key);

              if (idx == -1) {
                     return -1;
              }

              return idx + 1;
       }


       public static int recSearch (int key) {
              return helper(head,key);
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addFirst(4);
              ll.addFirst(3);
              ll.addFirst(2);
              ll.addFirst(1);
              
              System.out.println(ll.recSearch(3));
       }
}


*/




/* Reverse a Linked List (Iterative Approach) 

public class LinkedList {

       public static class Node {

              int data;
              Node next;

              public Node (int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       public static Node head;
       public static Node tail;

       public void addFirst (int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void reverse() {

              Node prev = null;
              Node curr = head;
              Node next;

              while (curr != null) {

                     next = curr.next;
                     curr.next = prev;

                     prev = curr;
                     curr = next;
              }

              head = prev;
       }

       public void print () {

              if(head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data+" -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main (String args []) {

              LinkedList ll = new LinkedList();

              ll.addFirst(5);
              ll.addFirst(4);
              ll.addFirst(3);
              ll.addFirst(2);
              ll.addFirst(1);


              ll.print();

              ll.reverse();

              ll.print();
       }
}

*/




/* Find and Remove Nth Node From End of Linked List 

TC: O(n)
SC: O(1)





public class LinkedList {

       // Node class
       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       // Head and tail
       public static Node head;
       public static Node tail;

       // Add at beginning
       public void addFirst(int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       // Print linked list
       public void print() {

              if (head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       // Delete the Nth node from end 

       public void deleteNthFromEnd(int n) {

              int size = 0;
              Node temp = head;

              while (temp != null) {
                     temp = temp.next;
                     size++;
              }

              int idxToDelete = size - n + 1;

              if (n == size) {
                     head = head.next;
                     return;
              }


              Node prev = head;

              int i = 1;

              while (i < idxToDelete-1) {
                     prev = prev.next;
                     i++;
              }

              prev.next = prev.next.next;
       }



       // Main method
       public static void main(String[] args) {

              LinkedList ll = new LinkedList();

              ll.addFirst(5);
              ll.addFirst(4);
              ll.addFirst(3);
              ll.addFirst(2);
              ll.addFirst(1);

              System.out.println("Original Linked List:");
              ll.print();

              ll.deleteNthFromEnd(3);

              System.out.println("After Deletion:");
              ll.print();
       }
}

*/


/*

Check if Linked List is a Palindrome
TC: O(n)
SC: O(1)


public class LinkedList {

       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       public static Node head;
       public static Node tail;

       public void addFirst(int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void print() {

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       // Find middle node
       public Node findMidNode(Node head) {

              Node slow = head;
              Node fast = head;

              while (fast != null && fast.next != null) {
                     slow = slow.next;
                     fast = fast.next.next;
              }

              return slow;
       }

       // Check palindrome
       public boolean checkPalindrome() {
              //base case
              if (head == null || head.next == null) {
                     return true;
              }

              //step 1: find mid
              Node mid = findMidNode(head);
              
              //step 2: reverse the second half
              Node prev = null;
              Node curr = mid;
              Node next;

              while (curr != null) {
                     next = curr.next;
                     curr.next = prev;
                     prev = curr;
                     curr = next;
              }

              //step 3: Check palindrome using left and right
              
              Node left = head;
              Node right = prev;

              while (right != null) {

                     if (left.data != right.data) {
                            return false;
                     }

                     left = left.next;
                     right = right.next;
              }

              return true;
       }

       public static void main(String[] args) {

              LinkedList ll = new LinkedList();

              ll.addFirst(1);
              ll.addFirst(2);
              ll.addFirst(2);
              ll.addFirst(1);

              ll.print();

              System.out.println(ll.checkPalindrome());
       }
}


*/

/* 
Detect a Loop/Cycle in Linked List (Floyd's Cycle Detection Algorithm)
TC: N
SC: 1


public class LinkedList {

       // Node class
       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       // Head and tail
       public static Node head;
       public static Node tail;

       //detect cycle
       public boolean isCycle() {

              Node slow = head;
              Node fast = head;

              while (fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if (slow == fast) {
                            return true;
                     }
              }

              return false;
       }
       

       // Main method
       public static void main(String[] args) {

              LinkedList ll = new LinkedList();

              head = new Node(1);
              
              Node temp = new Node(2);
              head.next = temp;
              
              head.next.next = new Node (3);
              head.next.next.next = new Node (4);

              //creating a loop 
              head.next.next.next.next = temp;

              System.out.println(ll.isCycle());
       }
}

*/

/* 
Remove a Loop/Cycle in Linked List (Floyd's Algorithm)
TC: N
SC: 1

public class LinkedList {

       // Node class
       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       // Head and Tail
       public static Node head;
       public static Node tail;

       // Remove Cycle
       public void removeCycle() {

              // Detect Cycle
              Node slow = head;
              Node fast = head;
              boolean cycle = false;

              while (fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if (slow == fast) {
                            cycle = true;
                            break;
                     }
              }

              //remove cycle 

              if (!cycle) {
                     return;
              }
              
              Node prev = fast;
              slow = head;

              while (slow != fast) {
                     prev = fast;
                     slow = slow.next;
                     fast = fast.next;
              }

              prev.next = null;
       }
       


       // Check Cycle
       public boolean isCycle() {

              Node slow = head;
              Node fast = head;

              while (fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if (slow == fast) {
                            return true;
                     }
              }

              return false;
       }

       // Main Method
       public static void main(String[] args) {

              LinkedList ll = new LinkedList();

              head = new Node(1);

              Node temp = new Node(2);
              head.next = temp;

              head.next.next = new Node(3);
              head.next.next.next = new Node(4);

              // Create cycle
              head.next.next.next.next = temp;

              System.out.println("Cycle Present: " + ll.isCycle());

              ll.removeCycle();

              System.out.println("Cycle Present: " + ll.isCycle());
       }
}

*/


/* 
Java Collection Framework-LinkedList

import java.util.LinkedList;

public class LinkedListDemo {

       public static void main (String args[]) {

              LinkedList <Integer> ll = new LinkedList <>();

              ll.addLast(1);
              ll.addLast(2);
              ll.addLast(3);

              ll.addFirst(0);

              System.out.println(ll);

              ll.removeLast();
              ll.removeFirst();

              System.out.println(ll);
       }

}

*/




/*
Merge Sort on LinkedList using JCF

TC:O(n log n)
SC:O(n)


import java.util.LinkedList;

public class LinkedListDemo {

       public static LinkedList <Integer> mergeSort (LinkedList <Integer> ll) {

              if (ll.size() <= 1) {
                     return ll;
              }

              int mid = ll.size() / 2;

              LinkedList <Integer> left = new LinkedList <>();
              LinkedList <Integer> right = new LinkedList <>();

              for (int i = 0; i < mid; i++) {
                     left.add(ll.get(i));
              }

              for (int i = mid; i < ll.size(); i++) {
                     right.add(ll.get(i));
              }

              left = mergeSort(left);
              right = mergeSort(right);

              return merge (left, right);
       }

       public static LinkedList<Integer> merge (LinkedList<Integer> left, LinkedList<Integer> right) {

              LinkedList <Integer> result = new LinkedList <>();

              int i = 0;
              int j = 0;

              while (i < left.size() && j < right.size()) {

                     if(left.get(i) < right.get(j)) {
                            result.add(left.get(i));
                            i++;
                     }
                     else {
                            result.add(right.get(j));
                            j++;
                     }
              }

              while (i < left.size()) {
                     result.add(left.get(i));
                     i++;
              }

              while (j < right.size()) {
                     result.add(right.get(j));
                     j++;
              }

              return result;
       }



       public static void main(String[] args) {

              LinkedList<Integer> ll = new LinkedList<>();

              ll.addFirst(1);
              ll.addFirst(2);
              ll.addFirst(3);
              ll.addFirst(4);
              ll.addFirst(5);

              System.out.println("Original List:");
              System.out.println(ll);

              ll = mergeSort(ll);

              System.out.println("Sorted List:");
              System.out.println(ll);
       }
}

 */


/*  

Convert a Linked List into Zig-Zag Form.
TC: N
SC: 1

public class LinkedListDemo {

       // Node Class
       public static class Node {
              int data;
              Node next;

              public Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       // Head and Tail
       public static Node head;
       public static Node tail;

       // Add at End
       public void addLast(int data) {

              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     return;
              }

              tail.next = newNode;
              tail = newNode;
       }

       // Print Linked List
       public void print() {

              if (head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while (temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       // Zig-Zag Linked List
       public void zigZag () {

              //find Mid
              Node slow = head;
              Node fast = head.next;

              while (fast != null && fast.next != null) {
                     slow = slow.next;
                     fast = fast.next.next;
              }

              Node mid = slow;

              //Reverse the second half 
              Node curr = mid.next;
              mid.next = null;

              Node prev = null;
              Node next;

              while (curr != null) {
                     next = curr.next;
                     curr.next = prev;
                     prev = curr;
                     curr = next;
              }

              //zigZag merge using left and right

              Node Left = head;
              Node Right = prev;

              Node nextL;
              Node nextR;

              while (Left != null && Right != null) {
                     nextL = Left.next;
                     nextR = Right.next;

                     Left.next = Right;
                     Right.next = nextL;

                     Left = nextL;
                     Right = nextR;
              }
       }

       // Main Method
       public static void main(String[] args) {

              LinkedListDemo ll = new LinkedListDemo();

              ll.addLast(1);
              ll.addLast(2);
              ll.addLast(3);
              ll.addLast(4);
              ll.addLast(5);
              ll.addLast(6);

              System.out.println("Original Linked List:");
              ll.print();

              ll.zigZag();

              System.out.println("Zig-Zag Linked List:");
              ll.print();
       }
}

*/

/* 

Implement a Doubly Linked List with addFirst(), print(), and removeFirst() 
& Reverse a Doubly Linked List (DLL)

| Operation     | Time Complexity |
| ------------- | --------------- |
| addFirst()    | O(1)            |
| removeFirst() | O(1)            |
| print()       | O(n)            |
| reverse()     | O(n)            |

Space Complexity
O(1)



public class DoubleLL {

       // Node Class
       public class Node {
              int data;
              Node next;
              Node prev;


              public Node(int data) {
                     this.data = data;
                     this.next = null;
                     this.prev = null;
              }
       }

       public static Node head;
       public static Node tail;
       public static int size;

       // Add First
       public void addFirst(int data) {
              Node newNode = new Node(data);

              if (head == null) {
                     head = tail = newNode;
                     size++;
                     return;
              }

              newNode.next = head;
              head.prev = newNode;
              head = newNode;
              size++;
       }


       // Print DLL
       public void print() {

              Node temp = head;

              if (temp == null) {
                     System.out.println("Linked List is empty");
                     return;
              }

              while (temp != null) {
                     System.out.print(temp.data+"<->");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       // Remove First
       public int removeFirst() {

              if(head == null) {
                     System.out.println("Linked List is empty");
                     return Integer.MIN_VALUE;
              }

              if(size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }

              int val = head.data;

              head = head.next;
              head.prev = null;
              size--;
              return val;
       }

       public void reverse () {
              
              Node curr = head;
              Node prev = null;
              Node next;

              while (curr != null) {

                     next = curr.next;

                     curr.next = prev;
                     curr.prev = next;

                     prev = curr;
                     curr = next;
              }

              head = prev;  
       }

       // Main Method
       public static void main(String args[]) {

              DoubleLL dll = new DoubleLL();

              dll.addFirst(3);
              dll.addFirst(2);
              dll.addFirst(1);

              dll.print();
              System.out.println("Size = " + dll.size);

              dll.reverse();
              dll.print();

              dll.removeFirst();
              dll.print();

              System.out.println("Size = " + dll.size);

              
       }
}


*/
















