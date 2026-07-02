/* 
# Greedy - Index

| Sr. No. | Program                                                      |    Time Complexity    | Space Complexity |
| :-----: | ------------------------------------------------------------ | :-------------------: | :--------------: |
|    1    | Activity Selection (End Time Already Sorted)                 |          O(N)         |       O(N)       |
|    2    | Activity Selection (Unsorted Input)                          |       O(N log N)      |       O(N)       |
|    3    | Fractional Knapsack                                          |       O(N log N)      |       O(N)       |
|    4    | Minimum Absolute Difference Pairs                            |       O(N log N)      |       O(1)       |
|    5    | Maximum Length Chain of Pairs                                |       O(N log N)      |       O(1)       |
|    6    | Indian Coins (Minimum Number of Coins)                       |       O(N log N)      |       O(N)       |
|    7    | Job Sequencing Problem                                       |       O(N log N)      |       O(N)       |
|    8    | Chocolate Problem (Minimum Cost to Cut a Board into Squares) | O((M + N) log(M + N)) |       O(1)       |

---

# Complexity Summary

| Complexity                    | Programs                                                                                                                                                         |
| ----------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **TC: O(N)**                  | Activity Selection (End Time Already Sorted)                                                                                                                     |
| **TC: O(N log N)**            | Activity Selection (Unsorted Input), Fractional Knapsack, Minimum Absolute Difference Pairs, Maximum Length Chain of Pairs, Indian Coins, Job Sequencing Problem |
| **TC: O((M + N) log(M + N))** | Chocolate Problem (Minimum Cost to Cut a Board into Squares)                                                                                                     |
| **SC: O(1)**                  | Minimum Absolute Difference Pairs, Maximum Length Chain of Pairs, Chocolate Problem                                                                              |
| **SC: O(N)**                  | Activity Selection (End Time Already Sorted), Activity Selection (Unsorted Input), Fractional Knapsack, Indian Coins, Job Sequencing Problem                     |








// ============================================================
// Part 1
// ============================================================

// ------------------------------------------------------------
// Greedy | Activity Selection (End Time Already Sorted)
//
// TC: O(N)
// Reason: Single traversal of all activities.
//
// SC: O(N)
// Reason: ArrayList stores selected activity indices.
// ------------------------------------------------------------

       import java.util.*;

public class Greedy {
              
       public static void main(String args[]) {

              int start[] = {1, 3, 0, 5, 8, 5};
              int end[] = {2, 4, 6, 7, 9, 9};

              ArrayList<Integer> activities = new ArrayList<>();

              int maxAct = 1;
              activities.add(0);

              int lastEnd = end[0];

              for (int i = 1; i < end.length; i++) {

              if (start[i] >= lastEnd) {
                     maxAct++;
                     activities.add(i);
                     lastEnd = end[i];
              }
              }

              System.out.println("Maximum Activities = " + maxAct);

              for (int i = 0; i < activities.size(); i++) {
              System.out.print("A" + activities.get(i) + " ");
              }
       }
}

// Output:
// Maximum Activities = 4
// A0 A1 A3 A4

// ------------------------------------------------------------
// Greedy | Activity Selection (Unsorted Input)
//
// TC: O(N log N)
// Reason: Activities are sorted according to end time.
//
// SC: O(N)
// Reason: Extra 2D array and ArrayList are used.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       public static void main(String args[]) {

              int start[] = { 1, 3, 0, 5, 8, 5 };
              int end[] = { 2, 4, 6, 7, 9, 9 };

              int activities[][] = new int[end.length][3];

              for (int i = 0; i < activities.length; i++) {
                     activities[i][0] = i;
                     activities[i][1] = start[i];
                     activities[i][2] = end[i];
              }

              Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

              ArrayList<Integer> ans = new ArrayList<>();

              int maxAct = 1;
              ans.add(activities[0][0]);

              int lastEnd = activities[0][2];

              for (int i = 1; i < activities.length; i++) {

                     if (activities[i][1] >= lastEnd) {
                            maxAct++;
                            ans.add(activities[i][0]);
                            lastEnd = activities[i][2];
                     }
              }

              System.out.println("Maximum Activities = " + maxAct);

              for (int i = 0; i < ans.size(); i++) {
                     System.out.print("A" + ans.get(i) + " ");
              }
       }
}

// Output:
// Maximum Activities = 4
// A0 A1 A3 A4



// ============================================================
// Part 2
// ============================================================

// ------------------------------------------------------------
// Greedy | Fractional Knapsack
//
// TC: O(N log N)
// Reason: Items are sorted based on value/weight ratio.
//
// SC: O(N)
// Reason: Extra 2D array stores item index and ratio.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       public static void main(String args[]) {

              int weight[] = {10, 20, 30};
              int val[] = {60, 100, 120};
              int W = 50;

              double ratio[][] = new double[val.length][2];

              for (int i = 0; i < weight.length; i++) {
                     ratio[i][0] = i;
                     ratio[i][1] = val[i] / (double) weight[i];
              }

              Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

              int capacity = W;
              double finalVal = 0;

              for (int i = ratio.length - 1; i >= 0; i--) {

                     int idx = (int) ratio[i][0];

                     if (capacity >= weight[idx]) {
                            finalVal += val[idx];
                            capacity -= weight[idx];
                     } else {
                            finalVal += ratio[i][1] * capacity;
                            capacity = 0;
                            break;
                     }
              }

              System.out.println("Maximum Value = " + finalVal);
       }
}

// Output:
// Maximum Value = 240.0

// ------------------------------------------------------------
// Greedy | Minimum Absolute Difference Pairs
//
// TC: O(N log N)
// Reason: Both arrays are sorted before traversal.
//
// SC: O(1)
// Reason: Only constant extra variables are used.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       public static void main(String args[]) {

              int arr1[] = { 1, 4, 3, 8, 9 };
              int arr2[] = { 5, 8, 2, 6, 8 };

              Arrays.sort(arr1);
              Arrays.sort(arr2);

              int sum = 0;

              for (int i = 0; i < arr1.length; i++) {
                     sum += Math.abs(arr1[i] - arr2[i]);
              }

              System.out.println("Minimum Sum of Absolute Differences = " + sum);
       }
}

// Output:
// Minimum Sum of Absolute Differences = 6



// ============================================================
// Part 3
// ============================================================

// ------------------------------------------------------------
// Greedy | Maximum Length Chain of Pairs
//
// TC: O(N log N)
// Reason: Pairs are sorted based on the second element.
//
// SC: O(1)
// Reason: Only constant extra variables are used.
// ------------------------------------------------------------

import java.util.*;

       public class Greedy {

       public static void main(String args[]) {

              int arr[][] = {
                     {5, 24},
                     {39, 60},
                     {5, 28},
                     {27, 40},
                     {50, 90}
              };

              Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

              int chainLen = 1;
              int pairEnd = arr[0][1];

              for (int i = 1; i < arr.length; i++) {

                     if (arr[i][0] > pairEnd) {
                            chainLen++;
                            pairEnd = arr[i][1];
                     }
              }

              System.out.println("Chain Length = " + chainLen);
       }
}

// Output:
// Chain Length = 3

// ------------------------------------------------------------
// Greedy | Indian Coins (Minimum Number of Coins)
//
// TC: O(N log N)
// Reason: Coins are sorted in descending order.
//
// SC: O(N)
// Reason: ArrayList stores the selected coins.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       public static void main(String args[]) {

              Integer coins[] = { 5, 10, 20, 50, 100, 500, 1000, 2000 };

              Arrays.sort(coins, Comparator.reverseOrder());

              int value = 590;
              int count = 0;

              ArrayList<Integer> ans = new ArrayList<>();

              for (int i = 0; i < coins.length; i++) {

                     while (coins[i] <= value) {
                            count++;
                            value -= coins[i];
                            ans.add(coins[i]);
                     }
              }

              System.out.println("Minimum Coins = " + count);
              System.out.println(ans);
       }
}

// Output:
// Minimum Coins = 4
// [500, 50, 20, 20]







// ============================================================
// Part 4
// ============================================================

// ------------------------------------------------------------
// Greedy | Job Sequencing Problem
//
// TC: O(N log N)
// Reason: Jobs are sorted based on profit.
//
// SC: O(N)
// Reason: ArrayLists store the jobs and selected job sequence.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       static class Job {

              int id;
              int deadline;
              int profit;

              Job(int id, int deadline, int profit) {
                     this.id = id;
                     this.deadline = deadline;
                     this.profit = profit;
              }
       }

       public static void main(String args[]) {

              int jobsInfo[][] = {
                     {4, 20},
                     {1, 10},
                     {1, 40},
                     {1, 30}
              };

              ArrayList<Job> jobs = new ArrayList<>();

              for (int i = 0; i < jobsInfo.length; i++) {
                     jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
              }

              Collections.sort(jobs, (a, b) -> b.profit - a.profit);

              int time = 0;
              ArrayList<Integer> seq = new ArrayList<>();

              for (int i = 0; i < jobs.size(); i++) {

                     Job curr = jobs.get(i);

                     if (curr.deadline > time) {
                            time++;
                            seq.add(curr.id);
                     }
              }

              System.out.println("Maximum Jobs = " + seq.size());

              for (int id : seq) {
                     System.out.print(id + " ");
              }
       }
}

// Output:
// Maximum Jobs = 2
// 2 0

// ------------------------------------------------------------
// Greedy | Chocolate Problem (Minimum Cost to Cut a Board into Squares)
//
// TC: O((M + N) log(M + N))
// Reason: Horizontal and vertical cut costs are sorted.
//
// SC: O(1)
// Reason: Only constant extra variables are used.
// ------------------------------------------------------------

import java.util.*;

public class Greedy {

       public static void main(String args[]) {

              Integer vt[] = { 4, 3, 2, 1, 1 };
              Integer ht[] = { 4, 2, 1 };

              Arrays.sort(vt, Collections.reverseOrder());
              Arrays.sort(ht, Collections.reverseOrder());

              int h = 0, v = 0;
              int hp = 1, vp = 1;
              int minCost = 0;

              while (h < ht.length && v < vt.length) {

                     if (ht[h] > vt[v]) {
                            minCost += ht[h] * vp;
                            hp++;
                            h++;
                     } else {
                            minCost += vt[v] * hp;
                            vp++;
                            v++;
                     }
              }

              while (h < ht.length) {
                     minCost += ht[h] * vp;
                     hp++;
                     h++;
              }

              while (v < vt.length) {
                     minCost += vt[v] * hp;
                     vp++;
                     v++;
              }

              System.out.println("Minimum Cost = " + minCost);
       }
}

// Output:
// Minimum Cost = 42



*/

