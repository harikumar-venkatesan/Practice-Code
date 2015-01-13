package tryouts;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularNumbers {

	static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));
	
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	PrintWriter writer = new PrintWriter("output", "UTF-8");
    	int N = in.read();
        int K = in.read();
        int Q = in.read();
        int z = 0;
        int[] array = new int[N];
        for(int i=0; i<N; i++)
            {
            array[i] = in.read();
        }
        int start = N - K;
        int pos;
        System.out.println("where is the party");
        while(z++ < Q)
            {
            pos = in.read();
            writer.println(array[(start+pos)%N]);
        }
    }
}