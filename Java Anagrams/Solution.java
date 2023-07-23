Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:
+ string a: the first string
+ string b: the second string
  
Returns
+ boolean: a and b are case-insensitive anagrams, return true. Otherwise, return false.
  
Input Format:
The first line contains a string a.
The second line contains a string b.

Constraints
+ 1 <= length (a), <= length(b) <= 50.
+ Strings  and  consist of English alphabetic characters.
+ The comparison should NOT be case sensitive.
  
Sample Input 0
anagram
margana

Sample Output 0
Anagrams

Sample Input 1
anagramm
marganaa
  
Sample Output 1
Not Anagrams

-------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        // System.out.println(A);
        // System.out.println(B);
        String one = A.toLowerCase();
        String two = B.toLowerCase();
        
        if(anagram_function(one,two)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
        public static boolean anagram_function(String first_string,String second_string){
            
            
            if(first_string.length() == second_string.length()){
                char [] first_array = first_string.toCharArray();
                char [] second_array = second_string.toCharArray();
                Arrays.sort(first_array);
                Arrays.sort(second_array);
                
                return Arrays.equals(first_array,second_array);
                    
                }
                else{
                    return false;
                }
            
        }
    
    
}
