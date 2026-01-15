

// Bubble Sort technique
// Worst Case: O(n^2)

// public class sort 
// {
//        public static void bubbleSort(int arr[])
//        {
//               for(int i = 0; i < arr.length-1; i++)
//               {
//                      for(int j = 0; j < arr.length-1-i; j++)
//                      {
//                             if(arr[j] > arr[j+1])
//                             {
//                                    int temp = arr[j];
//                                    arr[j] = arr[j+1];
//                                    arr[j+1] = temp;

//                             }
//                      }
//               }

//        }

//        public static void printArr(int arr[])
//        {
//               StringBuilder sb = new StringBuilder();

//               for(int i=0; i<arr.length; i++)
//               {
//                      sb.append(arr[i]).append(" ");
//               }
//               System.out.print(sb.toString());
//               System.out.println();
//        }

//        public static void main(String args[])
//        {
//               int arr[] = { 5, 4, 1, 3, 2 };
//               bubbleSort(arr);
//               printArr(arr);
//        }

       
// }


// Selection Sort algorithm
// Worst Case: O(n^2)

// public class sort
// {
//        public static void selectionSort(int arr[])
//        {
              

//               for(int i=0; i<arr.length-1; i++)
//               {
//                      int minPos = i;
//                      for(int j=i+1; j<arr.length; j++)
//                      {
//                             if(arr[minPos]>arr[j])
//                             {
//                                    minPos = j;
//                             }
//                      }
//                      int temp = arr[minPos];
//                      arr[minPos] = arr[i];
//                      arr[i] = temp;

//               }

       

//        }

//        public static void printArr(int arr[])
//        {
//               StringBuilder sb = new StringBuilder();
              
//               for(int i = 0; i < arr.length; i++)
//               {
//                      sb.append(arr[i]).append(" ");
//               }
//               System.out.print(sb.toString());
//               System.out.println();
//        }

//        public static void main(String args[])
//        {
//               int arr[] = { 5, 4, 1, 3, 2 ,9 ,49};
//               selectionSort(arr);
//               printArr(arr);
//        }
// }




// Insertion Sort Algorithm
// Worst Case: O(n^2)

// public class sort
// {
//        public static void insertionSort(int arr[])
//        {
//               for(int i = 1; i<arr.length; i++)
//               {
//                      int curr = arr[i];
//                      int prev = i-1;
                     
//                      while(prev >= 0 && arr[prev]>curr)
//                      {
//                             arr[prev+1] = arr[prev];
//                             prev--;
//                      }
//                      arr[prev+1] = curr;
//               }
//        }

//        public static void printArr(int arr[]) 
//        {
//               StringBuilder sb = new StringBuilder();
//               for (int i = 0; i < arr.length; i++) 
//               {
//                      sb.append(arr[i]).append(" ");
//               }
//               System.out.print(sb.toString());
//               System.out.println();
//        }
       
//        public static void main(String args[]) 
//        {
//               int arr[] = { 5, 4, 1, 3, 2 };
//               insertionSort(arr); 
//               printArr(arr);
//        }
// }


// public class sort
// {
//        public static void insertionSort(int arr[])
//        {
//               for(int i = 1; i<arr.length; i++)
//               {
//                      int curr = arr[i];
//                      int prev = i-1;
                     
//                      while(prev >= 0 && arr[prev]>curr)
//                      {
//                             arr[prev+1] = arr[prev];
//                             prev--;
//                      }
//                      arr[prev+1] = curr;
//               }
//        }

//        public static void printArr(int arr[]) 
//        {
//               StringBuilder sb = new StringBuilder();
//               for (int i = 0; i < arr.length; i++) 
//               {
//                      sb.append(arr[i]).append(" ");
//               }
//               System.out.print(sb.toString());
//               System.out.println();
//        }
       
//        public static void main(String args[]) 
//        {
//               int arr[] = { 5, 4, 1, 3, 2 };
//               insertionSort(arr); 
//               printArr(arr);
//        }
// }







// Inbuilt sort function import 

// O(n logn)

// much faster than O(n^2) of Bubble selection and insertion sort

// import java.util.Arrays;
// import java.util.Collections;   //added or reverse order

// public class sort 
// {



       // Method to print the array efficiently
       // public static void printArr(Integer arr[]) {
       //        StringBuilder sb = new StringBuilder();
       //        for (int i = 0; i < arr.length; i++) {
       //               sb.append(arr[i]).append(" ");
       //        }
       //        System.out.print(sb.toString());
       //        System.out.println();
       // }

       // public static void main(String args[]) {
       //        int arr[] = { 5, 4, 1, 3, 2 };
       //        Arrays.sort(arr,2,arr.length); // Calling the sorting function
       //        printArr(arr); // Printing the sorted result
       // }

       // public static void main(String args[]) {
       //        int arr[] = { 5, 4, 1, 3, 2 };
       //        Arrays.sort(arr); // Calling the sorting function
       //        printArr(arr); // Printing the sorted result
       // }

//        public static void main(String args[]) {
//               Integer arr[] = { 5, 4, 1, 3, 2 };
//               Arrays.sort(arr,Collections.reverseOrder()); // Calling the sorting function
//               printArr(arr); // Printing the sorted result
//        }
// }





// Counting Sort: a non-comparison sorting technique

// public class sort
// {
//        public static void countingSort(int arr[])
//        {
//               int max = Integer.MIN_VALUE;

//               // Find maximum element
//               for(int i=0; i<arr.length; i++)
//               {
//                      max = Math.max(arr[i],max);
//               }
              

//               // Frequency array
//               int count[] = new int[max + 1];
//               for(int i=0; i<arr.length; i++)
//               {
//                      count[arr[i]]++;
//               }

//               //Rebuild the sorted array 
//               int j = 0;
//               for(int i=0;i<count.length;i++)
//               {
//                      while(count[i]>0)
//                      {
//                             arr[j] = i;
//                             j++;
//                             count[i]--;
//                      }
//               }
//        }
       
       
//        public static void printArr(int arr[]) 
//        {
//               StringBuilder sb = new StringBuilder();
//               for (int i = 0; i < arr.length; i++) {
//                      sb.append(arr[i]).append(" ");
//               }
//               System.out.print(sb.toString());
//               System.out.println();
//        }
       
//        public static void main(String args[]) 
//        {
//               int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

//               countingSort(arr);
//               printArr(arr);
              
//        }
// }




