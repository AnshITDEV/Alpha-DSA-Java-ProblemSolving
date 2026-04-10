/*

import java.util.ArrayList;

public class ArrayL
{
       public static void main(String args[])
       {
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

*/

/*

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
              
              list.remove(4);
              
              System.out.println(list);

       }
}

*/

/* 

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
              
              list.set(2,10);
              
              System.out.println(list);
              
              System.out.println(list.contains(2));
              
              System.out.println(list.contains(11));


       }
}

*/

/*

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

              list.add(2,9);

              System.out.println(list);

       }
}

*/

/*

import java.util.ArrayList;

public class ArrayL {
       public static void main(String args[]) {

              ArrayList <Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              System.out.println(list.size());
              
              for(int i=0; i<list.size(); i++){
                     System.out.print(list.get(i)+" ");
              }
              
              System.out.println(list);
       }
}

*/

/*  
Print the arrayList in the reverse order

import java.util.ArrayList;

public class ArrayL {
       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(7);
              list.add(4);
              list.add(5);

              for (int i = list.size()-1; i >= 0; i--) {
                     System.out.print(list.get(i) + " ");
              }

       }
}

*/


/* Maximum element in the arrayList

Loop runs through the list once → O(n)
Only one variable used → O(1)

import java.util.ArrayList;

public class ArrayL{

       public static void main(String args[]){

              ArrayList <Integer> list = new ArrayList<>();

              list.add(3);
              list.add(5);
              list.add(32);
              list.add(34);
              list.add(23);

              int max = Integer.MIN_VALUE;

              for (int i = 0; i < list.size(); i++){

                     if ( max < list.get(i)){
                            max = list.get(i);
                     }

              }

              System.out.println(max);
       }
}

*/


/*  Maximum element in the arrayList (Optimized)

Loop runs through the list once → O(n)
Only one variable used → O(1)


import java.util.ArrayList;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(3);
              list.add(5);
              list.add(36);
              list.add(34);
              list.add(23);

              int max = Integer.MIN_VALUE;

              for (int i = 0; i < list.size() - 1; i++) {
                     max = Math.max(max,list.get(i));
              }

              System.out.println(max);
       }
}

*/


/* ArrayList Manipulation — Swapping Two Elements
TC: O(1)
SC: O(1)




import java.util.ArrayList;

public class ArrayL {

       public static void Swap(ArrayList <Integer> list , int idx1, int idx2){

              int temp = list.get(idx1);
              list.set(idx1, list.get(idx2));
              list.set(idx2, temp);

       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(3);
              list.add(5);
              list.add(36);
              list.add(34);
              list.add(23);

              System.out.println(list);

              int idx1 = 2;
              int idx2 = 4;
              
              Swap(list,idx1,idx2);
              
              System.out.println(list);
       }
}

*/

/* ArrayList Operations — Swap + Sorting using Collections


Time Complexity
Collections.sort() uses TimSort
TimSort complexity → O(n log n)

Space Complexity
Only a few temporary variables used.

TC: O(n log n)
SC: O(1)


import java.util.ArrayList;
import java.util.Collections;

public class ArrayL {

       public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {

              int temp = list.get(idx1);
              list.set(idx1, list.get(idx2));
              list.set(idx2, temp);

       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(90);
              list.add(5);
              list.add(36);
              list.add(34);
              list.add(23);

              System.out.println(list);

              int idx1 = 2;
              int idx2 = 4;

              Swap(list, idx1, idx2);

              System.out.println(list);
              
              Collections.sort(list);

              System.out.println(list);
              
              Collections.sort(list,Collections.reverseOrder());

              System.out.println(list);

       }
}

*/


/* 2D ArrayList Traversal (Nested ArrayList Iteration)

TC: O(n × m)
SC: O(1)

Time Complexity
Outer loop runs n times
Inner loop runs m times

Space Complexity
No extra data structures used.




import java.util.*;

public class ArrayL{

       public static void main(String args[]){

              ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();

              ArrayList <Integer> list1 = new ArrayList<>();
              list1.add(1);
              list1.add(2);
              
              MainList.add(list1);
              
              ArrayList <Integer> list2 = new ArrayList<>();
              list2.add(3);
              list2.add(4);
              
              MainList.add(list2);
              
              for(int i = 0; i < MainList.size(); i++){

                     ArrayList <Integer> currList = MainList.get(i);

                     for(int j = 0; j < currList.size(); j++){
                            System.out.print(currList.get(j) + " ");
                     }

                     System.out.println();
              }
              
       }

}

*/

/*
2D ArrayList Generation — Multiplication Tables using Nested Lists

Time Complexity
Outer loop runs n lists
Inner loop runs m elements
Total:
n × m

Space Complexity
The 2D ArrayList stores n × m elements.

TC: O(n × m)
SC: O(n × m)



import java.util.*;

public class ArrayL {

       public static void main(String args[]) {

              ArrayList <ArrayList <Integer>> MainList = new ArrayList<>();
              
              ArrayList <Integer> List1 = new ArrayList<>();
              ArrayList <Integer> List2 = new ArrayList<>();
              ArrayList <Integer> List3 = new ArrayList<>();
              
              for(int i = 1; i <= 10; i++){

                     List1.add(1 * i);
                     List2.add(2 * i);
                     List3.add(3 * i);
                     
              }
              
              MainList.add(List1);
              MainList.add(List2);
              MainList.add(List3);

              System.out.println(MainList);

              for(int i = 0; i < MainList.size(); i++){
                     ArrayList <Integer> currList = MainList.get(i);

                     for(int j = 0; j < currList.size(); j++){
                            System.out.print(currList.get(j) + " ");
                     }
                     System.out.println();
                     
              }


       }

}

*/

/*  
finding the max water that can be stored when heights are given

TC:O(n)     only one while loop and two pointers move atmost n times 
SC:O(1)     no data structure used only arrayList

import java.util.ArrayList;

public class ArrayL{

       public static int maxWater(ArrayList <Integer> heights){
              int maxWater = 0;
              int lp = 0;
              int rp = heights.size()-1;

              while (lp < rp){
                     int ht = Math.min(heights.get(lp),heights.get(rp));
                     int width = rp - lp;

                     int currWater = ht * width;
                     maxWater = Math.max(maxWater,currWater);

                     if(heights.get(lp) < heights.get(rp)){
                            lp++;
                     }
                     else{
                            rp--;
                     }
              }
              return maxWater;
       }

       public static void main(String args[]){
              ArrayList <Integer> heights = new ArrayList<>();

              heights.add(9);
              heights.add(5);
              heights.add(2);
              heights.add(9);
              heights.add(4);
              heights.add(4);
              heights.add(7);
              heights.add(3);

              System.out.println(maxWater(heights));

       }
}

*/



/* 
Two Pointer Technique — Pair Sum in Sorted Array

TC: O(n)
SC: O(1)



import java.util.ArrayList;

public class ArrayL{

       public static boolean pairSum1(ArrayList <Integer> list, int target){

              int lp = 0;
              int rp = list.size() - 1;

              while( lp < rp){

                     int sum = list.get(lp) + list.get(rp);

                     if( sum == target ){
                            return true;
                     }

                     if( sum > target ){
                            rp--;
                     }
                     else{
                            lp++;
                     }
              }
              return false;
       }

       public static void main(String args[]){

              ArrayList <Integer> list = new ArrayList<>();

              list.add(1);
              list.add(2);
              list.add(3);
              list.add(4);
              list.add(5);
              list.add(6);
              list.add(7);
              list.add(8);

              int target = 9;

              System.out.println(twoSum(list,target));
              
       }
}



*/


/* Two Pointer Technique — Pair Sum in Rotated Sorted Array
TC: O(n)
SC: O(1)


import java.util.ArrayList;

public class ArrayL {

       public static boolean pairSum2(ArrayList<Integer> list, int target) {

              int n = list.size();
              int bp = -1;

              for(int i = 0; i < n-1; i++){
                     if(list.get(i) > list.get(i+1)){
                            bp = i;
                            break;
                     }
              }

              int lp = bp + 1;
              int rp = bp;

              while (lp != rp) {

                     int sum = list.get(lp) + list.get(rp);

                     if (sum == target) {
                            return true;
                     }

                     if (sum > target) {
                            rp = (n + rp - 1) % n;
                     } else {
                            lp = (lp + 1) % n;
                     }

                     
              }
              return false;
       }

       public static void main(String args[]) {

              ArrayList<Integer> list = new ArrayList<>();

              list.add(9);
              list.add(10);
              list.add(11);
              list.add(4);
              list.add(5);
              list.add(6);
              list.add(7);
              list.add(8);

              int target = 15;

              System.out.println(pairSum2(list, target));

       }
}

*/









