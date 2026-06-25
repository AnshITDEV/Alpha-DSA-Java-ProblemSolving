/* 

## Strings - Index

| Sr. No. | Program                                               | Time Complexity | Space Complexity |
| :-----: | ----------------------------------------------------- | :-------------: | :--------------: |
|    1    | String Basics (Input, Output, `length()`, `charAt()`) |     **O(N)**    |     **O(1)**     |
|    2    | String Immutability                                   |     **O(1)**    |     **O(1)**     |
|    3    | Check Palindrome String                               |     **O(N)**    |     **O(1)**     |
|    4    | Shortest Path                                         |     **O(N)**    |     **O(1)**     |
|    5    | Difference Between `==` and `.equals()`               |    **O(1)***    |     **O(1)**     |
|    6    | Manual Substring                                      |     **O(N)**    |     **O(N)**     |
|    7    | Built-in `substring()`                                |     **O(N)**    |     **O(N)**     |
|    8    | Find Largest String (Lexicographically)               |     **O(N)**    |     **O(1)**     |
|    9    | StringBuilder Basics                                  |     **O(N)**    |     **O(N)**     |
|    10   | Capitalize First Letter of Every Word                 |     **O(N)**    |     **O(N)**     |
|    11   | String Compression                                    |     **O(N)**    |     **O(N)**     |

> **Note:** `==` compares **references** in **O(1)** time, whereas `.equals()` compares **characters**, which is **O(N)** in the worst case.

---

## Complexity Summary

| Complexity     | Programs                                                                                                                                                                                               |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **O(1)**       | String Immutability, `==` (Reference Comparison)                                                                                                                                                       |
| **O(N)**       | String Basics, Palindrome String, Shortest Path, `.equals()` (Worst Case), Manual Substring, Built-in `substring()`, Largest String, StringBuilder Basics, Capitalize First Letter, String Compression |
| **O(1) Space** | String Basics, String Immutability, Palindrome String, Shortest Path, Largest String, `==` / `.equals()`                                                                                               |
| **O(N) Space** | Manual Substring, Built-in `substring()`, StringBuilder Basics, Capitalize First Letter, String Compression                                                                                            |








// ------------------------------------------------------------
// String Basics (Input, Output, length(), charAt())
//
// TC: O(N)
// Reason: Printing each character requires traversing the string once.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class Strings {

       public static void printLetter(String name) {

              for(int i = 0; i < name.length(); i++) {
                     System.out.print(name.charAt(i) + " ");
              }

              System.out.println();
       }

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              String name = sc.nextLine();

              System.out.println(name);

              String fullName = "Tony Stark";
              System.out.println(fullName.length());

              String firstName = "Shraddha";
              String lastName = "Khapra";

              String completeName = firstName + " " + lastName;

              System.out.println(completeName.charAt(9));

              printLetter(name);

              sc.close();
       }
}

// ------------------------------------------------------------
// String Immutability
//
// TC: O(1)
// Reason: Only constant-time string assignments and printing.
//
// SC: O(1)
// Reason: Uses only a few string variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class Strings {

       public static void main(String args[]) {

              char arr[] = { 'a', 'b', 'c', 'd' };
              System.out.println(arr);

              String str = "a b c d";
              System.out.println(str);

              String str2 = new String("xyz");

              // New object is created because Strings are immutable
              str2 = "zxy";

              System.out.println(str2);

              Scanner sc = new Scanner(System.in);

              str2 = sc.nextLine();

              System.out.println(str2);

              sc.close();
       }
}

// ------------------------------------------------------------
// Check Palindrome String
//
// TC: O(N)
// Reason: Two pointers traverse the string only once.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class Strings {

       public static boolean palindrome(String str) {

              int left = 0;
              int right = str.length() - 1;

              while (left < right) {

                     if (str.charAt(left) != str.charAt(right)) {
                            return false;
                     }

                     left++;
                     right--;
              }

              return true;
       }

       public static void main(String args[]) {

              String str1 = "noon";
              String str2 = "ansh";

              System.out.println(palindrome(str1));
              System.out.println(palindrome(str2));
       }
}

// ------------------------------------------------------------
// Shortest Path
//
// TC: O(N)
// Reason: Traverses the path string only once.
//
// SC: O(1)
// Reason: Uses only x and y coordinates.
// ------------------------------------------------------------

public class Strings {

       public static float getShortestPath(String path) {

              int x = 0;
              int y = 0;

              for (int i = 0; i < path.length(); i++) {

                     char dir = path.charAt(i);

                     if (dir == 'W') {
                            x++;
                     } else if (dir == 'E') {
                            x--;
                     } else if (dir == 'N') {
                            y++;
                     } else {
                            y--;
                     }
              }

              return (float) Math.sqrt(x * x + y * y);
       }

       public static void main(String args[]) {

              String path = "WNEENESENNN";

              System.out.println(getShortestPath(path));
       }
}



// ------------------------------------------------------------
// Difference Between == and .equals()
//
// TC: O(1)
// Reason: Reference comparison (==) is constant time. Content comparison
// using .equals() is O(N) in the worst case.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class Strings {

       public static void main(String args[]) {

              String s1 = "ansh";
              String s2 = "ansh";
              String s3 = new String("ansh");

              if (s1 == s3) {
                     System.out.println("Strings are equal using ==");
              } else {
                     System.out.println("Strings are NOT equal using ==");
              }

              if (s1 == s2) {
                     System.out.println("Strings are equal using ==");
              } else {
                     System.out.println("Strings are NOT equal using ==");
              }

              if (s1.equals(s3)) {
                     System.out.println("Strings are equal using .equals()");
              } else {
                     System.out.println("Strings are NOT equal using .equals()");
              }
       }
}

// ------------------------------------------------------------
// Substring (Manual)
//
// TC: O(N)
// Reason: Copies each character from the given range once.
//
// SC: O(N)
// Reason: A new substring is created.
// ------------------------------------------------------------

public class Strings {

       public static String subString(String str, int si, int ei) {

              String subString = "";

              for (int i = si; i <= ei; i++) {
                     subString += str.charAt(i);
              }

              return subString;
       }

       public static void main(String args[]) {

              String str = "Hello World";

              System.out.println(subString(str, 0, 3));
       }
}

// ------------------------------------------------------------
// Substring (Built-in)
//
// TC: O(N)
// Reason: Java creates a new substring by copying characters.
//
// SC: O(N)
// Reason: A new substring object is created.
// ------------------------------------------------------------

public class Strings {

       public static void main(String args[]) {

              String str = "Hello World";

              System.out.println(str.substring(0, 4));
       }
}

// ------------------------------------------------------------
// Find Largest String (Lexicographically)
//
// TC: O(N)
// Reason: Traverses the string array once.
//
// SC: O(1)
// Reason: Uses only one extra reference variable.
// ------------------------------------------------------------

public class Strings {

       public static void main(String args[]) {

              String fruits[] = { "Mango", "Banana", "Kiwi" };

              String largest = fruits[0];

              for (int i = 1; i < fruits.length; i++) {

                     if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                            largest = fruits[i];
                     }
              }

              System.out.println(largest);
       }
}

// ------------------------------------------------------------
// StringBuilder Basics
//
// TC: O(N)
// Reason: Appends each character once.
//
// SC: O(N)
// Reason: StringBuilder stores all appended characters.
// ------------------------------------------------------------

public class Strings {

       public static void main(String args[]) {

              StringBuilder sb = new StringBuilder("");

              for (char ch = 'a'; ch <= 'z'; ch++) {
                     sb.append(ch);
              }

              System.out.println(sb);
              System.out.println(sb.length());
       }
}



// ------------------------------------------------------------
// Capitalize First Letter of Every Word
//
// TC: O(N)
// Reason: Traverses the string once and processes each character.
//
// SC: O(N)
// Reason: Uses a StringBuilder to store the new string.
// ------------------------------------------------------------

public class Strings {

       public static String toUpperCase(String str) {

              StringBuilder sb = new StringBuilder();

              sb.append(Character.toUpperCase(str.charAt(0)));

              for (int i = 1; i < str.length(); i++) {

                     if (str.charAt(i) == ' ' && i < str.length() - 1) {

                            sb.append(str.charAt(i));
                            i++;
                            sb.append(Character.toUpperCase(str.charAt(i)));
                     } else {
                            sb.append(str.charAt(i));
                     }
              }

              return sb.toString();
       }

       public static void main(String args[]) {

              String str = "hi i am shraddha";

              System.out.println(toUpperCase(str));
       }
}

// ------------------------------------------------------------
// String Compression
//
// TC: O(N)
// Reason: Each character is visited only once.
//
// SC: O(N)
// Reason: A new compressed string is created.
// ------------------------------------------------------------

public class Strings {

       public static String compress(String str) {

              String newStr = "";

              for (int i = 0; i < str.length(); i++) {

                     int count = 1;

                     while (i < str.length() - 1 &&
                                   str.charAt(i) == str.charAt(i + 1)) {

                            count++;
                            i++;
                     }

                     newStr += str.charAt(i);

                     if (count > 1) {
                            newStr += count;
                     }
              }

              return newStr;
       }

       public static void main(String args[]) {

              String str = "AAABBCCCDD";

              System.out.println(compress(str));
       }
}



*/


