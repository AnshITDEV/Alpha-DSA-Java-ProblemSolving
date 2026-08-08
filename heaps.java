/*

import java.util.Comparator;
import java.util.PriorityQueue;

public class heaps {

       public static void main(String args[]) {

              PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

              pq.add(3);
              pq.add(5);
              pq.add(1);              
              pq.add(8);

              while(!pq.isEmpty()) {
                     System.out.println(pq.peek());
                     pq.remove();
              }
       }
       
}






2

import java.util.Comparator;
import java.util.PriorityQueue;

public class heaps {

       static class Student implements Comparable<Student>{
              String name;
              int rank;

              public Student(String name, int rank) {
                     this.rank = rank;
                     this.name = name;
              }

              @Override
              public int compareTo(Student s2){
                     return this.rank-s2.rank;
              }
       }

       public static void main(String args[]) {

              PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

              pq.add(new Student("A",3));
              pq.add(new Student("B",5));
              pq.add(new Student("R", 1));
              pq.add(new Student("E", 10));

              while (!pq.isEmpty()) {
                     System.out.println(pq.peek().name+" -> "+pq.peek().rank);
                     pq.remove();
              }
       }
}






insert into heaps Minheap

import java.util.ArrayList;

public class heaps {

       static ArrayList<Integer> a = new ArrayList<>();

       public static void insert(int n) {

              a.add(n);
              
              int child = a.size()-1;
              

              while(child > 0) {

                     int parent = (child - 1) / 2;

                     if(a.get(child) < a.get(parent)) {

                            int temp = a.get(child);
                            a.set(child, a.get(parent));
                            a.set(parent, temp);

                            child = parent;

                     } else {
                            break;
                     }
              }
       }


       public void printHeap() {
              System.out.println(a);
       }

       public static void main(String args[]) {

              heaps h = new heaps();

              h.insert(2);
              h.insert(3);
              h.insert(4);
              h.insert(5);
              h.insert(10);
              h.insert(9);
              h.insert(1);

              h.printHeap();
       }
}




get minimum in the heap
 


import java.util.ArrayList;

public class heaps {

       static ArrayList<Integer> a = new ArrayList<>();

       public static void insert(int n) {

              a.add(n);

              int child = a.size() - 1;

              while (child > 0) {

                     int parent = (child - 1) / 2;

                     if (a.get(child) < a.get(parent)) {

                            int temp = a.get(child);
                            a.set(child, a.get(parent));
                            a.set(parent, temp);

                            child = parent;

                     } else {
                            break;
                     }
              }
       }

       public void printHeap() {
              System.out.println(a);
       }

       public static int peek() {
              return a.get(0);
       }

       public static void main(String args[]) {

              heaps h = new heaps();

              h.insert(2);
              h.insert(3);
              h.insert(4);
              h.insert(5);
              h.insert(10);
              h.insert(9);
              h.insert(1);

              h.printHeap();

              System.out.println(h.peek());
       }
}






minHeap - delete and heapify 


import java.util.ArrayList;

public class heaps {

       static ArrayList<Integer> a = new ArrayList<>();

       public static void insert(int n) {

              a.add(n);

              int child = a.size() - 1;

              while (child > 0) {

                     int parent = (child - 1) / 2;

                     if (a.get(child) < a.get(parent)) {

                            int temp = a.get(child);
                            a.set(child, a.get(parent));
                            a.set(parent, temp);

                            child = parent;

                     } else {
                            break;
                     }
              }
       }

       public void printHeap() {
              System.out.println(a);
       }

       public static int peek() {
              return a.get(0);
       }

       private static void heapify(int i) {

              int minIdx = i;

              int left = 2 * i + 1;
              int right = 2 * i + 2;

              if(left < a.size() && a.get(left) < a.get(minIdx)) {
                     minIdx = left;
              }

              if (right < a.size() && a.get(right) < a.get(minIdx)) {
                     minIdx = right;
              }

              if(minIdx != i) {
                     int temp = a.get(i);
                     a.set(i, a.get(minIdx));
                     a.set(minIdx, temp);

                     heapify(minIdx);
              }
       }

       public static int remove() {

              if(a.isEmpty()) {
                     throw new RuntimeException("heap is empty");
              }

              int data = a.get(0);

              int temp = a.get(0);
              a.set(0, a.get(a.size()-1));
              a.set(a.size()-1, temp);

              a.remove(a.size()-1);

              if(!a.isEmpty()) {
                     heapify(0);
              }

              return data;
       }

       public static void main(String args[]) {

              heaps h = new heaps();

              h.insert(2);
              h.insert(3);
              h.insert(4);
              h.insert(5);
              h.insert(10);
              h.insert(9);
              h.insert(1);

              h.printHeap();

              System.out.println(h.peek());

              System.out.println("Removed: " + remove());

              System.out.println("Heap after removal:");
              h.printHeap();
       }
}











maxHeap - delete and heapify


import java.util.ArrayList;

public class heaps {

       static ArrayList<Integer> a = new ArrayList<>();

       public static void insert(int n) {

              a.add(n);

              int child = a.size() - 1;

              while (child > 0) {

                     int parent = (child - 1) / 2;

                     if (a.get(child) > a.get(parent)) {

                            int temp = a.get(child);
                            a.set(child, a.get(parent));
                            a.set(parent, temp);

                            child = parent;

                     } else {
                            break;
                     }
              }
       }

       public void printHeap() {
              System.out.println(a);
       }

       public static int peek() {
              return a.get(0);
       }

       private static void heapify(int i) {

              int maxIdx = i;

              int left = 2 * i + 1;
              int right = 2 * i + 2;

              if (left < a.size() && a.get(left) > a.get(maxIdx)) {
                     maxIdx = left;
              }

              if (right < a.size() && a.get(right) > a.get(maxIdx)) {
                     maxIdx = right;
              }

              if (maxIdx != i) {
                     int temp = a.get(i);
                     a.set(i, a.get(maxIdx));
                     a.set(maxIdx, temp);

                     heapify(maxIdx);
              }
       }

       public static int remove() {

              if (a.isEmpty()) {
                     throw new RuntimeException("heap is empty");
              }

              int data = a.get(0);

              int temp = a.get(0);
              a.set(0, a.get(a.size() - 1));
              a.set(a.size() - 1, temp);

              a.remove(a.size() - 1);

              if (!a.isEmpty()) {
                     heapify(0);
              }

              return data;
       }

       public static void main(String args[]) {

              heaps h = new heaps();

              h.insert(2);
              h.insert(3);
              h.insert(4);
              h.insert(5);
              h.insert(10);
              h.insert(9);
              h.insert(1);

              h.printHeap();

              System.out.println(h.peek());

              System.out.println("Removed: " + remove());

              System.out.println("Heap after removal:");
              h.printHeap();
       }
}






Heap sort





public class heaps {

       // Heapify (Max Heap)
       public static void heapify(int arr[], int i, int size) {

              int maxIdx = i;

              int left = 2 * i + 1;
              int right = 2 * i + 2;

              // Compare with left child
              if (left < size && arr[left] > arr[maxIdx]) {
                     maxIdx = left;
              }

              // Compare with right child
              if (right < size && arr[right] > arr[maxIdx]) {
                     maxIdx = right;
              }

              // Swap and heapify again
              if (maxIdx != i) {

                     int temp = arr[i];
                     arr[i] = arr[maxIdx];
                     arr[maxIdx] = temp;

                     heapify(arr, maxIdx, size);
              }
       }

       // Heap Sort
       public static void heapSort(int arr[]) {

              int n = arr.length;

              for(int i = n/2 - 1; i >= 0; i--) {
                     heapify(arr, i, n);
              }

              for(int i = n-1; i>0; i--) {
                     int temp = arr[0];
                     arr[0] = arr[i];
                     arr[i] = temp;

                     heapify(arr, 0, i);
              }
       }
       

       // Print Array
       public static void printArray(int arr[]) {
              
              for(int num: arr) {
                     System.out.print(num+" ");
              }
              System.out.println();
       }

       public static void main(String[] args) {

              int arr[] = { 1, 2, 4, 5, 3 };

              System.out.print("Original Array: ");
              printArray(arr);

              heapSort(arr);

              System.out.print("Sorted Array: ");
              printArray(arr);
       }
}






Nearby Cars (K Closest Cars to Origin)





import java.util.PriorityQueue;

public class heaps {

       static class Point implements Comparable<Point> {

              int x; 
              int y;

              int d;
              int idx;

              Point(int x, int y, int d, int idx) {
                     this.x = x;
                     this.y = y;
                     this.d = d;
                     this.idx = idx;
              }

              @Override
              public int compareTo(Point p2) {
                     return this.d - p2.d;
              }
       }

       public static void main(String arg[]) {

              int points[][] = { {3,3}, {5,-1}, {-2,4}
              };

              int k = 2;
              PriorityQueue<Point> pq = new PriorityQueue<>();

              for(int i = 0; i < points.length; i++) {

                     int x = points[i][0];
                     int y = points[i][1];

                     int d = x * x + y * y;

                     pq.add(new Point(x, y, d, i));
              }

              //Print the K nearest cars
              System.out.println("Nearest "+k+" Cars:");

              for(int i=1; i<=k; i++) {
                     Point p = pq.remove();

                     System.out.println("C"+p.idx+" ("+p.x+", "+ p.y + ")" );
              }
       }
}




Connect N Ropes with Minimum Cost

import java.util.*;

public class heaps {

       public static void main(String args[]) {

              PriorityQueue<Integer> pq = new PriorityQueue<>();

              int arr[] = {2,3,3,4,6};

              for(int i=0; i<arr.length; i++) {
                     pq.add(arr[i]);
              }

              int cost = 0;

              for(int i=0; i<arr.length-1; i++) {
                     int a = pq.remove();
                     int b = pq.remove();

                     int c = a+b;

                     cost += c;

                     pq.add(c);

                     System.out.println(pq);
              }

              System.out.println("Minimum cost: "+cost);
       }
}





K Weakest Soldiers (K Weakest Rows in a Matrix)



import java.util.PriorityQueue;

public class heaps {

       static class Soldier implements Comparable<Soldier> {
              int count;
              int idx;
              
              Soldier(int count, int idx) {
                     this.count = count;
                     this.idx = idx;
              }

              @Override
              public int compareTo(Soldier s2) {
                     
                     //smaller count higher priority
                     if(this.count == s2.count) {
                            return this.idx - s2.idx;
                     }

                     return this.count - s2.count;
              }
       }

       public static void main(String args[]) {

              int matrix[][] = { {1, 0, 0, 0},
                            {1, 1, 1, 1},
                            {1, 0, 0, 0},
                            {1, 0, 0, 0}
              };
              
              int  k = 2;

              PriorityQueue<Soldier> pq = new PriorityQueue<>();

              for(int i=0; i<matrix.length; i++) {
                     int count = 0;

                     for(int j=0; j<matrix[0].length; j++) {
                            
                            if(matrix[i][j] == 1) {
                                   count++;
                            }
                     }
                     pq.add(new Soldier(count, i));
              }

              System.out.println("The "+k+" Weakest Rows are: ");

              //print k weakest rows

              for(int i=0; i<k; i++) {
                     Soldier s = pq.remove();
                     System.out.println("Row"+s.idx);
              }
       }
}







using deque sliding window maximum (Not practiced)


import java.util.*;

public class heaps {

       public static void main(String args[]) {

              int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
              int k = 3;

              int res[] = new int[arr.length - k + 1];

              Deque<Integer> dq = new ArrayDeque<>();

              for (int i = 0; i < arr.length; i++) {

                     // Remove elements outside the current window
                     while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                            dq.removeFirst();
                     }

                     // Remove smaller elements from the back
                     while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                            dq.removeLast();
                     }

                     // Add current index
                     dq.addLast(i);

                     // Store answer after first window
                     if (i >= k - 1) {
                            res[i - k + 1] = arr[dq.peekFirst()];
                     }
              }

              System.out.print("Sliding Window Maximum: ");

              for (int i = 0; i < res.length; i++) {
                     System.out.print(res[i] + " ");
              }
       }
}


*/






























