/*

## Arrays - Index

| Sr. No. | Program                              | Time Complexity | Space Complexity |
| :-----: | ------------------------------------ | :-------------: | :--------------: |
|    1    | Linear Search                        |     **O(N)**    |     **O(1)**     |
|    2    | Find Largest & Smallest Element      |     **O(N)**    |     **O(1)**     |
|    3    | Binary Search                        |   **O(log N)**  |     **O(1)**     |
|    4    | Reverse an Array                     |     **O(N)**    |     **O(1)**     |
|    5    | Print All Pairs in an Array          |    **O(N²)**    |     **O(1)**     |
|    6    | Print All Subarrays                  |    **O(N³)**    |     **O(1)**     |
|    7    | Maximum Subarray Sum (Brute Force)   |    **O(N³)**    |     **O(1)**     |
|    8    | Maximum Subarray Sum (Prefix Sum)    |    **O(N²)**    |     **O(N)**     |
|    9    | Kadane's Algorithm                   |     **O(N)**    |     **O(1)**     |
|    10   | Trapping Rainwater                   |     **O(N)**    |     **O(1)**     |
|    11   | Buy and Sell Stocks (Maximum Profit) |     **O(N)**    |     **O(1)**     |

---

### Complexity Summary

| Complexity     | Programs                                                                                                                      |
| -------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| **O(log N)**   | Binary Search                                                                                                                 |
| **O(N)**       | Linear Search, Find Largest & Smallest Element, Reverse an Array, Kadane's Algorithm, Trapping Rainwater, Buy and Sell Stocks |
| **O(N²)**      | Print All Pairs, Maximum Subarray Sum (Prefix Sum)                                                                            |
| **O(N³)**      | Print All Subarrays, Maximum Subarray Sum (Brute Force)                                                                       |
| **O(1) Space** | All programs except Prefix Sum Method                                                                                         |
| **O(N) Space** | Maximum Subarray Sum (Prefix Sum)                                                                                             |





// ------------------------------------------------------------
// Linear Search
//
// TC: O(N)
// Reason: In the worst case, every element is checked once.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class array {

       public static int linearSearch(int arr[], int key) {

              for(int i = 0; i < arr.length; i++) {

                     if(arr[i] == key) {
                            return i;
                     }
              }

              return -1;
       }

       public static void main(String args[]) {

              int arr[] = {2, 4, 5, 7, 8, 9};
              int key = 7;

              int result = linearSearch(arr, key);

              if(result == -1) {
                     System.out.println("Not Found");
              }
              else {
                     System.out.println("Key Found at Index = " + result);
              }
       }
}

// ------------------------------------------------------------
// Find Largest and Smallest Element
//
// TC: O(N)
// Reason: Traverses the array only once.
//
// SC: O(1)
// Reason: Uses only two extra variables.
// ------------------------------------------------------------

public class array {

       public static int getLargest(int arr[]) {

              int largest = Integer.MIN_VALUE;
              int smallest = Integer.MAX_VALUE;

              for (int i = 0; i < arr.length; i++) {

                     if (arr[i] > largest) {
                            largest = arr[i];
                     }

                     if (arr[i] < smallest) {
                            smallest = arr[i];
                     }
              }

              System.out.println("Smallest = " + smallest);

              return largest;
       }

       public static void main(String args[]) {

              int arr[] = { 2, 4, 6, 8, 9 };

              System.out.println("Largest = " + getLargest(arr));
       }
}

// ------------------------------------------------------------
// Binary Search
//
// TC: O(log N)
// Reason: Search space becomes half in every iteration.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class array {

       public static int binarySearch(int arr[], int key) {

              int start = 0;
              int end = arr.length - 1;

              while (start <= end) {

                     int mid = (start + end) / 2;

                     if (arr[mid] == key) {
                            return mid;
                     } else if (arr[mid] < key) {
                            start = mid + 1;
                     } else {
                            end = mid - 1;
                     }
              }

              return -1;
       }

       public static void main(String args[]) {

              int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
              int key = 4;

              System.out.println(binarySearch(arr, key));
       }
}

// ------------------------------------------------------------
// Reverse an Array
//
// TC: O(N)
// Reason: Swaps elements until the two pointers meet.
//
// SC: O(1)
// Reason: Reverses the array in-place.
// ------------------------------------------------------------

public class array {

       public static void reverse(int arr[]) {

              int first = 0;
              int last = arr.length - 1;

              while (first < last) {

                     int temp = arr[first];
                     arr[first] = arr[last];
                     arr[last] = temp;

                     first++;
                     last--;
              }
       }

       public static void main(String args[]) {

              int arr[] = { 3, 9, 2, 1, 6 };

              reverse(arr);

              for (int i = 0; i < arr.length; i++) {
                     System.out.print(arr[i] + " ");
              }
       }
}

// ------------------------------------------------------------
// Print All Pairs in an Array
//
// TC: O(N²)
// Reason: Two nested loops generate every possible pair.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class array {

       public static void printPairs(int arr[]) {

              int totalPairs = 0;

              for (int i = 0; i < arr.length; i++) {

                     int curr = arr[i];

                     for (int j = i + 1; j < arr.length; j++) {

                            System.out.print("(" + curr + "," + arr[j] + ") ");
                            totalPairs++;
                     }

                     System.out.println();
              }

              System.out.println("Total Pairs = " + totalPairs);
       }

       public static void main(String args[]) {

              int arr[] = { 2, 5, 7, 8, 9 };

              printPairs(arr);
       }
}

// ------------------------------------------------------------
// Print All Subarrays
//
// TC: O(N³)
// Reason: Three nested loops generate and print every subarray.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class array {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();

              int arr[] = new int[n];

              for (int i = 0; i < n; i++) {
                     arr[i] = sc.nextInt();
              }

              for (int i = 0; i < arr.length; i++) {

                     int start = i;

                     for (int j = i; j < arr.length; j++) {

                            int end = j;

                            for (int k = start; k <= end; k++) {
                                   System.out.print(arr[k] + " ");
                            }

                            System.out.println();
                     }

                     System.out.println();
              }

              sc.close();
       }
}





// ------------------------------------------------------------
// Maximum Subarray Sum (Brute Force)
//
// TC: O(N³)
// Reason: Three nested loops generate all subarrays and calculate their sums.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class array {

       public static void maxSubarraySum(int arr[]) {

              int maxSum = Integer.MIN_VALUE;

              for (int i = 0; i < arr.length; i++) {

                     for (int j = i; j < arr.length; j++) {

                            int currSum = 0;

                            for (int k = i; k <= j; k++) {
                                   currSum += arr[k];
                            }

                            maxSum = Math.max(maxSum, currSum);
                     }
              }

              System.out.println("Maximum Sum = " + maxSum);
       }

       public static void main(String args[]) {

              int arr[] = { 2, 4, 6, 8, 10 };

              maxSubarraySum(arr);
       }
}

// ------------------------------------------------------------
// Maximum Subarray Sum (Prefix Sum)
//
// TC: O(N²)
// Reason: Prefix array is built once, then every subarray sum is found in O(1).
//
// SC: O(N)
// Reason: Extra prefix array of size N is used.
// ------------------------------------------------------------

public class array {

       public static void maxSubarraySum(int arr[]) {

              int prefix[] = new int[arr.length];

              prefix[0] = arr[0];

              for (int i = 1; i < arr.length; i++) {
                     prefix[i] = prefix[i - 1] + arr[i];
              }

              int maxSum = Integer.MIN_VALUE;

              for (int i = 0; i < arr.length; i++) {

                     for (int j = i; j < arr.length; j++) {

                            int currSum;

                            if (i == 0) {
                                   currSum = prefix[j];
                            } else {
                                   currSum = prefix[j] - prefix[i - 1];
                            }

                            maxSum = Math.max(maxSum, currSum);
                     }
              }

              System.out.println("Maximum Sum = " + maxSum);
       }

       public static void main(String args[]) {

              int arr[] = { 2, 4, 6, 8, 10 };

              maxSubarraySum(arr);
       }
}

// ------------------------------------------------------------
// Kadane's Algorithm
//
// TC: O(N)
// Reason: Traverses the array only once.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class array {

       public static void kadanes(int arr[]) {

              int currSum = 0;
              int maxSum = Integer.MIN_VALUE;

              for (int i = 0; i < arr.length; i++) {

                     currSum += arr[i];

                     if (currSum > maxSum) {
                            maxSum = currSum;
                     }

                     if (currSum < 0) {
                            currSum = 0;
                     }
              }

              System.out.println("Maximum Sum = " + maxSum);
       }

       public static void main(String args[]) {

              int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

              kadanes(arr);
       }
}

// ------------------------------------------------------------
// Trapping Rainwater
//
// TC: O(N)
// Reason: Two pointers traverse the array only once.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class array {

       public static int trappedRainwater(int height[]) {

              int left = 0;
              int right = height.length - 1;

              int leftMax = 0;
              int rightMax = 0;

              int trappedWater = 0;

              while (left < right) {

                     if (height[left] <= height[right]) {

                            if (height[left] >= leftMax) {
                                   leftMax = height[left];
                            } else {
                                   trappedWater += leftMax - height[left];
                            }

                            left++;

                     } else {

                            if (height[right] >= rightMax) {
                                   rightMax = height[right];
                            } else {
                                   trappedWater += rightMax - height[right];
                            }

                            right--;
                     }
              }

              return trappedWater;
       }

       public static void main(String args[]) {

              int height[] = { 4, 2, 0, 6, 3, 2, 5 };

              System.out.println(trappedRainwater(height));
       }
}

// ------------------------------------------------------------
// Buy and Sell Stocks (Maximum Profit)
//
// TC: O(N)
// Reason: Traverses the price array only once.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class array {

       public static int maxProfit(int prices[]) {

              int buyPrice = Integer.MAX_VALUE;
              int maxProfit = 0;

              for (int i = 0; i < prices.length; i++) {

                     if (prices[i] < buyPrice) {
                            buyPrice = prices[i];
                     } else {

                            int profit = prices[i] - buyPrice;

                            maxProfit = Math.max(maxProfit, profit);
                     }
              }

              return maxProfit;
       }

       public static void main(String args[]) {

              int prices[] = { 7, 1, 5, 3, 6, 4 };

              System.out.println("Maximum Profit = " + maxProfit(prices));
       }
}




*/