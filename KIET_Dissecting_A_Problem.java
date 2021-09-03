import java.io.*;
import java.util.*;

public class KIET_Dissecting_A_Problem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] cost = new int[N];
            
            for(int i=0; i<N; i++)
                cost[i] = scan.nextInt();
            
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i<N; i++)
                max = Math.max(cost[i],max);
            
            System.out.println(max);
            
        }catch(Exception e){
            return;
        }
    }
}
