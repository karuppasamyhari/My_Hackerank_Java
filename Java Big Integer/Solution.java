In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format
There will be two lines containing two numbers, a and b.

Constraints
a and b are non-negative integers and can have maximum 200 digits.

Output Format
Output two lines. The first line should contain a+b, and the second line should contain a*b. Don't print any leading zeros.

Sample Input
1234
20

Sample Output
1254
24680
  
Explanation
1234+20 = 1254
1234*20 = 24680

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.math.BigInteger;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        String input1 = scanner.next();
        String input2 = scanner.next();

        // Create a BigInteger object from the user input
        BigInteger bigIntegerVariable1 = new BigInteger(input1);
        BigInteger bigIntegerVariable2 = new BigInteger(input2);


        // Perform some operations with the BigInteger variable
        BigInteger result1 = bigIntegerVariable1.add(bigIntegerVariable2);
        BigInteger result2 = bigIntegerVariable1.multiply(bigIntegerVariable2);

        // Print the result
        System.out.println(result1);
        System.out.println(result2);

        scanner.close();
    }
}



