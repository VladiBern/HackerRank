Objective 
In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format

There are  lines of numeric input: 
The first line has a double,  (the cost of the meal before tax and tip). 
The second line has an integer,  (the percentage of  being added as tip). 
The third line has an integer,  (the percentage of  being added as tax).

Output Format

Print The total meal cost is totalCost dollars., where  is the rounded integer result of the entire bill ( with added tax and tip).

Sample Input

12.00
20
8
Sample Output

The total meal cost is 15 dollars.
Explanation

Given: 
, , 

Calculations: 
 
 
 

We round  to the nearest dollar (integer) and then print our result:

The total meal cost is 15 dollars.
Submissions:207533
Max Score:30
Difficulty: Easy
Rate This Challenge:

More
Current Buffer (saved locally, editable)      
Java 8

 
1
import java.util.*;
2
import java.math.*;
3
​
4
public class Arithmetic {
5
​
6
    int tipPercent;
7
    int taxPercent;
8
    double mealCost;
9
    double total;
10
    double tip;
11
    double tax;
12
​
13
   
14
​
15
    //public double tip() {
16
    //    return mealCost * (tipPercent/100);
17
    //}
18
​
19
    //public double tax() {
20
    //    return mealCost * (taxPercent/100);
21
    //}
22
​
23
    //public double void total() {
24
    //    return mealCost + tip + tax;
25
   // }
26
​
27
    public static void main(String[] args) {
28
        Scanner scan = new Scanner(System.in);
29
        double mealCost = scan.nextDouble(); // original meal price
30
        int tipPercent = scan.nextInt(); // tip percentage
31
        int taxPercent = scan.nextInt(); // tax percentage
32
        scan.close();
33
​
34
        public Arithmetic() {
35
        this.tip = mealCost * (tipPercent/100);
36
        this.tax = mealCost * (taxPercent/100);
37
        //total = mealCost + tip + tax;
38
    }
39
        public double total() {
40
            return mealCost + tip + tax;
41
        }
42
        // Write your calculation code here.
43
        //public double void total() {
44
       // return mealCost + tip + tax;
45
    //}
46
    }
47
​
48
         // cast the result of the rounding operation to an int and save it as totalCost
49
    int totalCost = (int) Math.round(total);
50
​
51
    // Print your result
52
        System.out.printf("The total meal cost is &s  dollars", totalCost);
53
}
54
​
