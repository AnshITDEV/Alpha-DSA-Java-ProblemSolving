

// 1. Print All Subarrays of an Array
// import java.util.*;

// public class array 
// {
//        public static void main(String args[])
//        {
//               Scanner sc = new Scanner(System.in);
              
//               int n = sc.nextInt();
//               int num[] = new int[n];

//               for(int i = 0; i < n; i++)
//               {
//                      num[i] = sc.nextInt();
//               }

//               for(int i = 0; i < num.length; i++)
//               {
//                      int start = i;

//                      for (int j = i; j < num.length; j++) 
//                      {
//                             int end = j;

//                             for (int k = start; k <= end; k++) 
//                             {
//                                    System.out.print(num[k]+" ");
//                             }
//                             System.out.println();
//                      }
//                      System.out.println();
//               }
//               sc.close();
//        }     
// }



// 2. Print All Pairs in an Array + Count Total Pairs

// public class array
// {

//        public static void printPairs(int numbers[])
//        {

              
//               int tp = 0;

//               for(int i=0; i<numbers.length; i++)
//               {
//                      int curr = numbers[i];

//                      for(int j=i+1; j<numbers.length; j++)
//                      {
                            
//                             System.out.print("("+curr+","+numbers[j]+")");
//                             tp++;
//                      }
//                      System.out.println();
//               }
//               System.out.println(tp);



              


//        }

//        public static void main(String args[]) 
//        {
//               int numbers[] = {2,5,7,8,9};
//               printPairs(numbers);
//        }

// }



// ✅ QUESTION 1: LINEAR SEARCH

// public class array
// {

//        public static int Linearsearch(int arr[], int key)
//        {
//               for(int i = 0; i<arr.length; i++)
//               {
//                      if(arr[i]==key)
//                      {
                     
//                             return i;
//                      }

//               }
       
//               return -1;
//        }



//        public static void main(String args[])
//        {
//               int arr[]={2,4,5,7,8,9};
//               int key = 7;
              

//               int result = Linearsearch(arr,key);



//               if(result == -1)
//               {
//                      System.out.println("not found");
                     
//               }
//               else
//               {
//                      System.out.println(result);
//               }
              





//        }
// }




// // 2.Find Largest and Smallest Element in an Array
// import java.util.*;
// public class array
// {

//        public static int getLarSmall(int num[])
//        {
              

//               int lar = Integer.MIN_VALUE;
//               int small = Integer.MAX_VALUE;

//               for(int i=0; i<num.length; i++)
//               {
//                      if(num[i]>lar)
//                      {
//                             lar = num[i];
                            
//                      }
//                      if(num[i]<small)
//                      {
//                             small = num[i];
                            
//                      }
//               }
//               System.out.println("smallest value is : " + small);
//               return lar;
              


//        }

//        public static void main(String args[])
//        {
       
//               int num[] = { 2, 4, 6, 8, 9 };
              
//               System.out.println("largest value is : " +getLarSmall(num));
              
              
//        }
// }



// Binary Search

// public class array
// {
//        public static int binarySearch(int numbers[], int key)
//        {
//               int start = 0;
//               int end = numbers.length-1;

//               while(start<=end)
//               {
//                      int mid =(start+end)/2;
//                      if(numbers[mid]==key)
//                      {
//                             return mid;
//                      }
//                      else if(numbers[mid]<key)
//                      {
                            
//                             start = mid+1;
//                      }
//                      else
//                      {
//                             end = mid-1;
//                      }
//               }
//               return -1;
//        }

//        public static void main(String args[])
//        {
//               int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
//               int key = 4;

//               System.out.println("index for key is : " + binarySearch(numbers, key));
//        }
// }



//  Reverse an Array (In-Place)


// import java.util.*;

// public class array 
// {
//        public static void reverse(int arr[])
//        {
//               int first = 0;
//               int last = arr.length-1;
//               int temp = 0;

//               while(first<last)
//               {
//                      temp = arr[first];
//                      arr[first] = arr[last];
//                      arr[last] = temp;

//                      first++;
//                      last--;
//               }
              
              

//        }



//        public static void main(String args[])
//        {
//               int arr[] = {3,9,2,1,6};
              
//               reverse(arr);

//               for (int i = 0; i < arr.length; i++) {
//                      System.out.print(arr[i]);
//               }
//        }
// }

// Kadane’s Algorithm 
// Goal: Find the maximum sum of a contiguous subarray in a given array.

// O(n)
// O(1)

// public class array
// {

//        public static void kadanes(int arr[])
//        {

//               int maxSum = Integer.MIN_VALUE;
//               int currSum = 0;

//               for (int i = 0; i < arr.length; i++) {
//                      currSum = currSum + arr[i];

//                      if (currSum > maxSum) 
//                      {
//                             maxSum = currSum;
//                      }
//                      if (currSum < 0) 
//                      {
//                             currSum = 0;
//                      }

//               }
//               System.out.println("the maximum sum is "+maxSum);

//        }


//        public static void main(String arg[])
//        {
              
//               int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//               kadanes(arr);
//        }
// }





// Buy and Sell Stock – Max Profit


// public class array 
// {
//        public static int maxProfit(int prices[])
//        {

//               int buy = Integer.MAX_VALUE ;

//               int maxProfit = 0;

//               for(int i=0; i<prices.length; i++)
//               {
//                      if(prices[i]<buy)
//                      {
//                             buy = prices[i];
//                      }
//                      else
//                      {
//                             int Profit = prices[i]-buy;

//                             maxProfit = Math.max(maxProfit,Profit);
//                      }
//               }

//               return maxProfit;

//        }

//        public static void main(String args[])
//        {
//               int prices[] = {7, 1, 5, 3, 6, 4};

//               System.out.println("Maximum profit is: " + maxProfit(prices));
//        }
// }





// Compute total trapped rainwater using left & right max boundaries

// public class array
// {

//        public static int trappedRainwater(int height[])
//        {
//               int L = 0;
//               int R = height.length-1;

//               int leftMax=0;
//               int rightMax=0;

//               int trappedWater=0;

//               while(L<R)
//               {
//                      if(height[L] <= height[R])
//                      {
//                             if(height[L] >= leftMax)
//                             {
//                                    leftMax = height[L];
//                             }
//                             else
//                             {
//                                    trappedWater += leftMax - height[L];
//                             }
//                             L++;
//                      }
//                      else
//                      {
//                             if(height[R] >= rightMax)
//                             {
//                                    rightMax = height[R];
//                             }
//                             else
//                             {
//                                    trappedWater += rightMax - height[R];
//                             }
//                             R--;
//                      }
//               }
//               return trappedWater;
//        }


//        public static void main(String[] args)
//        {
//               int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//               System.out.println(trappedRainwater(height));
//        }
// }

