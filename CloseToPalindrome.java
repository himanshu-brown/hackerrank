import java.io.*;
import java.util.*;

public class CloseToPalindrome {
    
    public static boolean palindrome(int n){
        int temp=n, rev=0;
            
            while(temp != 0){
                rev = rev*10 + temp%10;
                temp = temp/10;
            }
        if(rev == n) return true;
        else return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int left=0, right=0, i=0,j=0;
            
            if(palindrome(n)) System.out.println(n);
            else{
                i=n-1;
                for(;;){
                    left++;
                    if(palindrome(i)) break;
                    i--;
                }
                j=n+1;
                for(;;){
                    right++;
                    if(palindrome(j)) break;
                    j++;
                }
                
                if(left <= right) System.out.println(i);
                else System.out.println(j);
            }
            
        }catch(Exception e){
            return;
        }
    }
}
