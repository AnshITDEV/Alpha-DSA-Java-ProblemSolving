/* 

Stack | Implementation using ArrayList
TC: O(1) each operation push pop peek isEmpty
SC: O(N)

import java.util.ArrayList;

public class StackB {     
       
       static class Stack {

              static ArrayList <Integer> list = new ArrayList<>();

              public static boolean isEmpty() {
                     return list.size() == 0;
              }

              public static void push (int data) {
                     list.add(data);
              }

              public static int pop () {

                     if(isEmpty()) {
                            return -1;
                     }

                     int top = list.get(list.size()-1);
                     list.remove(list.size()-1);

                     return top;
              }      

              public static int peek () {

                     if (isEmpty()) {
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

              while (!s.isEmpty()) {
                     System.out.println(s.peek());
                     s.pop();
              }
       }
}

*/


/*  
Stack | Implementation using Linked List
TC: O(1) each operation push, pop, peek, isEmpty
SC: O(N)

public class StackB {

       static class Node {
              int data;
              Node next;
              

              Node (int data) {
                     this.data = data;
                     this.next = null;
              }
       }


       static class Stack {

              static Node head = null;

              public static boolean isEmpty() {
                     return head == null;
              }

              public static void push (int data) {

                     Node newNode = new Node(data);

                     if (isEmpty()) {
                            head = newNode;
                            return;
                     }

                     newNode.next = head;
                     head = newNode;
              }

              public static int pop () { 
                     
                     if(isEmpty()) {
                            return -1;
                     }

                     int top = head.data;
                     head = head.next;

                     return top;
              }

              public static int peek () {

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

              while (!s.isEmpty()) {
                     System.out.println(s.peek());
                     s.pop();
              }
       }
       

}

*/


/* 
Stack | JCF Stack
TC: O(1) each operation push, pop, peek, isEmpty
SC: O(N)

import java.util.*;

public class StackB {

       public static void main(String args[]) {

              Stack <Integer> s = new Stack <>();

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
Stack | Push at Bottom using Recursion
TC: O(N)
SC: O(N)

import java.util.*;

public class StackB {

       public static void pushAtBottom (Stack<Integer> s, int data) {

              if (s.isEmpty()) {
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

              while (!s.isEmpty()) {
                     System.out.println(s.pop());
              }
       }
}

*/


/*
Stack | Reverse String
TC: O(N)
SC: O(N)


import java.util.*;

public class StackB {

       // Reverse a String using Stack
       public static String reverseString (String str) {

              Stack<Character> s = new Stack<>();

              int idx = 0;

              while (idx < str.length()) {
                     s.push(str.charAt(idx));
                     idx++;
              }

              StringBuilder result = new StringBuilder("");

              while (!s.isEmpty()) {
                     char curr = s.pop();
                     result.append(curr);
              }

              return result.toString();
       }

       

       // Main Function
       public static void main(String args[]) {

              String str = "HelloWorld";

              String result = reverseString(str);

              System.out.println(result);
       }
}

*/


/* 
Stack | Recursion | Reverse Stack
TC: O(N²)
SC: O(N)



import java.util.*;

public class StackB {

       // Push element at the bottom of stack
       public static void pushAtBottom(Stack<Integer> s, int data) {

              if (s.isEmpty()) {
                     s.push(data);
                     return;
              }

              int top = s.pop();

              pushAtBottom(s, data);

              s.push(top);
       }

       // Reverse the stack using recursion
       public static void reverseStack (Stack<Integer> s) {

              if(s.isEmpty()) {
                     return;
              }

              int top = s.pop();
              reverseStack(s);

              pushAtBottom(s, top);
       }
       

       // Print stack
       public static void printStack(Stack<Integer> s) {

              while (!s.isEmpty()) {
                     System.out.println(s.pop());
              }
       }

       // Main function
       public static void main(String args[]) {

              Stack<Integer> s = new Stack<>();

              s.push(1);
              s.push(2);
              s.push(3);
              printStack(s);

              s.push(1);
              s.push(2);
              s.push(3);

              reverseStack(s);
              printStack(s);

       }
}

*/

/* 
Stock Span Problem
TC: O(N)
SC: O(N)

import java.util.*;

public class StackB {

       // Calculate stock span for each day
       public static void stockSpan (int stocks[], int span[]) {

              Stack<Integer> s = new Stack<>();

              span[0] = 1;
              s.push(0);

              for(int i=1; i<stocks.length; i++) {

                     int currPrice = stocks[i];

                     while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                            s.pop();
                     }

                     if (s.isEmpty()) {
                            span[i] = i+1;
                     } else {
                            int prevHigh = s.peek();
                            span[i] = i - prevHigh;
                     }
                     s.push(i);
              }
       }
       

       // Main function
       public static void main(String args[]) {

              int stocks[] = {100, 80, 60, 70, 60, 85, 100};
              int span[] = new int[stocks.length];

              stockSpan(stocks, span);

              for (int i=0; i<span.length; i++) {
                     System.out.print(span[i]+" ");
              }
       }
}

*/

/*
Next Greater Element

TC: O(N)
SC: O(N)

import java.util.*;

public class StackB {

       // Find Next Greater Element
       public static void nextGreater (int arr[]) {

              Stack<Integer> s = new Stack<>();
              int nextGreater[] = new int[arr.length];

              for(int i=arr.length-1; i>=0; i--) {

                     while (!s.isEmpty() && s.peek() <= arr[i]) {
                            s.pop();
                     }

                     if(s.isEmpty()) {
                            nextGreater[i] = -1;
                     } else {
                            nextGreater[i] = s.peek();
                     }

                     s.push(arr[i]);
              }

              for (int i=0; i < nextGreater.length; i++) {
                     System.out.print(nextGreater[i]+" ");
              }
       }
       

       // Main function
       public static void main(String args[]) {

              int arr[] = { 6, 8, 0, 1, 3 };

              nextGreater(arr);
       }
}

 */


/* 

Valid Parentheses
TC: O(N)
SC: O(N)

import java.util.*;

public class StackB {

       //isValid method
       public static boolean isValid(String str) {

              Stack<Character> s = new Stack<>();
              

              for (int i=0; i<str.length(); i++) {
                     
                     char ch = str.charAt(i);

                     if (ch == '(' || ch == '{' || ch == '[' ) {
                            s.push(ch);
                     } 
                     else {

                            if(s.isEmpty()) {
                                   return false;
                            }
                            
                            if (   (s.peek() == '(' && ch == ')') ||
                                   (s.peek() == '{' && ch == '}') ||
                                   (s.peek() == '[' && ch == ']')) {
                                   s.pop();
                            } else {
                                   return false;
                            }
                     }      
              }
              if(s.isEmpty()) {
                     return true;
              } else {
                     return false;
              }
       }
       

       //main method
       public static void main(String args[]) {

              String str = "({})[]";

              System.out.println(isValid(str));
       }
}

*/

/* 

Duplicate Parentheses
TC: O(N)
SC: O(N)

import java.util.*;

public class StackB {

       public static boolean isDuplicate (String str) {

              Stack<Character> s = new Stack<>();

              for (int i=0; i<str.length(); i++) {

                     char ch = str.charAt(i);

                     if (ch == ')') {
                            int count = 0;

                            while (s.pop() != '(') {
                                   count++;
                            }

                            if (count < 1) { 
                                   return true;
                            }

                     } else {
                            s.push(ch);
                     }
              }
              return false;
       }

       public static void main(String args[]) {

              String str1 = "((a+b))"; // true
              String str2 = "(a-b)"; // false

              System.out.println(isDuplicate(str1));
              System.out.println(isDuplicate(str2));
       }
}

*/


/*  
Max Area in Histogram using Stack (NSL + NSR)
TC: O(N)
SC: O(N)


import java.util.*;

public class StackB {

       public static void maxArea(int arr[]) {

              int maxArea = 0;
              int nsr[] = new int[arr.length];
              int nsl[] = new int[arr.length];

              Stack<Integer> s = new Stack<>();

              //next smaller right
              for (int i=arr.length-1; i>=0; i--) {

                     while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                            s.pop();
                     }

                     if (s.isEmpty()) {
                            nsr[i] = arr.length;
                     } else {
                            nsr[i] = s.peek();
                     }

                     s.push(i);
              }

              s = new Stack<>();

              // next smaller left
              for (int i=0 ; i < arr.length; i++) {

                     while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                            s.pop();
                     }

                     if (s.isEmpty()) {
                            nsl[i] = -1;
                     } else {
                            nsl[i] = s.peek();
                     }

                     s.push(i);
              }

              //area
              for (int i=0; i < arr.length; i++) {

                     int height = arr[i];
                     int width = nsr[i]-nsl[i]-1; //j-i-1

                     int area = height*width;

                     maxArea = Math.max(maxArea, area);
              }

              System.out.println(maxArea);

       }

       public static void main(String args[]) {

              int arr[] = { 2, 1, 5, 6, 2, 3 };

              maxArea(arr);
       }
}

*/











