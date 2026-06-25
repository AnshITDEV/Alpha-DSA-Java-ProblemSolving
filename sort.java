/* 
## Sorting - Index

| Sr. No. | Sorting Algorithm                   | Time Complexity | Space Complexity |
| :-----: | ----------------------------------- | :-------------: | :--------------: |
|    1    | Bubble Sort                         |    **O(N²)**    |     **O(1)**     |
|    2    | Selection Sort                      |    **O(N²)**    |     **O(1)**     |
|    3    | Insertion Sort                      |    **O(N²)**    |     **O(1)**     |
|    4    | Java Inbuilt Sort (`Arrays.sort()`) |  **O(N log N)** |   **O(log N)**   |
|    5    | Java Inbuilt Partial Sort           |  **O(K log K)** |   **O(log K)**   |
|    6    | Java Inbuilt Reverse Order Sort     |  **O(N log N)** |   **O(log N)**   |
|    7    | Counting Sort                       |   **O(N + K)**  |     **O(K)**     |

---

### Complexity Summary

| Complexity         | Algorithms                                         |
| ------------------ | -------------------------------------------------- |
| **O(N²)**          | Bubble Sort, Selection Sort, Insertion Sort        |
| **O(N log N)**     | Java Inbuilt Sort, Java Inbuilt Reverse Order Sort |
| **O(K log K)**     | Java Inbuilt Partial Sort                          |
| **O(N + K)**       | Counting Sort                                      |
| **O(1) Space**     | Bubble Sort, Selection Sort, Insertion Sort        |
| **O(log N) Space** | Java Inbuilt Sort, Java Inbuilt Reverse Order Sort |
| **O(log K) Space** | Java Inbuilt Partial Sort                          |
| **O(K) Space**     | Counting Sort                                      |






// ------------------------------------------------------------
// Bubble Sort
//
// TC: O(N²)
// Reason: Two nested loops compare adjacent elements repeatedly.
//
// SC: O(1)
// Reason: Sorting is done in-place using only one temporary variable.
// ------------------------------------------------------------

public class sort {

       public static void bubbleSort(int arr[]) {

              for (int i = 0; i < arr.length - 1; i++) {

                     for (int j = 0; j < arr.length - 1 - i; j++) {

                            if (arr[j] > arr[j + 1]) {

                                   int temp = arr[j];
                                   arr[j] = arr[j + 1];
                                   arr[j + 1] = temp;
                            }
                     }
              }
       }

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for (int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = { 5, 4, 1, 3, 2 };

              bubbleSort(arr);

              printArr(arr);
       }
}

// ------------------------------------------------------------
// Selection Sort
//
// TC: O(N²)
// Reason: Two nested loops find the minimum element for every position.
//
// SC: O(1)
// Reason: Sorting is performed in-place.
// ------------------------------------------------------------

public class sort {

       public static void selectionSort(int arr[]) {

              for (int i = 0; i < arr.length - 1; i++) {

                     int minPos = i;

                     for (int j = i + 1; j < arr.length; j++) {

                            if (arr[minPos] > arr[j]) {
                                   minPos = j;
                            }
                     }

                     int temp = arr[minPos];
                     arr[minPos] = arr[i];
                     arr[i] = temp;
              }
       }

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for (int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = { 5, 4, 1, 3, 2, 9, 49 };

              selectionSort(arr);

              printArr(arr);
       }
}

// ------------------------------------------------------------
// Insertion Sort
//
// TC: O(N²)
// Reason: In the worst case, every element is shifted through the sorted
// portion.
//
// SC: O(1)
// Reason: Sorting is done in-place without any extra array.
// ------------------------------------------------------------

public class sort {

       public static void insertionSort(int arr[]) {

              for (int i = 1; i < arr.length; i++) {

                     int curr = arr[i];
                     int prev = i - 1;

                     while (prev >= 0 && arr[prev] > curr) {

                            arr[prev + 1] = arr[prev];
                            prev--;
                     }

                     arr[prev + 1] = curr;
              }
       }

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for (int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = { 5, 4, 1, 3, 2 };

              insertionSort(arr);

              printArr(arr);
       }
}



// ------------------------------------------------------------
// Java Inbuilt Sort (Arrays.sort)
//
// TC: O(N log N)
// Reason: Java's inbuilt sorting algorithm (Dual-Pivot Quicksort for primitive
// arrays) runs in O(N log N) on average.
//
// SC: O(log N)
// Reason: Uses recursion stack internally.
// ------------------------------------------------------------

import java.util.Arrays;

public class sort {

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for(int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = {5, 4, 1, 3, 2};

              Arrays.sort(arr);

              printArr(arr);
       }
}

// ------------------------------------------------------------
// Java Inbuilt Sort (Partial Array)
//
// TC: O(K log K)
// Reason: Only K elements in the specified range are sorted.
//
// SC: O(log K)
// Reason: Uses recursion stack internally.
// ------------------------------------------------------------

import java.util.Arrays;

public class sort {

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for(int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = {5, 4, 1, 3, 2};

              Arrays.sort(arr, 2, arr.length);

              printArr(arr);
       }
}

// ------------------------------------------------------------
// Java Inbuilt Sort in Reverse Order
//
// TC: O(N log N)
// Reason: Uses Java's optimized sorting algorithm.
//
// SC: O(log N)
// Reason: Uses recursion stack internally.
// ------------------------------------------------------------

import java.util.Arrays;
import java.util.Collections;

public class sort {

       public static void printArr(Integer arr[]) {

              StringBuilder sb = new StringBuilder();

              for (int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              Integer arr[] = { 5, 4, 1, 3, 2 };

              Arrays.sort(arr, Collections.reverseOrder());

              printArr(arr);
       }
}

// ------------------------------------------------------------
// Counting Sort
//
// TC: O(N + K)
// Reason: One traversal for frequency counting and one traversal of the
// frequency array.
//
// SC: O(K)
// Reason: Uses an extra frequency array of size (maximum element + 1).
// ------------------------------------------------------------

public class sort {

       public static void countingSort(int arr[]) {

              int max = Integer.MIN_VALUE;

              for (int i = 0; i < arr.length; i++) {
                     max = Math.max(max, arr[i]);
              }

              int count[] = new int[max + 1];

              for (int i = 0; i < arr.length; i++) {
                     count[arr[i]]++;
              }

              int j = 0;

              for (int i = 0; i < count.length; i++) {

                     while (count[i] > 0) {

                            arr[j] = i;
                            j++;
                            count[i]--;
                     }
              }
       }

       public static void printArr(int arr[]) {

              StringBuilder sb = new StringBuilder();

              for (int i = 0; i < arr.length; i++) {
                     sb.append(arr[i]).append(" ");
              }

              System.out.println(sb.toString());
       }

       public static void main(String args[]) {

              int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

              countingSort(arr);

              printArr(arr);
       }
}








*/