You are given a class Solution and its main method in the editor.
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.

Note: Your add method in the Add class must print the sum as given in the Sample Output

Input Format
There are six lines of input, each containing an integer.

Output Format
There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.

Sample Input
1
2
3
4
5
6
  
Sample Output
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

class Add{
    public void add(int ...arr){
        int sum = 0;
        String result = "";
        for(int n : arr){
            sum += n;
            result += n + "+";
        }
        System.out.println(result.substring(0,result.length()-1)+"="+sum);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[6];
        for(int i  = 0; i < arr.length; i += 1){
            arr[i] = sc.nextInt();
        }
        Add obj = new Add();
        obj.add(arr[0], arr[1]);
        obj.add(arr[0], arr[1], arr[2]);
        obj.add(arr[0], arr[1], arr[2], arr[3], arr[4]);
        obj.add(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
    }
}
