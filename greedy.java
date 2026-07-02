
/*

import java.util.*;

public class greedy {

       public static void main(String args[]) {

              int start[] = {1, 3, 0, 5, 8, 5};
              int end[] = {2, 4, 6, 7, 9, 9};

              ArrayList<Integer> a = new ArrayList<>();

              int maxAct = 0;
              

              maxAct = 1;
              a.add(0);
              int last = end[0];

              for (int i=1; i<end.length; i++) {

                     if (start[i] >= last) {

                            maxAct++;
                            a.add(i);
                            last = end[i];
                     }
              }

              System.out.println("Maximum activites = "+maxAct);

              for (int i=0; i<a.size(); i++) {
                     System.out.print("A"+a.get(i)+" ");
              }
       }
}


*/



/* 
import java.util.*;

public class greedy {

       public static void main(String args[]) {

              int start[] = { 1, 3, 0, 5, 8, 5 };
              int end[] = { 2, 4, 6, 7, 9, 9 };

              int activites[][] = new int[end.length][3];

              for (int i=0; i<activites.length; i++) {
                     activites[i][0] = i;
                     activites[i][1] = start[i];
                     activites[i][2] = end[i];
              }

              Arrays.sort(activites, Comparator.comparingDouble( o -> o[2]));

              int maxAct = 1;
              ArrayList<Integer> a = new ArrayList<>();

              a.add(activites[0][0]);
              int last = activites[0][2];

              for (int i = 1; i < activites.length; i++) {

                     if (activites[i][1] >= last) {

                            maxAct++;
                            a.add(activites[i][0]);
                            last = activites[i][2];
                     }
              }

              System.out.println("Maximum activites = " + maxAct);

              for (int i = 0; i < a.size(); i++) {
                     System.out.print("A" + a.get(i) + " ");
              }
       }
}

*/




/*
import java.util.*;

public class greedy {

       public static void main(String args[]) {

              int weight[] = { 10, 20, 30 };
              int val[] = { 60, 100, 120 };
              int W = 50;

              double twoD[][] = new double[val.length][2];

              for (int i = 0; i < weight.length; i++) {
                     twoD[i][0] = i;
                     twoD[i][1] = val[i] / (double) weight[i];
              }

              Arrays.sort(twoD, Comparator.comparingDouble(o -> o[1]));

              int n = val.length;
              int capacity = W;
              double finalVal = 0;

              for (int i = n - 1; i >= 0; i--) {

                     int idx = (int) twoD[i][0];

                     if (capacity >= weight[idx]) {
                            finalVal += val[idx];
                            capacity -= weight[idx];
                     } else {
                            finalVal += twoD[i][1] * capacity;
                            capacity = 0;
                            break;
                     }
              }
              System.out.println("Maximum value: " + finalVal);

       }
}

 */



/* 

import java.util.*;

public class greedy {

       public static void main(String args[]) {
              int arr1[] = {1,4,3,8,9};
              int arr2[] = {5,8,2,6,8};
              int sum = 0;

              Arrays.sort(arr1);
              Arrays.sort(arr2);

              for(int i=0; i<arr1.length; i++) {
                     sum += Math.abs(arr1[i]-arr2[i]);
              }

              System.out.println("Minimum sum of the absolute diff: "+sum);
       }
}

*/


/* 
import java.util.*;

public class greedy {

       public static void main(String args[]) {

              int arr[][] = {
                            { 5, 24 },
                            { 39,Indian Coins (Minimum Number of Coins) 60 },
                            { 5, 28 },
                            { 27, 40 },
                            { 50, 90 }
              };

              Arrays.sort(arr,Comparator.comparingDouble( o->o[1]));

              int chainLen = 1;
              int PairEnd = arr[0][1];

              for(int i=1; i< arr.length; i++) {
                     
                     if(arr[i][0] > PairEnd) {
                            chainLen++;
                            PairEnd = arr[i][1];
                     }

              }

              System.out.print("Chain length:"+chainLen);
       }
}

*/


/* 
Indian Coins (Minimum Number of Coins)



import java.util.*;

public class greedy {
       public static void main(String args[]) {

              Integer coins[] = {5, 10, 20, 50, 100, 500, 1000, 2000};

              Arrays.sort(coins, Comparator.reverseOrder());
              int value = 590;
              int count = 0;

              ArrayList<Integer> a = new ArrayList<>();

              for(int i=0; i<coins.length; i++) {
                     while(coins[i] <= value) {
                            count++;
                            value -= coins[i];
                            a.add(coins[i]);
                     }
              }

              System.out.println(count);
              System.out.println(a);
              
       }
}




Job Sequencing Problem




import java.util.*;

public class greedy {

       static class Job {
              int deadline;
              int profit;
              int id;

              Job (int id, int deadline, int profit) {
                     this.deadline = deadline;
                     this.profit = profit;
                     this.id = id;
              }
       }

       public static void main(String args[]) {

              int arr[][] = {
                     { 4, 20 },
                     { 1, 10 },
                     { 1, 40 },
                     { 1, 30 }
              };

              ArrayList<Job> jobs = new ArrayList<>();

              for(int i=0; i<arr.length; i++) {
                     jobs.add(new Job(i, arr[i][0], arr[i][1]));
              }

              Collections.sort(jobs, (a,b) -> b.profit-a.profit);

              int time = 0;
              
              ArrayList<Integer> seq = new ArrayList<>();

              for(int i=0; i<jobs.size(); i++) {

                     Job curr = jobs.get(i);

                     if(curr.deadline > time) {
                            time++;
                            seq.add(curr.id);
                     }
              }

              System.out.println("Maximum Jobs = " + seq.size());

              for (int id : seq) {
                     System.out.print(id+" ");
              }
       }
}






Chocolate Problem (Minimum Cost to Cut a Board into Squares)



import java.util.*;

public class greedy {
       public static void main(String args[]) {

              Integer vt[] = { 4, 3, 2, 1, 1};
              Integer ht[] = {4, 2, 1};

              Arrays.sort(vt, Collections.reverseOrder());
              Arrays.sort(ht, Collections.reverseOrder());
              
              int h = 0, v = 0;
              int hp = 1, vp = 1;
              int minCost = 0;

              while((h != ht.length) && (v != vt.length)) {
                     
                            if(ht[h] > vt[v]) {
                                   minCost += ht[h] * vp;
                                   h++;
                                   hp++;
                            } else {
                                   minCost += vt[v] * hp;
                                   v++;
                                   vp++;
                            }
              }

              while(h != ht.length) {
                     minCost += ht[h] * vp;
                     h++;
                     hp++;
              }

              while(v != vt.length) {
                     minCost += vt[v] * hp;
                     v++;
                     vp++;
              }

              System.out.println("Minimum cost: "+minCost);
       }
}

*/     











