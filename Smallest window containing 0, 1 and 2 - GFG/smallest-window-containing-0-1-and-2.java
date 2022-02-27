// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int count_z=-1,count_o=-1,count_t=-1;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
         
            if(S.charAt(i)=='0'){
                count_z=i;
            }
            else if(S.charAt(i)=='1'){
                count_o=i;
            }
        else{
                count_t=i;
        }
        
       if(count_z>-1 && count_o>-1 && count_t>-1){
            result = min(result, max(count_z,max(count_o,count_t)) - min(count_z,min(count_o,count_t))+1);
       }

            
    }
    
    return result==Integer.MAX_VALUE?-1:result;
    
}
public static int min(int num1,int num2){
    return num1>num2?num2:num1;
}
public static int max(int num1,int num2){
    return num1>num2?num1:num2;
}
}
