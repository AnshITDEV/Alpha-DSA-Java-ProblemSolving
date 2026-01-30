/*Bit Manipulation | Odd or Even | Least Significant Bit
TC: O(1)
SC: O(1)



public class bitManipulation
{
       public static void oddOrEven(int n)
       {
              int bitMask = 1;
              

              if((n & bitMask) == 0)
              {
                     System.out.println("even number");
              }
              else
              {
                     System.out.println("odd number");
              }
       }


       public static void main(String[] args)
       {
              int n;
              oddOrEven(10);
              oddOrEven(7);
       }
}
*/





/*Bit Manipulation | Get i-th Bit | Left Shift
TC: O(1)
SC: O(1)


public class bitManipulation {

       public static void getIthBit(int n, int i) 
       {
              int bitMask = 1 << i;

              if((n & bitMask) == 0)
              {
                     System.out.println("The " + i + "th bit is 0");
              }
              else
              {
                     System.out.println("The " + i + "th bit is 1");
              }
       }

       public static void main(String[] args) {

              int n = 10; // binary: 1010
              int i = 1;

              getIthBit(n, i);
       }
}

*/


/*  Bit Manipulation | Set i-th Bit | Left Shift
TC: O(1)
SC: O(1)


public class bitManipulation
{
       public static int setIthBit(int n, int i)
       {
              int bitMask = 1<<i;

              return n | bitMask;
              
              
       }



       public static void main(String[] args) {

              int n = 10; // binary: 1010
              int i = 2;

              System.out.println(setIthBit(n, i));
       }
}

*/

/* Bit Manipulation | Clear i-th Bit | NOT + AND 

public class bitManipulation {


       public static int clearIthBit(int n, int i)
       {
              int bitMask = ~(1<<i);

              return n & bitMask;
       }

       public static void main(String[] args) {

              int n = 10; // binary: 1010
              int i = 1;

              System.out.println(clearIthBit(n, i));
       }
}

*/


/* Bit Manipulation | Update i-th Bit | Set or Clear Using New Bit 
TC: O(1)
SC: O(1)


public class bitManipulation 
{

       public static int updateIthBit(int n, int i, int newBit)
       {

              //clear the ith bit
              n = n & (~(1<<i));

              int bitMask = newBit<<i;

              return n | bitMask;
              
       }
       

       public static void main(String[] args) 
       {

              int n = 10; // binary: 1010
              int i = 2;
              int newBit = 1;

              System.out.println(updateIthBit(n, i, newBit));
       }
}

*/

/* Bit Manipulation | Clear Last i Bits | Left Shift Mask 
TC: O(1)
SC: O(1)


public class bitManipulation 
{
       public static int clearLastIBits(int n, int i)
       {
              int bitMask = (~0)<<i;
              
              return n & bitMask;
       }



       public static void main(String[] args) {

              int n = 15; // binary: 1111
              int i = 2;

              System.out.println(clearLastIBits(n, i));
       }
}

*/


/* Bit Manipulation | Clear Range of Bits | Masking Technique 
TC: O(1)
SC: O(1)

public class bitManipulation {

       public static int clearRangeOfBits(int n,int i,int j)
       {

              int bitMask1 = (~0)<<j+1;
              int bitMask2 = (1<<i)-1;

              int num = bitMask1 | bitMask2;

              return n & num;
       }

       public static void main(String[] args) {

              int n = 31;  // 11111
              int i = 1;
              int j = 3;

              System.out.println(clearRangeOfBits(n, i, j));  // 10001
       }
}

*/


/* Bit Manipulation | Check Power of 2 | n & (n − 1) 
TC: O(1)
SC: O(1)


soln 1
public class bitManipulation 
{
       public static boolean isPowerOfTwo(int n)
       {
              
              if(n <= 0)
              {
                     return false;
              }
              
              int result = n & (n - 1);

              if(result == 0 )
              {
                     return true;
              }
              else
              {
                     return false;
              }
       }
       

       public static void main(String[] args) {

              System.out.println(isPowerOfTwo(8)); // true
              System.out.println(isPowerOfTwo(10)); // false
       }
}


soln 2
public class bitManipulation 
{
       public static boolean isPowerOfTwo(int n)
       {
              
              if(n <= 0)
              {
                     return false;
              }
              
              return (n & (n - 1)) == 0;


       }
       

       public static void main(String[] args) {

              System.out.println(isPowerOfTwo(8)); // true
              System.out.println(isPowerOfTwo(16)); // false
       }
}

*/





/* Bit Manipulation | Count Set Bits | Brian Algorithm 
TC: O(number of set bits)
SC: O(1)

public class bitManipulation 
{
       public static int countSetBits(int n)
       {
              int count = 0;

              while(n > 0)
              {
                     n = n & (n-1);
                     count++;
              }
              return count;
       }
       
       public static void main(String[] args) 
       {
              int n = 15; // binary: 1010
              System.out.println(countSetBits(n));
       }
}

*/

/* Bit Manipulation | Fast Exponentiation | Binary Exponentiation 
TC:O(log n)
SC:O(1)

public class bitManipulation 
{
       public static int fastExponentiation(int a, int n)
       {
              int result = 1;

              while(n > 0)
              {
                     if((n & 1) != 0)
                     {
                            result = result * a;
                     }

                     a = a * a;
                     n = n >> 1;

              }
              return result;

       }

       public static void main(String[] args)
       {
              System.out.println(fastExponentiation(2, 5)); // 32
              System.out.println(fastExponentiation(3, 4)); // 81
       }
}

*/