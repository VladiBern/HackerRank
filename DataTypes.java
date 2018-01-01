Objective
        Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

        Task
        Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

        Declare  variables: one of type int, one of type double, and one of type String.
        Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
        Use the  operator to perform the following operations:
        Print the sum of  plus your int variable on a new line.
        Print the sum of  plus your double variable to a scale of one decimal place on a new line.
        Concatenate  with the string you read as input and print the result on a new line.
        Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

        Input Format

        The first line contains an integer that you must sum with .
        The second line contains a double that you must sum with .
        The third line contains a string that you must concatenate with .

        Output Format

        Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

        Sample Input

        12
        4.0
        is the best place to learn and practice coding!
        Sample Output

        16
        8.0
        HackerRank is the best place to learn and practice coding!
        Explanation

        When we sum the integers  and , we get the integer .
        When we sum the floating-point numbers  and , we get .
        When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

        You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.

        Submissions:241005
        Max Score:30
        Difficulty: Easy
        Rate This Challenge:

        More
        Current Buffer (saved locally, editable)
        Java 8


        1
        import ↔;
        6
        ​
        7
public class Solution {
8

        9
    public static void main(String[] args) {
        10
        int i = 4;
        11
        double d = 4.0;
        12
        String s = "HackerRank ";
        13

        14
        Scanner scan = new Scanner(System.in);

        15
        /* Declare second integer, double, and String variables. */
        16
        int a  = scan.nextInt();
        17
        double b = scan.nextDouble();
        18

        19
​
        20
        scan.nextLine();
        21
        String c = scan.nextLine();
        22
                /* Read and save an integer, double, and String to your variables.*/
        23
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        24
        System.out.println(i + a);
        25
        System.out.println(d + b);
        26
        System.out.println(s + c);
        27
​
        28

        29
        /* Print the sum of both integer variables on a new line. */
        30
​
        31
        /* Print the sum of the double variables on a new line. */
        32

        33
        /* Concatenate and print the String variables on a new line; 
34
            the 's' variable above should be printed first. */
        35
​

        36
        scan.close();
        37
    }
38
}
