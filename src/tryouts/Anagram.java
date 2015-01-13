package tryouts;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object.*;

public class Anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        String M = in.nextLine();
        int N_len = N.length();
        int M_len = M.length();
        int delete = 0;
        Map<Character, Integer> listing = new HashMap<Character, Integer>();
        
        if(true)
        {
            for(int i=0; i<N_len;i++)
                {
                if(listing.containsKey(N.charAt(i)))
                    {
                    int value = listing.get(N.charAt(i)) + 1;
                    listing.put(N.charAt(i), value);
                }
                else
                    listing.put(N.charAt(i), 1);
            }
            for(int i=0; i<M_len; i++)
                {
                if(listing.containsKey(M.charAt(i)))
                 {
                    int value = listing.get(M.charAt(i)) -1;
                    if(value > -1)
                    listing.put(M.charAt(i), value);
                    if(value == -1)
                    {
                        listing.remove(M.charAt(i));
                        delete +=2;
                    }
                }
                else
                    delete += 1;
            }
            Iterator it = listing.entrySet().iterator();
            while(it.hasNext())
                {
                Map.Entry pairs = (Map.Entry)it.next();
                delete += pairs.getValue();
            }
        }
        System.out.println(delete);
    }
}