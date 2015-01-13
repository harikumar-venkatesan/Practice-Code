package tryouts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Bigger_Greater {

	public Bigger_Greater() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		File file = new File("input.txt");
		
		Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		int T = in.nextInt();
		int z =0;
		int location;
		int length;
		char larger = ' ';
		char smaller = ' ';
        char last = ' ';
		boolean flag = false;
        boolean flag_inner = false;
		String word;
		String small_string;
		StringBuilder small = new StringBuilder("");
		in.nextLine();
		
		while(z++ < T)
		{
			word = in.nextLine();
			
			location = 0;
			length = word.length();
			flag = false;
            flag_inner = false;
			small.delete(0, small.length());
            
			
			for(int i = length-1; i>0; i--)
			{
				if(word.charAt(i) <= word.charAt(i-1))
				{
                    if(i != length-1)
					small.append(word.charAt(i));
          //          System.out.print(small.toString()+" small");
				}
				else
				{
					flag = true;
					location = i-1;
					larger = word.charAt(length-1);
                    last = word.charAt(i);
					smaller = word.charAt(i-1);
					break;				
				}
			}
			if(flag)
			{
			small_string = small.toString();	
			word = word.substring(0, location);
            //System.out.println("sb " + word+" :");
			word = word + larger;
          //  System.out.println(small_string+" smallstring");
                
             if(small_string.length() != 0)
             {
                for(int  i=0; i < small_string.length(); i++)
			     {
			     	if(smaller<small_string.charAt(i) && !flag_inner)
				    {
                        flag_inner = true;
					   word = word + smaller;
				    }
				    word = word + small_string.charAt(i);
			     }
                 if(!flag_inner)
                     {
                     word = word + smaller;
                 }
                 
                 word = word + last;
             }
              else
                   word = word + smaller + last;
			writer.println(word);
			}
			else
				writer.println("no answer");
		}

		
	}

}