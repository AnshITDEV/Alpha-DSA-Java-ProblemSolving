/*


# Queue - Index

| Sr. No. | Program                                     |                 Time Complexity                 | Space Complexity |
| :-----: | ------------------------------------------- | :---------------------------------------------: | :--------------: |
|    1    | Queue using Static Array                    | **Add:** O(1), **Remove:** O(N), **Peek:** O(1) |     **O(N)**     |
|    2    | Circular Queue using Array                  |            **O(1)** (All Operations)            |     **O(N)**     |
|    3    | Queue using Linked List                     |            **O(1)** (All Operations)            |     **O(N)**     |
|    4    | Queue using Java Collection Framework (JCF) |            **O(1)** (All Operations)            |     **O(N)**     |
|    5    | Queue using 2 Stacks                        | **Add:** O(N), **Remove:** O(1), **Peek:** O(1) |     **O(N)**     |
|    6    | Stack using 2 Queues                        |  **Push:** O(1), **Pop:** O(N), **Peek:** O(N)  |     **O(N)**     |
|    7    | First Non-Repeating Character in a Stream   |                     **O(N)**                    |     **O(N)**     |
|    8    | Interleave Two Halves of a Queue            |                     **O(N)**                    |     **O(N)**     |
|    9    | Reverse Queue using Stack                   |                     **O(N)**                    |     **O(N)**     |
|    10   | Deque (Basic Operations)                    |            **O(1)** (All Operations)            |     **O(N)**     |
|    11   | Stack using Deque                           |            **O(1)** (All Operations)            |     **O(N)**     |
|    12   | Queue using Deque                           |            **O(1)** (All Operations)            |     **O(N)**     |

---

# Complexity Summary

| Complexity                             | Programs                                                                                                                                                                                                                                                                                                                                       |
| -------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**                               | Circular Queue using Array, Queue using Linked List, Queue using Java Collection Framework (JCF), Deque (Basic Operations), Stack using Deque, Queue using Deque                                                                                                                                                                               |
| **O(1) Add / O(N) Remove**             | Queue using Static Array                                                                                                                                                                                                                                                                                                                       |
| **O(N) Add / O(1) Remove / O(1) Peek** | Queue using 2 Stacks                                                                                                                                                                                                                                                                                                                           |
| **O(1) Push / O(N) Pop / O(N) Peek**   | Stack using 2 Queues                                                                                                                                                                                                                                                                                                                           |
| **O(N)**                               | First Non-Repeating Character in a Stream, Interleave Two Halves of a Queue, Reverse Queue using Stack                                                                                                                                                                                                                                         |
| **O(N) Space**                         | Queue using Static Array, Circular Queue using Array, Queue using Linked List, Queue using Java Collection Framework (JCF), Queue using 2 Stacks, Stack using 2 Queues, First Non-Repeating Character in a Stream, Interleave Two Halves of a Queue, Reverse Queue using Stack, Deque (Basic Operations), Stack using Deque, Queue using Deque |



// ------------------------------------------------------------
// Queue | Static Array Implementation
//
// TC: O(1) -> add(), peek(), isEmpty()
// TC: O(N) -> remove()
// Reason: remove() shifts all remaining elements one position left.
//
// SC: O(N)
// Reason: Array stores N elements.
// ------------------------------------------------------------

public class QueueB {

       static class Queue {

              static int arr[];
              static int rear;
              static int size;

              Queue(int n) {
                     arr = new int[n];
                     size = n;
                     rear = -1;
              }

              public static boolean isEmpty() {
                     return rear == -1;
              }

              public static void add(int data) {

                     if(rear == size - 1) {
                            System.out.println("Queue is Full");
                            return;
                     }

                     rear++;
                     arr[rear] = data;
              }

              public static int remove() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     int front = arr[0];

                     for(int i = 0; i < rear; i++) {
                            arr[i] = arr[i + 1];
                     }

                     rear--;

                     return front;
              }

              public static int peek() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return arr[0];
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue(5);

              q.add(1);
              q.add(2);
              q.add(3);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}


// ------------------------------------------------------------
// Queue | Circular Queue using Array
//
// TC: O(1) -> add(), remove(), peek(), isEmpty()
// Reason: Front and rear move circularly using modulo operation.
//
// SC: O(N)
// Reason: Array stores N elements.
// ------------------------------------------------------------

public class QueueB {

       static class Queue {

              static int arr[];
              static int front;
              static int rear;
              static int size;

              Queue(int n) {
                     arr = new int[n];
                     size = n;
                     front = -1;
                     rear = -1;
              }

              public static boolean isEmpty() {
                     return front == -1 && rear == -1;
              }

              public static boolean isFull() {
                     return (rear + 1) % size == front;
              }

              public static void add(int data) {

                     if(isFull()) {
                            System.out.println("Queue is Full");
                            return;
                     }

                     if(front == -1) {
                            front = 0;
                     }

                     rear = (rear + 1) % size;
                     arr[rear] = data;
              }

              public static int remove() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     int result = arr[front];

                     if(front == rear) {
                            front = rear = -1;
                     }
                     else {
                            front = (front + 1) % size;
                     }

                     return result;
              }

              public static int peek() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return arr[front];
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue(3);

              q.add(1);
              q.add(2);
              q.add(3);

              System.out.println(q.remove());

              q.add(4);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}


// ------------------------------------------------------------
// Queue | Linked List Implementation
//
// TC: O(1) -> add(), remove(), peek(), isEmpty()
// Reason: Head and tail pointers allow constant time operations.
//
// SC: O(N)
// Reason: Linked List stores N nodes.
// ------------------------------------------------------------

public class QueueB {

       static class Node {

              int data;
              Node next;

              Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       static class Queue {

              static Node head = null;
              static Node tail = null;

              public static boolean isEmpty() {
                     return head == null && tail == null;
              }

              public static void add(int data) {

                     Node newNode = new Node(data);

                     if(head == null) {
                            head = tail = newNode;
                            return;
                     }

                     tail.next = newNode;
                     tail = newNode;
              }

              public static int remove() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     int front = head.data;

                     if(head == tail) {
                            head = tail = null;
                     }
                     else {
                            head = head.next;
                     }

                     return front;
              }

              public static int peek() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return head.data;
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue();

              q.add(1);
              q.add(2);
              q.add(3);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}



// ------------------------------------------------------------
// Queue | Java Collection Framework (JCF)
//
// TC: O(1) -> add(), remove(), peek(), isEmpty()
// Reason: LinkedList implementation provides constant-time queue operations.
//
// SC: O(N)
// Reason: Queue stores N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       public static void main(String args[]) {

              Queue<Integer> q = new LinkedList<>();

              q.add(1);
              q.add(2);
              q.add(3);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}


// ------------------------------------------------------------
// Queue | Implementation using 2 Stacks
//
// TC: O(N) -> add()
// TC: O(1) -> remove(), peek(), isEmpty()
// Reason: add() transfers all elements between the two stacks.
//
// SC: O(N)
// Reason: Two stacks together store N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       static class Queue {

              static Stack<Integer> s1 = new Stack<>();
              static Stack<Integer> s2 = new Stack<>();

              public static boolean isEmpty() {
                     return s1.isEmpty();
              }

              public static void add(int data) {

                     while(!s1.isEmpty()) {
                            s2.push(s1.pop());
                     }

                     s1.push(data);

                     while(!s2.isEmpty()) {
                            s1.push(s2.pop());
                     }
              }

              public static int remove() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return s1.pop();
              }

              public static int peek() {

                     if(isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return s1.peek();
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue();

              q.add(1);
              q.add(2);
              q.add(3);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}


// ------------------------------------------------------------
// Stack | Implementation using 2 Queues
//
// TC: O(1) -> push()
// TC: O(N) -> pop(), peek()
// Reason: pop() and peek() transfer elements between two queues.
//
// SC: O(N)
// Reason: Two queues together store N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       static class Stack {

              static Queue<Integer> q1 = new LinkedList<>();
              static Queue<Integer> q2 = new LinkedList<>();

              public static boolean isEmpty() {
                     return q1.isEmpty() && q2.isEmpty();
              }

              public static void push(int data) {

                     if(!q1.isEmpty()) {
                            q1.add(data);
                     }
                     else {
                            q2.add(data);
                     }
              }

              public static int pop() {

                     if(isEmpty()) {
                            System.out.println("Stack is Empty");
                            return -1;
                     }

                     int top = -1;

                     if(!q1.isEmpty()) {

                            while(q1.size() > 1) {
                                   q2.add(q1.remove());
                            }

                            top = q1.remove();
                     }
                     else {

                            while(q2.size() > 1) {
                                   q1.add(q2.remove());
                            }

                            top = q2.remove();
                     }

                     return top;
              }

              public static int peek() {

                     if(isEmpty()) {
                            System.out.println("Stack is Empty");
                            return -1;
                     }

                     int top = -1;

                     if(!q1.isEmpty()) {

                            while(!q1.isEmpty()) {

                                   top = q1.remove();

                                   q2.add(top);
                            }
                     }
                     else {

                            while(!q2.isEmpty()) {

                                   top = q2.remove();

                                   q1.add(top);
                            }
                     }

                     return top;
              }
       }

       public static void main(String args[]) {

              Stack s = new Stack();

              s.push(1);
              s.push(2);
              s.push(3);

              while(!s.isEmpty()) {
                     System.out.println(s.peek());
                     s.pop();
              }
       }
}



// ------------------------------------------------------------
// Queue | First Non-Repeating Character in a Stream
//
// TC: O(N)
// Reason: Each character is added and removed from the queue at most once.
//
// SC: O(N)
// Reason: Queue and frequency array store stream information.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       public static void printNonRepeating(String str) {

              int freq[] = new int[26];
              Queue<Character> q = new LinkedList<>();

              for(int i = 0; i < str.length(); i++) {

                     char ch = str.charAt(i);

                     q.add(ch);
                     freq[ch - 'a']++;

                     while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                            q.remove();
                     }

                     if(q.isEmpty()) {
                            System.out.print("-1 ");
                     }
                     else {
                            System.out.print(q.peek() + " ");
                     }
              }

              System.out.println();
       }

       public static void main(String args[]) {

              String str = "aabccxb";

              printNonRepeating(str);
       }
}


// ------------------------------------------------------------
// Queue | Interleave Two Halves of a Queue
//
// TC: O(N)
// Reason: Every element is moved a constant number of times.
//
// SC: O(N)
// Reason: Auxiliary queue stores half of the elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       public static void interLeave(Queue<Integer> q) {

              Queue<Integer> firstHalf = new LinkedList<>();

              int size = q.size();

              for(int i = 0; i < size / 2; i++) {
                     firstHalf.add(q.remove());
              }

              while(!firstHalf.isEmpty()) {

                     q.add(firstHalf.remove());
                     q.add(q.remove());
              }
       }

       public static void main(String args[]) {

              Queue<Integer> q = new LinkedList<>();

              for(int i = 1; i <= 10; i++) {
                     q.add(i);
              }

              interLeave(q);

              while(!q.isEmpty()) {
                     System.out.print(q.remove() + " ");
              }
       }
}


// ------------------------------------------------------------
// Queue | Reverse Queue using Stack
//
// TC: O(N)
// Reason: Every element is pushed and popped exactly once.
//
// SC: O(N)
// Reason: Stack stores all queue elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       public static void reverseQueue(Queue<Integer> q) {

              Stack<Integer> s = new Stack<>();

              while(!q.isEmpty()) {
                     s.push(q.remove());
              }

              while(!s.isEmpty()) {
                     q.add(s.pop());
              }
       }

       public static void main(String args[]) {

              Queue<Integer> q = new LinkedList<>();

              q.add(1);
              q.add(2);
              q.add(3);
              q.add(4);
              q.add(5);

              reverseQueue(q);

              while(!q.isEmpty()) {
                     System.out.print(q.remove() + " ");
              }
       }
}



// ------------------------------------------------------------
// Deque | Basic Operations using Java Collection Framework
//
// TC: O(1) each operation (addFirst, addLast, removeFirst,
// removeLast, getFirst, getLast)
//
// Reason: Deque supports insertion, deletion, and access from
// both ends in constant time.
//
// SC: O(N)
// Reason: Deque stores N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       public static void main(String args[]) {

              Deque<Integer> deque = new LinkedList<>();

              deque.addFirst(2);
              deque.addFirst(1);

              deque.addLast(3);
              deque.addLast(4);

              System.out.println(deque);

              System.out.println(deque.getFirst());
              System.out.println(deque.getLast());

              deque.removeFirst();
              deque.removeLast();

              System.out.println(deque);
       }
}


// ------------------------------------------------------------
// Deque | Implement Stack using Deque
//
// TC: O(1) each operation (push, pop, peek, isEmpty)
//
// Reason: All stack operations are performed at the front
// of the deque.
//
// SC: O(N)
// Reason: Deque stores N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       static class Stack {

              Deque<Integer> deque = new LinkedList<>();

              public void push(int data) {
                     deque.addFirst(data);
              }

              public int pop() {
                     return deque.removeFirst();
              }

              public int peek() {
                     return deque.getFirst();
              }

              public boolean isEmpty() {
                     return deque.isEmpty();
              }
       }

       public static void main(String args[]) {

              Stack s = new Stack();

              s.push(1);
              s.push(2);
              s.push(3);

              while(!s.isEmpty()) {
                     System.out.println(s.peek());
                     s.pop();
              }
       }
}


// ------------------------------------------------------------
// Deque | Implement Queue using Deque
//
// TC: O(1) each operation (add, remove, peek, isEmpty)
//
// Reason: Queue operations are performed from opposite ends
// of the deque.
//
// SC: O(N)
// Reason: Deque stores N elements.
// ------------------------------------------------------------

import java.util.*;

public class QueueB {

       static class Queue {

              Deque<Integer> deque = new LinkedList<>();

              public void add(int data) {
                     deque.addLast(data);
              }

              public int remove() {
                     return deque.removeFirst();
              }

              public int peek() {
                     return deque.getFirst();
              }

              public boolean isEmpty() {
                     return deque.isEmpty();
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue();

              q.add(1);
              q.add(2);
              q.add(3);

              while(!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}

 */
