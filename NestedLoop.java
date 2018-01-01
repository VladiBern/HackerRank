Objective 
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases). 
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solutions {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int S = scan.nextInt();
scan.nextLine();
for (int i = 0; i < S; i++) {
    String myString = scan.nextLine();
    String even = "";
    String odd = "";
    for (int j = 0; j < myString.length(); j++) {
        if (j % 2 == 0) {
            even += myString.charAt(j);
        } else {
            odd += myString.charAt(j);
        }
    }

    System.out.println(even + " " + odd);
}
                                           }
}
