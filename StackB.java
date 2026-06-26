/*

# Stack - Index

| Sr. No. | Program                                     |     Time Complexity     | Space Complexity |
| :-----: | ------------------------------------------- | :---------------------: | :--------------: |
|    1    | Stack Implementation using ArrayList        | **O(1)** each operation |     **O(N)**     |
|    2    | Stack Implementation using Linked List      | **O(1)** each operation |     **O(N)**     |
|    3    | Stack using Java Collection Framework (JCF) | **O(1)** each operation |     **O(N)**     |
|    4    | Push at Bottom using Recursion              |         **O(N)**        |     **O(N)**     |
|    5    | Reverse String using Stack                  |         **O(N)**        |     **O(N)**     |
|    6    | Reverse Stack using Recursion               |        **O(N²)**        |     **O(N)**     |
|    7    | Stock Span Problem                          |         **O(N)**        |     **O(N)**     |
|    8    | Next Greater Element                        |         **O(N)**        |     **O(N)**     |
|    9    | Valid Parentheses                           |         **O(N)**        |     **O(N)**     |
|    10   | Duplicate Parentheses                       |         **O(N)**        |     **O(N)**     |
|    11   | Maximum Area in Histogram (NSL + NSR)       |         **O(N)**        |     **O(N)**     |

---

# Complexity Summary

| Complexity     | Programs                                                                                                                                                                                                                                                                                                                                        |
| -------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**       | Stack Implementation using ArrayList (push, pop, peek, isEmpty), Stack Implementation using Linked List (push, pop, peek, isEmpty), Stack using Java Collection Framework (JCF) (push, pop, peek, isEmpty)                                                                                                                                      |
| **O(N)**       | Push at Bottom using Recursion, Reverse String using Stack, Stock Span Problem, Next Greater Element, Valid Parentheses, Duplicate Parentheses, Maximum Area in Histogram (NSL + NSR)                                                                                                                                                           |
| **O(N²)**      | Reverse Stack using Recursion                                                                                                                                                                                                                                                                                                                   |
| **O(N) Space** | Stack Implementation using ArrayList, Stack Implementation using Linked List, Stack using Java Collection Framework (JCF), Push at Bottom using Recursion, Reverse String using Stack, Reverse Stack using Recursion, Stock Span Problem, Next Greater Element, Valid Parentheses, Duplicate Parentheses, Maximum Area in Histogram (NSL + NSR) |




// ------------------------------------------------------------
// Stack | Implementation using ArrayList
//
// TC: O(1) each operation (push, pop, peek, isEmpty)
// Reason: ArrayList performs end insertion, deletion and access in constant time.
//
// SC: O(N)
// Reason: Stores N elements in the ArrayList.
// ------------------------------------------------------------

import java.util.ArrayList;

public class StackB {

       static class Stack {

              static ArrayList<Integer> list = new ArrayList<>();

              public static boolean isEmpty() {
                     return list.size() == 0;
              }

              public static void push(int data) {
                     list.add(data);
              }

              public static int pop() {

                     if(isEmpty()) {
                            return -1;
                     }

                     int top = list.get(list.size() - 1);
                     list.remove(list.size() - 1);

                     return top;
              }

              public static int peek() {

                     if(isEmpty()) {
                            return -1;
                     }

                     return list.get(list.size() - 1);
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
// Stack | Implementation using Linked List
//
// TC: O(1) each operation (push, pop, peek, isEmpty)
// Reason: All operations are performed at the head of the linked list.
//
// SC: O(N)
// Reason: Stores N nodes in the linked list.
// ------------------------------------------------------------

public class StackB {

       static class Node {

              int data;
              Node next;

              Node(int data) {
                     this.data = data;
                     this.next = null;
              }
       }

       static class Stack {

              static Node head = null;

              public static boolean isEmpty() {
                     return head == null;
              }

              public static void push(int data) {

                     Node newNode = new Node(data);

                     if(isEmpty()) {
                            head = newNode;
                            return;
                     }

                     newNode.next = head;
                     head = newNode;
              }

              public static int pop() {

                     if(isEmpty()) {
                            return -1;
                     }

                     int top = head.data;
                     head = head.next;

                     return top;
              }

              public static int peek() {

                     if(isEmpty()) {
                            return -1;
                     }

                     return head.data;
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
// Stack | Java Collection Framework (JCF)
//
// TC: O(1) each operation (push, pop, peek, isEmpty)
// Reason: Java Stack provides constant-time stack operations.
//
// SC: O(N)
// Reason: Stack stores N elements.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void main(String args[]) {

              Stack<Integer> s = new Stack<>();

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
// Stack | Push at Bottom using Recursion
//
// TC: O(N)
// Reason: Removes and restores all stack elements once.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void pushAtBottom(Stack<Integer> s, int data) {

              if(s.isEmpty()) {
                     s.push(data);
                     return;
              }

              int top = s.pop();

              pushAtBottom(s, data);

              s.push(top);
       }

       public static void main(String args[]) {

              Stack<Integer> s = new Stack<>();

              s.push(1);
              s.push(2);
              s.push(3);

              pushAtBottom(s, 4);

              while(!s.isEmpty()) {
                     System.out.println(s.pop());
              }
       }
}


// ------------------------------------------------------------
// Stack | Reverse String
//
// TC: O(N)
// Reason: Each character is pushed and popped exactly once.
//
// SC: O(N)
// Reason: Stack stores all characters of the string.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static String reverseString(String str) {

              Stack<Character> s = new Stack<>();

              for(int i = 0; i < str.length(); i++) {
                     s.push(str.charAt(i));
              }

              StringBuilder result = new StringBuilder();

              while(!s.isEmpty()) {
                     result.append(s.pop());
              }

              return result.toString();
       }

       public static void main(String args[]) {

              String str = "HelloWorld";

              System.out.println(reverseString(str));
       }
}


// ------------------------------------------------------------
// Stack | Reverse Stack using Recursion
//
// TC: O(N²)
// Reason: For every element, pushAtBottom() takes O(N) time.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void pushAtBottom(Stack<Integer> s, int data) {

              if(s.isEmpty()) {
                     s.push(data);
                     return;
              }

              int top = s.pop();

              pushAtBottom(s, data);

              s.push(top);
       }

       public static void reverseStack(Stack<Integer> s) {

              if(s.isEmpty()) {
                     return;
              }

              int top = s.pop();

              reverseStack(s);

              pushAtBottom(s, top);
       }

       public static void printStack(Stack<Integer> s) {

              while(!s.isEmpty()) {
                     System.out.println(s.pop());
              }
       }

       public static void main(String args[]) {

              Stack<Integer> s = new Stack<>();

              s.push(1);
              s.push(2);
              s.push(3);

              System.out.println("Original Stack:");
              printStack(s);

              s.push(1);
              s.push(2);
              s.push(3);

              reverseStack(s);

              System.out.println("Reversed Stack:");
              printStack(s);
       }
}


// ------------------------------------------------------------
// Stack | Stock Span Problem
//
// TC: O(N)
// Reason: Each index is pushed and popped from the stack at most once.
//
// SC: O(N)
// Reason: Stack and span array together store N elements.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void stockSpan(int stocks[], int span[]) {

              Stack<Integer> s = new Stack<>();

              span[0] = 1;
              s.push(0);

              for(int i = 1; i < stocks.length; i++) {

                     int currPrice = stocks[i];

                     while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                            s.pop();
                     }

                     if(s.isEmpty()) {
                            span[i] = i + 1;
                     }
                     else {
                            int prevHigh = s.peek();
                            span[i] = i - prevHigh;
                     }

                     s.push(i);
              }
       }

       public static void main(String args[]) {

              int stocks[] = {100, 80, 60, 70, 60, 85, 100};
              int span[] = new int[stocks.length];

              stockSpan(stocks, span);

              for(int i = 0; i < span.length; i++) {
                     System.out.print(span[i] + " ");
              }
       }
}


// ------------------------------------------------------------
// Stack | Next Greater Element
//
// TC: O(N)
// Reason: Every element is pushed and popped from the stack at most once.
//
// SC: O(N)
// Reason: Stack and answer array store N elements.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void nextGreater(int arr[]) {

              Stack<Integer> s = new Stack<>();
              int nextGreater[] = new int[arr.length];

              for(int i = arr.length - 1; i >= 0; i--) {

                     while(!s.isEmpty() && s.peek() <= arr[i]) {
                            s.pop();
                     }

                     if(s.isEmpty()) {
                            nextGreater[i] = -1;
                     }
                     else {
                            nextGreater[i] = s.peek();
                     }

                     s.push(arr[i]);
              }

              for(int i = 0; i < nextGreater.length; i++) {
                     System.out.print(nextGreater[i] + " ");
              }
       }

       public static void main(String args[]) {

              int arr[] = {6, 8, 0, 1, 3};

              nextGreater(arr);
       }
}


// ------------------------------------------------------------
// Stack | Valid Parentheses
//
// TC: O(N)
// Reason: Every character is processed exactly once.
//
// SC: O(N)
// Reason: Stack stores opening brackets.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static boolean isValid(String str) {

              Stack<Character> s = new Stack<>();

              for(int i = 0; i < str.length(); i++) {

                     char ch = str.charAt(i);

                     if(ch == '(' || ch == '{' || ch == '[') {

                            s.push(ch);
                     }
                     else {

                            if(s.isEmpty()) {
                                   return false;
                            }

                            if((s.peek() == '(' && ch == ')') ||
                               (s.peek() == '{' && ch == '}') ||
                               (s.peek() == '[' && ch == ']')) {

                                   s.pop();
                            }
                            else {
                                   return false;
                            }
                     }
              }

              return s.isEmpty();
       }

       public static void main(String args[]) {

              String str = "({})[]";

              System.out.println(isValid(str));
       }
}


// ------------------------------------------------------------
// Stack | Duplicate Parentheses
//
// TC: O(N)
// Reason: Every character is pushed and popped at most once.
//
// SC: O(N)
// Reason: Stack stores the expression characters.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static boolean isDuplicate(String str) {

              Stack<Character> s = new Stack<>();

              for(int i = 0; i < str.length(); i++) {

                     char ch = str.charAt(i);

                     if(ch == ')') {

                            int count = 0;

                            while(s.pop() != '(') {
                                   count++;
                            }

                            if(count < 1) {
                                   return true;
                            }
                     }
                     else {

                            s.push(ch);
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              String str1 = "((a+b))";
              String str2 = "(a-b)";

              System.out.println(isDuplicate(str1));
              System.out.println(isDuplicate(str2));
       }
}


// ------------------------------------------------------------
// Stack | Maximum Area in Histogram (NSL + NSR)
//
// TC: O(N)
// Reason: Every index is pushed and popped from the stack at most once.
//
// SC: O(N)
// Reason: Uses stack, NSL array, and NSR array of size N.
// ------------------------------------------------------------

import java.util.Stack;

public class StackB {

       public static void maxArea(int arr[]) {

              int maxArea = 0;

              int nsr[] = new int[arr.length];
              int nsl[] = new int[arr.length];

              Stack<Integer> s = new Stack<>();

              // Next Smaller Right (NSR)
              for(int i = arr.length - 1; i >= 0; i--) {

                     while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                            s.pop();
                     }

                     if(s.isEmpty()) {
                            nsr[i] = arr.length;
                     }
                     else {
                            nsr[i] = s.peek();
                     }

                     s.push(i);
              }

              s = new Stack<>();

              // Next Smaller Left (NSL)
              for(int i = 0; i < arr.length; i++) {

                     while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                            s.pop();
                     }

                     if(s.isEmpty()) {
                            nsl[i] = -1;
                     }
                     else {
                            nsl[i] = s.peek();
                     }

                     s.push(i);
              }

              // Calculate Maximum Area
              for(int i = 0; i < arr.length; i++) {

                     int height = arr[i];
                     int width = nsr[i] - nsl[i] - 1;

                     int area = height * width;

                     maxArea = Math.max(maxArea, area);
              }

              System.out.println("Maximum Area = " + maxArea);
       }

       public static void main(String args[]) {

              int arr[] = {2, 1, 5, 6, 2, 3};

              maxArea(arr);
       }
}

 */




