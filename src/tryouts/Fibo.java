package tryouts;
import java.io.*;
public class Fibo {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String sentence = "Alice likes cats";
        String split[] = sentence.split(" ");
        int count = 1;
        for(int i=0; i<sentence.length(); i++)
        	if(sentence.charAt(i) == ' ')
        	{
        		count ++;
        	}
        String rev_sentence = "";
        System.out.println(count);
        rev_sentence += split[count-1];
        for(int i=count-2; i>=0; i--)
        {
        	rev_sentence=rev_sentence+" "+split[i];
        }
       // System.out.println(rev_sentence);
        
        System.out.println(split.length);
    }
}