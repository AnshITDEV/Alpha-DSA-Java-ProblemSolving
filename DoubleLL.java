/*


# Linked List - Index

| Sr. No. | Program                                |         Time Complexity         | Space Complexity |
| :-----: | -------------------------------------- | :-----------------------------: | :--------------: |
|    1    | Node Creation                          |             **O(1)**            |     **O(1)**     |
|    2    | Add First                              |             **O(1)**            |     **O(1)**     |
|    3    | Add Last                               |             **O(1)**            |     **O(1)**     |
|    4    | Print Linked List                      |             **O(N)**            |     **O(1)**     |
|    5    | Add at Index                           |             **O(N)**            |     **O(1)**     |
|    6    | Remove First                           |             **O(1)**            |     **O(1)**     |
|    7    | Remove Last                            |             **O(N)**            |     **O(1)**     |
|    8    | Iterative Search                       |             **O(N)**            |     **O(1)**     |
|    9    | Recursive Search                       |             **O(N)**            |     **O(N)**     |
|    10   | Reverse Linked List                    |             **O(N)**            |     **O(1)**     |
|    11   | Delete Nth Node From End               |             **O(N)**            |     **O(1)**     |
|    12   | Check Palindrome                       |             **O(N)**            |     **O(1)**     |
|    13   | Detect Cycle (Floyd's Algorithm)       |             **O(N)**            |     **O(1)**     |
|    14   | Remove Cycle (Floyd's Algorithm)       |             **O(N)**            |     **O(1)**     |
|    15   | Java Collection Framework (LinkedList) | **O(1)** *(add/remove at ends)* |     **O(N)**     |
|    16   | Merge Sort on Linked List              |          **O(N log N)**         |   **O(log N)**   |
|    17   | Zig-Zag Linked List                    |             **O(N)**            |     **O(1)**     |
|    18   | Doubly Linked List – addFirst()        |             **O(1)**            |     **O(1)**     |
|    19   | Doubly Linked List – removeFirst()     |             **O(1)**            |     **O(1)**     |
|    20   | Reverse Doubly Linked List             |             **O(N)**            |     **O(1)**     |

---

# Complexity Summary

| Complexity         | Programs                                                                                                                                                                                                                                                                                                                        |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**           | Node Creation, Add First, Add Last, Remove First, JCF LinkedList (addFirst, addLast, removeFirst, removeLast), Doubly Linked List addFirst(), Doubly Linked List removeFirst()                                                                                                                                                  |
| **O(N)**           | Print Linked List, Add at Index, Remove Last, Iterative Search, Recursive Search, Reverse Linked List, Delete Nth Node From End, Check Palindrome, Detect Cycle, Remove Cycle, Zig-Zag Linked List, Reverse Doubly Linked List                                                                                                  |
| **O(N log N)**     | Merge Sort on Linked List                                                                                                                                                                                                                                                                                                       |
| **O(1) Space**     | Node Creation, Add First, Add Last, Print Linked List, Add at Index, Remove First, Remove Last, Iterative Search, Reverse Linked List, Delete Nth Node From End, Check Palindrome, Detect Cycle, Remove Cycle, Zig-Zag Linked List, Doubly Linked List addFirst(), Doubly Linked List removeFirst(), Reverse Doubly Linked List |
| **O(N) Space**     | Recursive Search, Java Collection Framework (LinkedList)                                                                                                                                                                                                                                                                        |
| **O(log N) Space** | Merge Sort on Linked List                                                                                                                                                                                                                                                                                                       |




// ------------------------------------------------------------
// Linked List | Node Creation
//
// TC: O(1)
// Reason: Creating a node and assigning references takes constant time.
//
// SC: O(1)
// Reason: Only one node is created.
// ------------------------------------------------------------

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

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.head = new Node(1);
              ll.head.next = new Node(2);
       }
}


// ------------------------------------------------------------
// Linked List | Add First
//
// TC: O(1)
// Reason: Inserts the new node at the beginning.
//
// SC: O(1)
// Reason: Only one new node is created.
// ------------------------------------------------------------

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

              if(head == null) {
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


// ------------------------------------------------------------
// Linked List | Add Last
//
// TC: O(1)
// Reason: Tail pointer allows insertion at the end in constant time.
//
// SC: O(1)
// Reason: Only one new node is created.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void addLast(int data) {

              Node newNode = new Node(data);

              if(head == null) {
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


// ------------------------------------------------------------
// Linked List | Print Linked List
//
// TC: O(N)
// Reason: Visits every node exactly once.
//
// SC: O(1)
// Reason: Uses only one temporary pointer.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void addLast(int data) {

              Node newNode = new Node(data);

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              tail.next = newNode;
              tail = newNode;
       }

       public void print() {

              if(head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while(temp != null) {
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
       }
}


// ------------------------------------------------------------
// Linked List | Add at Index
//
// TC: O(N)
// Reason: Traverses the list to reach the required index.
//
// SC: O(1)
// Reason: Only one new node is created.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void addLast(int data) {

              Node newNode = new Node(data);

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              tail.next = newNode;
              tail = newNode;
       }

       public void add(int idx, int data) {

              if(idx == 0) {
                     addFirst(data);
                     return;
              }

              Node newNode = new Node(data);

              Node temp = head;

              int i = 0;

              while(i < idx - 1) {
                     temp = temp.next;
                     i++;
              }

              newNode.next = temp.next;
              temp.next = newNode;
       }

       public void print() {

              if(head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while(temp != null) {
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
       }
}



// ------------------------------------------------------------
// Linked List | Remove First Node
//
// TC: O(1)
// Reason: Head pointer is updated directly.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

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

       public void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public int removeFirst() {

              if(size == 0) {
                     System.out.println("LL is empty");
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
              size--;

              return val;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addFirst(3);
              ll.addFirst(2);
              ll.addFirst(1);

              ll.print();

              ll.removeFirst();

              ll.print();
       }
}


// ------------------------------------------------------------
// Linked List | Remove Last Node
//
// TC: O(N)
// Reason: Traverses the list to reach the second last node.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

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

       public void addLast(int data) {

              Node newNode = new Node(data);
              size++;

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              tail.next = newNode;
              tail = newNode;
       }

       public int removeLast() {

              if(size == 0) {
                     System.out.println("LL is empty");
                     return Integer.MIN_VALUE;
              }

              if(size == 1) {
                     int val = head.data;
                     head = tail = null;
                     size = 0;
                     return val;
              }

              Node prev = head;

              for(int i = 0; i < size - 2; i++) {
                     prev = prev.next;
              }

              int val = tail.data;

              prev.next = null;
              tail = prev;
              size--;

              return val;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addLast(1);
              ll.addLast(2);
              ll.addLast(3);
              ll.addLast(4);

              ll.print();

              ll.removeLast();

              ll.print();
       }
}


// ------------------------------------------------------------
// Linked List | Iterative Search
//
// TC: O(N)
// Reason: Traverses the linked list until the key is found.
//
// SC: O(1)
// Reason: Uses only one temporary pointer.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public int search(int key) {

              Node temp = head;

              int idx = 0;

              while(temp != null) {

                     if(temp.data == key) {
                            return idx;
                     }

                     temp = temp.next;
                     idx++;
              }

              return -1;
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addFirst(8);
              ll.addFirst(7);
              ll.addFirst(6);
              ll.addFirst(5);

              System.out.println(ll.search(7));
       }
}


// ------------------------------------------------------------
// Linked List | Recursive Search
//
// TC: O(N)
// Reason: Visits one node in every recursive call.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public int helper(Node head, int key) {

              if(head == null) {
                     return -1;
              }

              if(head.data == key) {
                     return 0;
              }

              int idx = helper(head.next, key);

              if(idx == -1) {
                     return -1;
              }

              return idx + 1;
       }

       public int recSearch(int key) {
              return helper(head, key);
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


// ------------------------------------------------------------
// Linked List | Reverse Linked List (Iterative)
//
// TC: O(N)
// Reason: Traverses each node exactly once while reversing the links.
//
// SC: O(1)
// Reason: Uses only three extra pointers.
// ------------------------------------------------------------

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

              if(head == null) {
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

              while(curr != null) {

                     next = curr.next;
                     curr.next = prev;

                     prev = curr;
                     curr = next;
              }

              head = prev;
       }

       public void print() {

              if(head == null) {
                     System.out.println("LL is empty");
                     return;
              }

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

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


// ------------------------------------------------------------
// Linked List | Delete Nth Node From End
//
// TC: O(N)
// Reason: One traversal to find size and another to reach the node.
//
// SC: O(1)
// Reason: Uses only temporary pointers.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public void deleteNthFromEnd(int n) {

              int size = 0;

              Node temp = head;

              while(temp != null) {
                     temp = temp.next;
                     size++;
              }

              if(n == size) {
                     head = head.next;
                     return;
              }

              int idxToDelete = size - n + 1;

              Node prev = head;

              int i = 1;

              while(i < idxToDelete - 1) {
                     prev = prev.next;
                     i++;
              }

              prev.next = prev.next.next;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addFirst(5);
              ll.addFirst(4);
              ll.addFirst(3);
              ll.addFirst(2);
              ll.addFirst(1);

              ll.print();

              ll.deleteNthFromEnd(3);

              ll.print();
       }
}


// ------------------------------------------------------------
// Linked List | Check Palindrome
//
// TC: O(N)
// Reason: Finds middle, reverses second half, and compares both halves.
//
// SC: O(1)
// Reason: No extra data structure is used.
// ------------------------------------------------------------

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

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head = newNode;
       }

       public Node findMid(Node head) {

              Node slow = head;
              Node fast = head;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;
              }

              return slow;
       }

       public boolean checkPalindrome() {

              if(head == null || head.next == null) {
                     return true;
              }

              // Step 1 : Find Mid
              Node mid = findMid(head);

              // Step 2 : Reverse Second Half
              Node prev = null;
              Node curr = mid;
              Node next;

              while(curr != null) {

                     next = curr.next;
                     curr.next = prev;

                     prev = curr;
                     curr = next;
              }

              // Step 3 : Compare Both Halves
              Node left = head;
              Node right = prev;

              while(right != null) {

                     if(left.data != right.data) {
                            return false;
                     }

                     left = left.next;
                     right = right.next;
              }

              return true;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              ll.addFirst(1);
              ll.addFirst(2);
              ll.addFirst(2);
              ll.addFirst(1);

              ll.print();

              System.out.println(ll.checkPalindrome());
       }
}Java Collection Framework (JCF)


// ------------------------------------------------------------
// Linked List | Detect Cycle (Floyd's Cycle Detection)
//
// TC: O(N)
// Reason: Slow and fast pointers together traverse the linked list at most once.
//
// SC: O(1)
// Reason: Uses only two pointers.
// ------------------------------------------------------------

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

       public static boolean isCycle() {

              Node slow = head;
              Node fast = head;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if(slow == fast) {
                            return true;
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              head = new Node(1);
              Node temp = new Node(2);
              head.next = temp;

              head.next.next = new Node(3);
              head.next.next.next = temp;

              System.out.println(isCycle());
       }
}


// ------------------------------------------------------------
// Linked List | Remove Cycle (Floyd's Cycle Detection)
//
// TC: O(N)
// Reason: Detects the cycle and removes it in linear time.
//
// SC: O(1)
// Reason: Uses only constant extra pointers.
// ------------------------------------------------------------

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

       public static void removeCycle() {

              // Step 1 : Detect Cycle
              Node slow = head;
              Node fast = head;

              boolean cycle = false;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if(slow == fast) {
                            cycle = true;
                            break;
                     }
              }

              if(cycle == false) {
                     return;
              }

              // Step 2 : Find Starting Node of Cycle
              slow = head;
              Node prev = null;

              while(slow != fast) {

                     prev = fast;

                     slow = slow.next;
                     fast = fast.next;
              }

              // Step 3 : Remove Cycle
              prev.next = null;
       }

       public static boolean isCycle() {

              Node slow = head;
              Node fast = head;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;

                     if(slow == fast) {
                            return true;
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              head = new Node(1);

              Node temp = new Node(2);
              head.next = temp;

              head.next.next = new Node(3);
              head.next.next.next = new Node(4);
              head.next.next.next.next = temp;

              System.out.println(isCycle());

              removeCycle();

              System.out.println(isCycle());
       }
}


// ------------------------------------------------------------
// Linked List | Java Collection Framework (JCF)
//
// TC: O(1)
// Reason: addFirst(), addLast(), removeFirst(), and removeLast() take constant time.
//
// SC: O(N)
// Reason: LinkedList stores N elements.
// ------------------------------------------------------------

import java.util.LinkedList;

public class LLJCF {

       public static void main(String args[]) {

              LinkedList<Integer> ll = new LinkedList<>();

              ll.addFirst(2);
              ll.addFirst(1);

              ll.addLast(3);
              ll.addLast(4);

              System.out.println(ll);

              ll.removeFirst();
              System.out.println(ll);

              ll.removeLast();
              System.out.println(ll);
       }
}


// ------------------------------------------------------------
// Linked List | Merge Sort
//
// TC: O(N log N)
// Reason: List is divided into halves and merged at every level.
//
// SC: O(log N)
// Reason: Recursive call stack depth is logarithmic.
// ------------------------------------------------------------

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

       public Node getMid(Node head) {

              Node slow = head;
              Node fast = head.next;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;
              }

              return slow;
       }

       public Node merge(Node head1, Node head2) {

              Node mergedLL = new Node(-1);
              Node temp = mergedLL;

              while(head1 != null && head2 != null) {

                     if(head1.data <= head2.data) {

                            temp.next = head1;
                            head1 = head1.next;
                     }
                     else {

                            temp.next = head2;
                            head2 = head2.next;
                     }

                     temp = temp.next;
              }

              while(head1 != null) {

                     temp.next = head1;
                     head1 = head1.next;
                     temp = temp.next;
              }

              while(head2 != null) {

                     temp.next = head2;
                     head2 = head2.next;
                     temp = temp.next;
              }

              return mergedLL.next;
       }

       public Node mergeSort(Node head) {

              if(head == null || head.next == null) {
                     return head;
              }

              Node mid = getMid(head);

              Node rightHead = mid.next;
              mid.next = null;

              Node newLeft = mergeSort(head);
              Node newRight = mergeSort(rightHead);

              return merge(newLeft, newRight);
       }

       public void print(Node head) {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              head = new Node(4);
              head.next = new Node(2);
              head.next.next = new Node(5);
              head.next.next.next = new Node(1);
              head.next.next.next.next = new Node(3);

              head = ll.mergeSort(head);

              ll.print(head);
       }
}


// ------------------------------------------------------------
// Linked List | Zig-Zag Linked List
//
// TC: O(N)
// Reason: Finds the middle, reverses second half, and merges alternately.
//
// SC: O(1)
// Reason: Uses only pointer variables.
// ------------------------------------------------------------

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

       public void zigZag() {

              // Step 1 : Find Mid
              Node slow = head;
              Node fast = head.next;

              while(fast != null && fast.next != null) {

                     slow = slow.next;
                     fast = fast.next.next;
              }

              Node mid = slow;

              // Step 2 : Reverse Second Half
              Node curr = mid.next;
              mid.next = null;

              Node prev = null;
              Node next;

              while(curr != null) {

                     next = curr.next;
                     curr.next = prev;

                     prev = curr;
                     curr = next;
              }

              Node left = head;
              Node right = prev;

              // Step 3 : Zig-Zag Merge
              while(left != null && right != null) {

                     Node nextL = left.next;
                     Node nextR = right.next;

                     left.next = right;
                     right.next = nextL;

                     left = nextL;
                     right = nextR;
              }
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " -> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              LinkedList ll = new LinkedList();

              head = new Node(1);
              head.next = new Node(2);
              head.next.next = new Node(3);
              head.next.next.next = new Node(4);
              head.next.next.next.next = new Node(5);

              ll.print();

              ll.zigZag();

              ll.print();
       }
}



// ------------------------------------------------------------
// Doubly Linked List | Node Creation & addFirst()
//
// TC: O(1)
// Reason: Inserts the new node at the beginning using head pointer.
//
// SC: O(1)
// Reason: Only one new node is created.
// ------------------------------------------------------------

public class DoubleLL {

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

       public Node head;
       public Node tail;
       public int size;

       public void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head.prev = newNode;
              head = newNode;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " <-> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              DoubleLL dll = new DoubleLL();

              dll.addFirst(3);
              dll.addFirst(2);
              dll.addFirst(1);

              dll.print();
       }
}


// ------------------------------------------------------------
// Doubly Linked List | removeFirst()
//
// TC: O(1)
// Reason: Removes the head node by updating head pointer.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class DoubleLL {

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

       public Node head;
       public Node tail;
       public int size;

       public void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head.prev = newNode;
              head = newNode;
       }

       public int removeFirst() {

              if(head == null) {
                     System.out.println("DLL is Empty");
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

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " <-> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              DoubleLL dll = new DoubleLL();

              dll.addFirst(3);
              dll.addFirst(2);
              dll.addFirst(1);

              dll.print();

              dll.removeFirst();

              dll.print();
       }
}


// ------------------------------------------------------------
// Doubly Linked List | Reverse Doubly Linked List
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(1)
// Reason: Uses only pointer variables.
// ------------------------------------------------------------

public class DoubleLL {

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

       public Node head;
       public Node tail;
       public int size;

       public void addFirst(int data) {

              Node newNode = new Node(data);
              size++;

              if(head == null) {
                     head = tail = newNode;
                     return;
              }

              newNode.next = head;
              head.prev = newNode;
              head = newNode;
       }

       public void reverse() {

              Node curr = head;
              Node prev = null;
              Node next;

              while(curr != null) {

                     next = curr.next;

                     curr.next = prev;
                     curr.prev = next;

                     prev = curr;
                     curr = next;
              }

              head = prev;
       }

       public void print() {

              Node temp = head;

              while(temp != null) {
                     System.out.print(temp.data + " <-> ");
                     temp = temp.next;
              }

              System.out.println("null");
       }

       public static void main(String args[]) {

              DoubleLL dll = new DoubleLL();

              dll.addFirst(5);
              dll.addFirst(4);
              dll.addFirst(3);
              dll.addFirst(2);
              dll.addFirst(1);

              dll.print();

              dll.reverse();

              dll.print();
       }
}


 */











