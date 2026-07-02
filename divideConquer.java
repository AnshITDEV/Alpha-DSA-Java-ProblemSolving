/*
## Divide & Conquer - Index

| Sr. No. | Program                        |             Time Complexity             | Space Complexity |
| :-----: | ------------------------------ | :-------------------------------------: | :--------------: |
|    1    | Merge Sort                     |              **O(N log N)**             |     **O(N)**     |
|    2    | Quick Sort                     | **O(N log N)** Average, **O(N²)** Worst |   **O(log N)**   |
|    3    | Search in Rotated Sorted Array |               **O(log N)**              |     **O(1)**     |

---

## Complexity Summary

| Complexity         | Programs                              |
| ------------------ | ------------------------------------- |
| **O(log N)**       | Search in Rotated Sorted Array        |
| **O(N log N)**     | Merge Sort, Quick Sort (Average Case) |
| **O(N²)**          | Quick Sort (Worst Case)               |
| **O(1) Space**     | Search in Rotated Sorted Array        |
| **O(log N) Space** | Quick Sort                            |
| **O(N) Space**     | Merge Sort                            |




```java
// ------------------------------------------------------------
// Divide & Conquer | Merge Sort
//
// TC: O(N log N)
// Reason: The array is divided into log N levels, and merging all elements at each level takes O(N).
//
// SC: O(N)
// Reason: Uses a temporary array while merging.
// ------------------------------------------------------------

public class divideConquer {

       public static void mergeSort(int arr[], int si, int ei) {

              if(si >= ei) {
                     return;
              }

              int mid = si + (ei - si) / 2;

              // Left Half
              mergeSort(arr, si, mid);

              // Right Half
              mergeSort(arr, mid + 1, ei);

              // Merge Both Halves
              merge(arr, si, mid, ei);
       }

       public static void merge(int arr[], int si, int mid, int ei) {

              int temp[] = new int[ei - si + 1];

              int i = si;
              int j = mid + 1;
              int k = 0;

              while(i <= mid && j <= ei) {

                     if(arr[i] < arr[j]) {
                            temp[k++] = arr[i++];
                     }
                     else {
                            temp[k++] = arr[j++];
                     }
              }

              while(i <= mid) {
                     temp[k++] = arr[i++];
              }

              while(j <= ei) {
                     temp[k++] = arr[j++];
              }

              for(i = si, k = 0; k < temp.length; i++, k++) {
                     arr[i] = temp[k];
              }
       }

       public static void main(String args[]) {

              int arr[] = {2, 6, 8, 3, 9, 7};

              mergeSort(arr, 0, arr.length - 1);

              for(int i = 0; i < arr.length; i++) {
                     System.out.print(arr[i] + " ");
              }
       }
}


// ------------------------------------------------------------
// Divide & Conquer | Quick Sort
//
// TC: O(N log N) Average, O(N²) Worst Case
// Reason: Average case divides the array into balanced partitions.
// Worst case occurs when the pivot is always the smallest or largest element.
//
// SC: O(log N)
// Reason: Recursive call stack in the average case.
// ------------------------------------------------------------

public class divideConquer {

       public static void quickSort(int arr[], int si, int ei) {

              if(si >= ei) {
                     return;
              }

              int pIdx = partition(arr, si, ei);

              quickSort(arr, si, pIdx - 1);

              quickSort(arr, pIdx + 1, ei);
       }

       public static int partition(int arr[], int si, int ei) {

              int pivot = arr[ei];

              int i = si - 1;

              for(int j = si; j < ei; j++) {

                     if(arr[j] <= pivot) {

                            i++;

                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                     }
              }

              i++;

              int temp = arr[ei];
              arr[ei] = arr[i];
              arr[i] = temp;

              return i;
       }

       public static void main(String args[]) {

              int arr[] = {3, 5, 2, 7, 8, 9};

              quickSort(arr, 0, arr.length - 1);

              for(int i = 0; i < arr.length; i++) {
                     System.out.print(arr[i] + " ");
              }
       }
}


// ------------------------------------------------------------
// Divide & Conquer | Search in Rotated Sorted Array
//
// TC: O(log N)
// Reason: Binary Search eliminates half of the search space in every iteration.
//
// SC: O(1)
// Reason: Uses only a few extra variables.
// ------------------------------------------------------------

public class divideConquer {

       public static int binSearch(int arr[], int target) {

              int si = 0;
              int ei = arr.length - 1;

              while(si <= ei) {

                     int mid = si + (ei - si) / 2;

                     if(arr[mid] == target) {
                            return mid;
                     }

                     // Left Half Sorted
                     if(arr[si] <= arr[mid]) {

                            if(arr[si] <= target && target < arr[mid]) {
                                   ei = mid - 1;
                            }
                            else {
                                   si = mid + 1;
                            }
                     }

                     // Right Half Sorted
                     else {

                            if(arr[mid] < target && target <= arr[ei]) {
                                   si = mid + 1;
                            }
                            else {
                                   ei = mid - 1;
                            }
                     }
              }

              return -1;
       }

       public static void main(String args[]) {

              int arr[] = {4, 5, 6, 7, 0, 1, 2};

              int target = 0;

              System.out.println(binSearch(arr, target));
       }
}
```



 */