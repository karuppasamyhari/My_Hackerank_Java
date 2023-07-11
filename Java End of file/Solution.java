import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for(int i= 1; sc.hasNext(); i++){
            String s = sc.nextLine();
            System.out.println(i+" "+s);
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Input (stdin)
Hello world
I am a file
Read me until end-of-file.

Your Output (stdout)
1 Hello world
2 I am a file
3 Read me until end-of-file.
