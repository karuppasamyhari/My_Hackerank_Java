Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format
A single string, s.

Constraints
+ 1 <= length of s <= 4.10^5 
+ s is composed of any of the following: English alphabetic letters, blank spaces, 
  exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format
On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique). 
Next, print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input
He is a very very good boy, isn't he?
  
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
  
Explanation
We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10 such tokens in string s, 
and each token is printed in the same order in which it appears in string s.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        sc.close();
        String [] result_string = input_string.split("[\\s!,?._'@]");
        // for(int i = 0;i<result_string.length; i +=1){
        //     if(!result_string[i].isEmpty()){
        //         System.out.println(result_string[i]);
        //     }
        int size_of_array = result_string.length;
        for(String result1 : result_string){
            if(result1.isEmpty()){
                size_of_array = size_of_array - 1;
            }
        }
        System.out.println(size_of_array);
        for(String result2 : result_string){
            if(!result2.isEmpty()){
                System.out.println(result2);
            }
        }
               
        
    }
}
