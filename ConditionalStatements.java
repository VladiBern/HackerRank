Objective 
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0:  
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1:  
 and  is even, so it isn't weird. Thus, we print Not Weird.

Submissions:190255
Max Score:30
Difficulty: Easy
Rate This Challenge:

More
Current Buffer (saved locally, editable)      
Java 8

 
7
import java.io.*;
8
import java.util.*;
9
import java.text.*;
10
import java.math.*;
11
import java.util.regex.*;
12
​
13
public class Solution {
14
​
15
​
16
    public static void main(String[] args) {
17
        Scanner scan = new Scanner(System.in);
18
        int n = scan.nextInt();
19
        scan.close();
20
        String ans = "";
21
​
22
​
23
​
24
​
25
    if(n%2==1)
26
    {
27
       ans = "Weird";
28
    }
29
        else {
30
        if (n >= 2 && n <= 5) {
31
            ans = "Not Weird";
32
        } else if (n >= 6 && n <= 20) {
33
            ans = "Weird";
34
        } else {
35
            ans = "Not Weird";
36
        }
37
    }
38
​
39
   // switch (ans) {
40
        //case (n%2==1):
41
                //System.out.println("Weird");
42
          //  break;
43
      //  case  (n%2==0) && (2 <= n <=5) :
44
           // System.out.println("Not Weird");
45
           // break;
46
        //case (n%2==0) && (6 <= n <=20) :
47
           // System.out.println("Weird");
48
           // break;
49
       // case (n%2==0) && (n>=20) :
50
          //  System.out.println("Not Weird");
51
        //    break;
52
       // }
53
​
54
        System.out.println(ans);
55
    }
56
​
57
}
58
​
