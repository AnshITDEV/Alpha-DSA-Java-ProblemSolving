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