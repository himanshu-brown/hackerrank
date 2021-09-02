import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        
        int h1 = (int)s.charAt(0) - '0';
        int h2 = (int)s.charAt(1) - '0';
        int hh = (h1*10 + h2%10);
        String time24 = "";
        
        if(s.charAt(8) == 'A'){
            if(hh == 12){
                for(int i=0; i<2; i++) time24 += 0;
                for(int i=2; i<8; i++) time24 += s.charAt(i);
            }
            else{
                for(int i=0; i<8; i++) time24 += s.charAt(i);
            }
        }
        else{
            if(hh == 12){
                time24 += 1;
                time24 += 2;
                for(int i=2; i<8; i++) time24 += s.charAt(i);
            }
            else{
                hh += 12;
                time24 += (hh/10);
                time24 += (hh%10);
                for(int i=2; i<8; i++) time24 += s.charAt(i);
            }
        }
        
        return time24;

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

