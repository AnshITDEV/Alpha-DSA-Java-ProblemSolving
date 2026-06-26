/*

## ArrayList - Index

| Sr. No. | Program                                       |  Time Complexity | Space Complexity |
| :-----: | --------------------------------------------- | :--------------: | :--------------: |
|    1    | ArrayList Creation & Add Elements             | **O(1)** Average |     **O(N)**     |
|    2    | Get Element                                   |     **O(1)**     |     **O(1)**     |
|    3    | Remove Element                                |     **O(N)**     |     **O(1)**     |
|    4    | Set Element                                   |     **O(1)**     |     **O(1)**     |
|    5    | Contains Element                              |     **O(N)**     |     **O(1)**     |
|    6    | Insert Element at Specific Index              |     **O(N)**     |     **O(1)**     |
|    7    | Size & Traversal                              |     **O(N)**     |     **O(1)**     |
|    8    | Reverse Traversal                             |     **O(N)**     |     **O(1)**     |
|    9    | Find Maximum Element                          |     **O(N)**     |     **O(1)**     |
|    10   | Find Maximum Element (Using Math.max)         |     **O(N)**     |     **O(1)**     |
|    11   | Swap Two Elements                             |     **O(1)**     |     **O(1)**     |
|    12   | Sorting (Collections.sort)                    |  **O(N log N)**  |     **O(1)**     |
|    13   | 2D ArrayList Traversal                        |   **O(R × C)**   |     **O(1)**     |
|    14   | Generate 2D ArrayList (Multiplication Tables) |   **O(R × C)**   |   **O(R × C)**   |
|    15   | Container With Most Water                     |     **O(N)**     |     **O(1)**     |
|    16   | Pair Sum in Sorted Array                      |     **O(N)**     |     **O(1)**     |
|    17   | Pair Sum in Rotated Sorted Array              |     **O(N)**     |     **O(1)**     |

---

## Complexity Summary

| Complexity         | Programs                                                                                                                                                                                                                                                                         |
| ------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**           | Get Element, Set Element, Swap Two Elements                                                                                                                                                                                                                                      |
| **O(1) Average**   | ArrayList Creation & Add Elements                                                                                                                                                                                                                                                |
| **O(N)**           | Remove Element, Contains Element, Insert Element at Specific Index, Size & Traversal, Reverse Traversal, Find Maximum Element, Find Maximum Element (Using Math.max), Container With Most Water, Pair Sum in Sorted Array, Pair Sum in Rotated Sorted Array                      |
| **O(N log N)**     | Sorting (Collections.sort)                                                                                                                                                                                                                                                       |
| **O(R × C)**       | 2D ArrayList Traversal, Generate 2D ArrayList                                                                                                                                                                                                                                    |
| **O(1) Space**     | Get Element, Remove Element, Set Element, Contains Element, Insert Element, Size & Traversal, Reverse Traversal, Find Maximum Element, Swap Two Elements, Sorting, 2D ArrayList Traversal, Container With Most Water, Pair Sum in Sorted Array, Pair Sum in Rotated Sorted Array |
| **O(N) Space**     | ArrayList Creation & Add Elements                                                                                                                                                                                                                                                |
| **O(R × C) Space** | Generate 2D ArrayList (Multiplication Tables)                                                                                                                                                                                                                                    |




// ------------------------------------------------------------
// ArrayList | Creation & Add Elements
//
// TC: O(1) (Average)
// Reason: add() inserts an element at the end in constant amortized time.
//
// SC: O(N)
// Reason: ArrayList stores N elements.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();
              ArrayList<Boolean> list2 = new ArrayList<>();
              ArrayList<String> list3 = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list);

              int element = list.get(2);

              System.out.println(element);
       }
}


// ------------------------------------------------------------
// ArrayList | Remove Element
//
// TC: O(N)
// Reason: Elements after the removed index are shifted left.
//
// SC: O(1)
// Reason: No extra data structure is used.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list);

              list.remove(4);

              System.out.println(list);
       }
}


// ------------------------------------------------------------
// ArrayList | Set Element & Contains
//
// TC: O(N)
// Reason: set() is O(1), contains() scans the list in the worst case.
//
// SC: O(1)
// Reason: No extra data structure is used.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list);

              list.set(2, 10);

              System.out.println(list);

              System.out.println(list.contains(2));

              System.out.println(list.contains(11));
       }
}


// ------------------------------------------------------------
// ArrayList | Insert Element at Specific Index
//
// TC: O(N)
// Reason: Elements after the insertion point are shifted right.
//
// SC: O(1)
// Reason: No extra data structure is used.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list);

              list.add(2, 9);

              System.out.println(list);
       }
}


// ------------------------------------------------------------
// ArrayList | Size & Traversal
//
// TC: O(N)
// Reason: Traverses every element once.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list.size());

              for(int i = 0; i < list.size(); i++) {

                     System.out.print(list.get(i) + " ");
              }

              System.out.println();
       }
}


// ------------------------------------------------------------
// ArrayList | Reverse Traversal
//
// TC: O(N)
// Reason: Visits each element exactly once.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              for(int i = list.size() - 1; i >= 0; i--) {

                     System.out.print(list.get(i) + " ");
              }
       }
}


// ------------------------------------------------------------
// ArrayList | Find Maximum Element
//
// TC: O(N)
// Reason: Traverses the entire ArrayList once.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(2);
              list.add(5);
              list.add(9);
              list.add(3);
              list.add(6);

              int max = Integer.MIN_VALUE;

              for(int i = 0; i < list.size(); i++) {

                     if(list.get(i) > max) {
                            max = list.get(i);
                     }
              }

              System.out.println("Maximum Element = " + max);
       }
}


// ------------------------------------------------------------
// ArrayList | Find Maximum Element (Using Math.max)
//
// TC: O(N)
// Reason: Traverses every element once.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(2);
              list.add(5);
              list.add(9);
              list.add(3);
              list.add(6);

              int max = Integer.MIN_VALUE;

              for(int i = 0; i < list.size(); i++) {

                     max = Math.max(max, list.get(i));
              }

              System.out.println("Maximum Element = " + max);
       }
}


// ------------------------------------------------------------
// ArrayList | Swap Two Elements
//
// TC: O(1)
// Reason: Swapping two elements requires constant operations.
//
// SC: O(1)
// Reason: Uses only one temporary variable.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

              int temp = list.get(idx1);

              list.set(idx1, list.get(idx2));

              list.set(idx2, temp);
       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(2);
              list.add(5);
              list.add(9);
              list.add(3);
              list.add(6);

              System.out.println(list);

              swap(list, 1, 3);

              System.out.println(list);
       }
}


// ------------------------------------------------------------
// ArrayList | Sorting
//
// TC: O(N log N)
// Reason: Collections.sort() uses an efficient sorting algorithm.
//
// SC: O(1)
// Reason: No significant extra space is used.
// ------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(2);
              list.add(5);
              list.add(9);
              list.add(3);
              list.add(6);

              Collections.sort(list);

              System.out.println(list);

              Collections.sort(list, Collections.reverseOrder());

              System.out.println(list);
       }
}


// ------------------------------------------------------------
// ArrayList | 2D ArrayList Traversal
//
// TC: O(R × C)
// Reason: Visits every element of the 2D ArrayList once.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

              ArrayList<Integer> list1 = new ArrayList<>();
              list1.add(1);
              list1.add(2);

              ArrayList<Integer> list2 = new ArrayList<>();
              list2.add(3);
              list2.add(4);

              mainList.add(list1);
              mainList.add(list2);

              for(int i = 0; i < mainList.size(); i++) {

                     ArrayList<Integer> currList = mainList.get(i);

                     for(int j = 0; j < currList.size(); j++) {

                            System.out.print(currList.get(j) + " ");
                     }

                     System.out.println();
              }
       }
}


// ------------------------------------------------------------
// ArrayList | Generate 2D ArrayList (Multiplication Tables)
//
// TC: O(R × C)
// Reason: Every element is inserted exactly once.
//
// SC: O(R × C)
// Reason: Stores all generated elements.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

              for(int i = 1; i <= 3; i++) {

                     ArrayList<Integer> curr = new ArrayList<>();

                     for(int j = 1; j <= 5; j++) {

                            curr.add(i * j);
                     }

                     mainList.add(curr);
              }

              for(int i = 0; i < mainList.size(); i++) {

                     for(int j = 0; j < mainList.get(i).size(); j++) {

                            System.out.print(mainList.get(i).get(j) + " ");
                     }

                     System.out.println();
              }
       }
}


// ------------------------------------------------------------
// ArrayList | Container With Most Water (Two Pointer)
//
// TC: O(N)
// Reason: Both pointers traverse the ArrayList at most once.
//
// SC: O(1)
// Reason: Uses only a few extra variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static int storeWater(ArrayList<Integer> height) {

              int maxWater = 0;

              int lp = 0;
              int rp = height.size() - 1;

              while(lp < rp) {

                     int ht = Math.min(height.get(lp), height.get(rp));

                     int width = rp - lp;

                     int currWater = ht * width;

                     maxWater = Math.max(maxWater, currWater);

                     if(height.get(lp) < height.get(rp)) {
                            lp++;
                     }
                     else {
                            rp--;
                     }
              }

              return maxWater;
       }

       public static void main(String args[]) {

              ArrayList<Integer> height = new ArrayList<>();

              height.add(1);
              height.add(8);
              height.add(6);
              height.add(2);
              height.add(5);
              height.add(4);
              height.add(8);
              height.add(3);
              height.add(7);

              System.out.println(storeWater(height));
       }
}


// ------------------------------------------------------------
// ArrayList | Pair Sum in Sorted Array (Two Pointer)
//
// TC: O(N)
// Reason: Both pointers move at most N times.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static boolean pairSum(ArrayList<Integer> list, int target) {

              int lp = 0;
              int rp = list.size() - 1;

              while(lp < rp) {

                     int sum = list.get(lp) + list.get(rp);

                     if(sum == target) {
                            return true;
                     }

                     if(sum < target) {
                            lp++;
                     }
                     else {
                            rp--;
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(3);
              list.add(4);
              list.add(5);
              list.add(6);

              int target = 5;

              System.out.println(pairSum(list, target));
       }
}


// ------------------------------------------------------------
// ArrayList | Pair Sum in Rotated Sorted Array
//
// TC: O(N)
// Reason: Pivot search and two-pointer traversal each take linear time.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

import java.util.ArrayList;

public class ArrayL {

       public static boolean pairSum(ArrayList<Integer> list, int target) {

              int bp = -1;

              // Find Breaking Point
              for(int i = 0; i < list.size() - 1; i++) {

                     if(list.get(i) > list.get(i + 1)) {
                            bp = i;
                            break;
                     }
              }

              int lp = bp + 1;
              int rp = bp;
              int n = list.size();

              while(lp != rp) {

                     int sum = list.get(lp) + list.get(rp);

                     if(sum == target) {
                            return true;
                     }

                     if(sum < target) {
                            lp = (lp + 1) % n;
                     }
                     else {
                            rp = (n + rp - 1) % n;
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(11);
              list.add(15);
              list.add(6);
              list.add(8);
              list.add(9);
              list.add(10);

              int target = 16;

              System.out.println(pairSum(list, target));
       }
}



 */