/* Divide and Conquer — Merge Sort Algorithm
TC: O(n log n)
SC: O(n)



public class divideConquer
{

       public static void mergeSort(int arr[], int si, int ei)
       {
              if(si >= ei)
              {
                     return;
              }

              int mid = si + (ei-si)/2;


              
              //left
              mergeSort(arr,si,mid);

              //right
              mergeSort(arr,mid+1,ei);

              merge(arr, si, mid, ei);

       }


       public static void merge(int arr[], int si, int mid, int ei)
       {
              int temp[] = new int[ei-si+1];

              int i = si;
              int j = mid+1;
              int k = 0;

              while( i<=mid && j<=ei)
              {
                     if(arr[i] < arr[j])
                     {
                            temp[k++] = arr[i++];
                     }
                     else
                     {
                            temp[k++] = arr[j++];
                     }
              }

              while( i<=mid)
              {
                     temp[k++] = arr[i++];
              }

              while(j<=ei)
              {
                     temp[k++] = arr[j++];
              }

              for(i=si, k=0; k<temp.length; i++,k++)
              {
                     arr[i] = temp[k];
              }
       }

       public static void main(String args[])
       {
              int arr[] = {2,6,8,3,9,7};
              mergeSort(arr,0,arr.length-1);

              for(int i = 0; i<arr.length; i++)
              {
                     System.out.print(arr[i]);
              }
       }
}


*/



/* Divide & Conquer | Quick Sort 

TC: O(n log n) average
TC: O(n^2) worst
SC: O(1)



public class divideConquer
{
       public static void quickSort(int arr[], int si, int ei)
       {
              if(si>=ei)
              {
                     return;
              }

              int pIdx = partition(arr,si,ei);

              //left
              quickSort(arr,si,pIdx-1);

              //right
              quickSort(arr,pIdx+1,ei);

       }


       public static int partition(int arr[], int si, int ei)
       {
              int pivot = arr[ei];
              int i = si-1;

              for(int j = si; j < ei; j++)
              {
                     if(arr[j] <= pivot)
                     {
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


       public static void main(String args[])
       {
              int arr[] = {3,5,2,7,8,9};

              quickSort(arr,0,arr.length-1);

              for(int i=0; i<arr.length; i++)
              {
                     System.out.print(arr[i]+" ");
              }
              System.out.println();
       }
}

*/


/* Divide & Conquer | Modified Binary Search | Rotated Sorted Array
TC: O(log n)
SC: O(log n)




public class divideConquer
{
       public static int binSearch(int arr[], int target)
       {

              int si = 0;
              int ei = arr.length-1;

              while(si <= ei)
              {

              int mid = si + (ei-si)/2;

              if(arr[mid] == target)
              {
                     return mid;
              }

              if(arr[si]<=arr[mid])
              {
                     if(arr[si] <= target && target < arr[mid])
                     {
                            ei = mid-1;
                     }
                     else
                     {
                            si = mid+1;
                     }
              }
              else
              {
                     //right
                     if(arr[mid] <= target && target < arr[ei])
                     {
                            si = mid+1;
                     }
                     else
                     {
                            ei = mid-1;
                     }
              }


              }

              return -1;
       }



       public static void main(String args[])
       {
              
              int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
              int target = 0;

              System.out.println(binSearch(arr,target));
       }
}

*/



