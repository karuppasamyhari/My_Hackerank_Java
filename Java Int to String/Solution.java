You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between  -100 to 100 inclusive.

Sample Input 0
100
  
Sample Output 0
Good job
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input_integer = sc.nextInt();
        String output_string;
        try{
            if(input_integer > -100 && input_integer < 100){
                output_string = Integer.toString(input_integer);
            }
            System.out.println("Good job");
        }
        catch(Exception e){
            System.out.println("Wrong answer");
        }
        
    }
}
