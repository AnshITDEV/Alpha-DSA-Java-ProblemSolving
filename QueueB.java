/* 
Queue using Array (Static Array Implementation)

TC:O(1)for add(),peek(),isEmpty()
TC:O(n)for remove()

SC:O(n)


public class QueueB {

       static class Queue {
              static int arr[];;
              static int rear;
              static int size;

              Queue (int n) {
                     arr = new int[n];
                     size = n;
                     rear = -1;
              }

              public static boolean isEmpty() {
                     return rear == -1;
              }

              public static void add (int data) {
                     
                     if(rear == size-1) {
                            System.out.println("Queue is full");
                            return;
                     }

                     rear++;
                     arr[rear] = data;
              }

              public static int remove () {
                     if(isEmpty()) {
                            System.out.println("Empty nothing to remove");
                            return -1;
                     }

                     int front = arr[0];

                     for (int i=0; i<rear; i++) {
                            arr[i] = arr[i+1];
                     }
                     rear--;
              
                     return front;
              }

              public static int peek() {
                     if (isEmpty()) {
                            System.out.println("Queue is empty");
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

              while (!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}

*/


/* 
Circular Queue using Array (Optimized Queue Implementation)

TC:O(1) for add(),remove(),peek()
SC:O(n)

public class QueueB {

       static class Queue {

              static int size;
              static int front;
              static int rear;
              static int arr[];

              Queue (int n) {
                     arr = new int[n];
                     size = n;
                     front = -1;
                     rear = -1;
              }

              public static boolean isEmpty() {
                     return front == -1 && rear == -1;
              }

              public static boolean isFull() {
                     return (rear+1)%size == front;
              }

              public static void add (int data) {
                     if (isFull()) {
                            System.out.println("full");
                            return;
                     }

                     if (front == -1) {
                            front = 0;
                     }

                     rear = (rear+1)%size;
                     arr[rear] = data;
              }

              public static int remove () {
                     
                     if(isEmpty()) {
                            System.out.println("empty");
                            return -1;
                     }

                     int result = arr[front];

                     if (rear == front) {
                            rear = front = -1;
                     } else {
                            front = (front+1)%size;
                     }

                     return result;
              }

              public static int peek () {

                     if (isEmpty()) {
                            System.out.println("Queue is Empty");
                            return -1;
                     }

                     return arr[front];
              }
       }

       

       public static void main (String args[]) {

              Queue q = new Queue(3);

              q.add(1);
              q.add(2);
              q.add(3);

              System.out.println(q.remove());

              q.add(4);

              while (!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}


*/


/*

Queue using Linked List

TC: O(1) for add(), remove(), peek()
SC: O(n)

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

                     if (head == null) {
                            head = tail = newNode;
                            return;
                     }

                     tail.next = newNode;
                     tail = newNode;
              }

              public static int remove() {

                     if (isEmpty()) {
                            System.out.println("Empty Queue");
                            return -1;
                     }

                     int front = head.data;

                     // single node case
                     if (head == tail) {
                            head = tail = null;
                     } else {
                            head = head.next;
                     }

                     return front;
              }

              public static int peek() {

                     if (isEmpty()) {
                            System.out.println("Empty Queue");
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

              while (!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}

*/

/*

Queue using Java Collections Framework (JCF)

TC: O(1) for add(), remove(), peek()
SC: O(n)

       import java.util.*;

       public class QueueB {

       public static void main(String args[]) {

              Queue<Integer> q = new LinkedList<>();
              // Queue<Integer> q = new ArrayDeque<>();

              q.add(1);
              q.add(2);
              q.add(3);

              while (!q.isEmpty()) {
              System.out.println(q.peek());
              q.remove();
              }
       }
       }


 */


/* 
Queue using 2 Stacks (Costly Add Approach)

TC: O(n) add()
TC: O(1) remove(), peek()

SC: O(n)


import java.util.*;

public class QueueB {

       static class Queue {

              static Stack<Integer> s1 = new Stack<>();
              static Stack<Integer> s2 = new Stack<>();

              public static boolean isEmpty() {
                     return s1.isEmpty();
              }

              public static void add (int data) {

                     while (!s1.isEmpty()) {
                            s2.push(s1.pop());
                     }

                     s1.push(data);

                     while (!s2.isEmpty()) {
                            s1.push(s2.pop());
                     }
              }

              public static int remove () {

                     if (s1.isEmpty()) {
                            System.out.println("Empty queue");
                            return -1;
                     }

                     return s1.pop();
              }

              public static int peek () {

                     if (s1.isEmpty()) {
                            System.out.println("Empty queue");
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

              while (!q.isEmpty()) {
                     System.out.println(q.peek());
                     q.remove();
              }
       }
}

*/


/*

Stack using 2 Queues (Costly Pop Approach)

TC: O(1) push()
TC: O(n) pop(), peek()

SC: O(n)




import java.util.*;

public class QueueB {

       static class Stack {

              static Queue<Integer> q1 = new LinkedList<>();
              static Queue<Integer> q2 = new LinkedList<>();

              public static boolean isEmpty() {
                     return q1.isEmpty() && q2.isEmpty();
              }

              public static void push(int data) {

                     if (!q1.isEmpty()) {
                            q1.add(data);
                     }
                     else if (!q2.isEmpty()) {
                            q2.add(data);
                     } else {
                            q1.add(data);
                     }
              }

              public static int pop () {

                     if (isEmpty()) {
                            System.out.println("Empty");
                            return -1;
                     }

                     int top = -1;

                     if (!q1.isEmpty()) {
                            while(!q1.isEmpty()) {
                                   top = q1.remove();
                                   if (q1.isEmpty()) {
                                          break;
                                   }
                                   q2.add(top);
                            }
                     } else {
                            while (!q2.isEmpty()) {
                                   top = q2.remove();
                                   if (q2.isEmpty()) {
                                          break;
                                   }
                                   q1.add(top);
                            }
                     }
                     return top;
              }

              public static int peek() {

                     if (isEmpty()) {
                            System.out.println("Empty");
                            return -1;
                     }

                     int top = -1;

                     if (!q1.isEmpty()) {
                            while(!q1.isEmpty()) {
                                   top = q1.remove();
                                   q2.add(top);
                                   if (q1.isEmpty()) {
                                          break;
                                   }
                            }
                     } else {
                            while (!q2.isEmpty()) {
                                   top = q2.remove();
                                   q1.add(top);
                                   if (q2.isEmpty()) {
                                          break;
                                   }
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

              while (!s.isEmpty()) {
                     System.out.println(s.peek());
                     s.pop();
              }
       }
}


 */


/* 
First Non-Repeating Character in a Stream using Queue

TC: O(N) – each character enters and leaves queue at most once.
SC: O(N) – queue + frequency array.



import java.util.*;

public class QueueB {

       public static void printNonRepeating(String str) {

              int freq[] = new int[26];
              Queue<Character> q = new java.util.LinkedList<>();

              for (int i=0; i<str.length(); i++) {

                     char ch = str.charAt(i);

                     q.add(ch);
                     freq[ch-'a']++;

                     while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                            q.remove();
                     }

                     if (q.isEmpty()) {
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

*/

/* 
Question: Interleave 2 Halves of a Queue (Even Length)

TC: O(N)
Reason: Every element is processed a constant number of times.

SC: O(N/2) ≈ O(N)
Reason: Extra queue stores half of the elements.



import java.util.*;

public class QueueB {

       public static void interLeave(Queue<Integer> q) {

              Queue<Integer> firstHalf = new java.util.LinkedList<Integer>();
              int size = q.size();

              for(int i=0; i<size/2; i++) {
                     firstHalf.add(q.remove());
              }

              while(!firstHalf.isEmpty()) {
                     q.add(firstHalf.remove());
                     q.add(q.remove());
              }
       }

       public static void main(String args[]) {

              Queue<Integer> q = new java.util.LinkedList<Integer>();

              q.add(1);
              q.add(2);
              q.add(3);
              q.add(4);
              q.add(5);
              q.add(6);
              q.add(7);
              q.add(8);
              q.add(9);
              q.add(10);

              interLeave(q);

              while (!q.isEmpty()) {
                     System.out.print(q.remove() + " ");
              }
       }
}

*/

/*
Queue Reversal using Stack (Java)

TC: O(N)
Reason: Every element is pushed once and popped once.

SC: O(N)
Reason: Extra stack stores all N elements.




import java.util.*;

public class QueueB {

       public static void reverse(Queue<Integer> q) {

              Stack<Integer> s = new Stack<>();

              while (!q.isEmpty()) {
                     s.push(q.remove());
              }

              while (!s.isEmpty()) {
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

              reverse(q);

              while (!q.isEmpty()) {
                     System.out.print(q.remove() + " ");
              }
       }
}

 */


/* 
Deque (Double Ended Queue) in Java

TC: O(1)
SC: O(1)
all operations

import java.util.*;

public class QueueB {

       public static void main(String args[]) {

              Deque<Integer> d = new java.util.LinkedList<Integer>();

              d.addFirst(1);
              d.addFirst(2);

              System.out.println(d);

              d.removeLast();
              System.out.println(d);

              System.out.println(d.getFirst());
       }
}

*/

/*
Implement Stack using Deque

TC: O(1)
SC: O(n)
all three push pop peek

 


import java.util.*;

public class QueueB {

       static class stack {

              Deque<Integer> d = new java.util.LinkedList<Integer>();

              public void push(int data) {
                     d.addLast(data);
              }

              public int pop() {
                     return d.removeLast();
              }

              public int peek() {
                     return d.peekLast();
              }
       }

       public static void main(String args[]) {

              stack s = new stack();

              s.push(1);
              s.push(2);
              s.push(3);

              System.out.println("peek = " + s.peek());

              System.out.println(s.pop());
              System.out.println(s.pop());
              System.out.println(s.pop());
       }
}


*/


/*
Implement Queue using Deque

TC: O(1)
SC: O(N)



import java.util.*;

public class QueueB {

       static class Queue {

              Deque<Integer> deque = new LinkedList<>();

              // add
              public void add(int data) {
                     deque.addLast(data);
              }

              // remove
              public int remove() {
                     return deque.removeFirst();
              }

              // peek
              public int peek() {
                     return deque.getFirst();
              }
       }

       public static void main(String args[]) {

              Queue q = new Queue();

              q.add(1);
              q.add(2);
              q.add(3);

              System.out.println("peek = " + q.peek());

              System.out.println(q.remove());
              System.out.println(q.remove());
              System.out.println(q.remove());
       }
}

 */