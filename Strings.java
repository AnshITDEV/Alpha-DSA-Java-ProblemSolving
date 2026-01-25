// Strings are immutable → once created, their value cannot be changed.

// import java.util.*;

// public class Strings 
// {
//        public static void printLetter(String Name)
//        {
//               for(int i=0; i<Name.length(); i++)
//               {
//                      System.out.print(Name.charAt(i)+" ");
//               }
//               System.out.println();

//        }

       


//        public static void main(String arg[])
//        {
//               Scanner sc = new Scanner(System.in);

//               String Name;

//               Name = sc.nextLine();
//               System.out.println(Name);

//               String fullName = "Tony Stark";
//               System.out.println(fullName.length());

//               String firstName = "Shraddha";
//               String lastName = "Khapra";
//               String completeName = firstName+" "+lastName;

//               System.out.println(completeName.charAt(9));
//               printLetter(Name);
              
//               sc.close();
//        }
       
// }

// import java.util.*;

// public class Strings 
// {

//        public static void main(String arg[])
//        {
//               char arr[] = { 'a', 'b', 'c', 'd'};
//               System.out.println(arr);

//               String str = "a b c d";
//               System.out.println(str);

//               String str2 = new String("xyz");
//               str2 = "zxy";
//               System.out.println(str2);

//               Scanner sc = new Scanner(System.in);

//               str2 = sc.nextLine();
//               System.out.println(str2);

//               sc.close();
              
//        }
              
// }



// Check if a string is a palindrome using two pointers
// ⏱️ Time Complexity
// O(n) — each character checked once
// 📦 Space Complexit
// O(1) — no extra space used

// public class Strings
// {


//        public static boolean palindrome(String str)
//        {

//               int j = str.length()-1;
//               int i = 0;

//               while(i < j)
//               {
//                      if(str.charAt(i) != str.charAt(j))
//                      {
//                             return false;
//                      }
//                      i++;
//                      j--;
//               }
//               return true;
//        }

//        public static void main(String[] args)
//        {
//               String str1 = "noon";
//               String str2 = "ansh";

//               System.out.println(palindrome(str1));
//               System.out.println(palindrome(str2));
//        }
// }








// Compute shortest path from a route string using net displacement (E/W, N/S)
// O(n)
// O(1)

// public class Strings
// {

//        public static float getShortestPath(String path)
//        {

//               int x = 0;
//               int y = 0;


//               for(int i = 0; i < path.length(); i++)
//               {
//                      char dir = path.charAt(i);
//                      if(dir == 'W')
//                      {
//                             x++;
//                      }else if (dir == 'E')
//                      {
//                             x--;
//                      }else if (dir == 'N')
//                      {
//                             y++;
//                      }else
//                      {
//                             y--;
//                      }
//               }

//               return (float)Math.sqrt(x*x + y*y);
              
//        }

//        public static void main(String[] args)
//        {
//               String path = "WNEENESENNN";
//               System.out.println(getShortestPath(path));

//        }

// }



// Difference between == (reference comparison) and .equals() (content comparison) in Strings.


// public class Strings
// {
//        public static void main(String[] args)
//        {
//               String s1 = "ansh";
//               String s2 = "ansh";
//               String s3 = new String("ansh");

//               if(s1 == s3)
//               {
//                      System.out.println("Strings are equal using ==");
//               }
//               else
//               {
//                      System.out.println("Strings are NOT equal using ==");
//               }


//               if (s1 == s2)
//               {
//                      System.out.println("Strings are equal using ==");
//               }
//               else
//               {
//                      System.out.println("Strings are NOT equal using ==");
//               }


//               if(s1.equals(s3))
//               {
//                      System.out.println("Strings are equal  ");
//               }
//               else
//               {
//                      System.out.println("Strings are NOT equal ");
//               }

//        }
// }


// Substring of a string
// Time Complexity: O(n)

// public class Strings 
// {
//        public static String subString(String str,int si, int ei)
//        {
//               String subString = " ";
//               for(int i = si; i <= ei; i++)
//               {
//                      subString = subString + str.charAt(i);
//               }
//               return subString;
//        }

//        public static void main(String[] args)
//        {
//               String str = "Hello World";
//               System.out.println(subString(str,0,3));
//        }
// }

// OPTIMIZED WAY 
// import java.util.*;

// public class Strings 
// {
//        public static void main(String[] args)
//        {
//               String str = "Hello World";
//               System.out.println(str.substring(0,4));
//        }
// }


// Find Largest String (Lexicographically)
// Time Complexity: O(n)

// public class Strings
// {
//        public static void main(String[] args) 
//        {
//               String fruits[] = {"Mango","Banana","kiwi"};

//               String largest = fruits[0];

//               for(int i = 1; i < fruits.length; i++)
//               {
//                      if(largest.compareToIgnoreCase(fruits[i]) < 0)
//                      {
//                             largest = fruits[i];
//                      }
//               }

//               System.out.println(largest);

//        }
// }

// **Print the length of a StringBuilder after appending characters from ‘a’ to ‘z’.**

// public class Strings
// {
//        public static void main(String[] args)
//        {
//               StringBuilder sb = new StringBuilder("");

//               for(char ch = 'a'; ch <= 'z'; ch++)
//               {
//                      sb.append(ch);

//               }
//               System.out.println(sb.length());
//        }
// }






// Strings | StringBuilder | Capitalize First Letter of Each Word
// Time Complexity: O(n)

// public class Strings
// {

//        public static String toUpperCase(String str)
//        {
//               StringBuilder sb = new StringBuilder();

//               sb.append(Character.toUpperCase(str.charAt(0)));
              
//               for(int i = 1; i < str.length(); i++)
//               {
//                      if(str.charAt(i) == ' ' && i < str.length()-1)
//                      {
//                             sb.append(str.charAt(i));
//                             i++;
//                             sb.append(Character.toUpperCase(str.charAt(i)));
//                      }
//                      else
//                      {
//                             sb.append(str.charAt(i));
//                      }
//               }
//               return sb.toString();
//        }

//        public static void main(String arg[])
//        {
//               String str = "hi i am shraddha";
//               System.out.println(toUpperCase(str));
//        }
// }






// Strings | String Compression | Frequency Encoding
// O(n)

// public class Strings
// {
//        public static String compress(String str)
//        {
//               String newStr = "";
              
//               for(int i = 0; i < str.length(); i++)
//               {
//                      int count = 1;

//                      while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
//                      {
//                             count++;
//                             i++;
//                      }

//                      newStr = newStr + str.charAt(i);

//                      if(count > 1)
//                      {
//                             newStr = newStr + count;
                     
//                      }
//               }
//               return newStr;
//        }

//        public static void main(String[] args)
//        {
//               String str = "AAABBCCCDD";
//               System.out.println(compress(str));
//        }
// }


