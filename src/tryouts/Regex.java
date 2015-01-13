package tryouts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public Regex() {
		// TODO Auto-generated constructor stub
	}

	public int prefixAgain(String str, int n) {
		  
		  String check = "Hari was here";
		  String index = "was	";
		return  check.lastIndexOf(index);
		  
		}
	
	public String plusOut(String str, String word) {
          str = str.replaceAll(word, "+");
//		  System.out.println(str);
//		  int i =0;
//		  StringBuilder strb = new StringBuilder(str);
//		  while(i < str.length())
//		  {
//			  if(str.charAt(i)!= '-')
//			  {
//				 strb.setCharAt(i,'+');
//			  }
//			  i++;
//		  }
//		  str = strb.toString();
//		  str = str.replaceAll("\\-", word);
		  return str;
		}

	public int countTriple(String str) {
		 int count = 0;
		 for(int i=0; i < str.length()-3; i++)
		   {
		    StringBuilder word = new StringBuilder("");
		    word.append(str.charAt(i)).append(str.charAt(i)).append(str.charAt(i));
		    if(word.toString().equals(str.substring(i,i+3)))
		     count ++;
		     
		   } 
		   
		   return count;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Regex r1= new Regex(); 
		System.out.print(r1.countTriple("abcXXXabc"));
		
	}

}