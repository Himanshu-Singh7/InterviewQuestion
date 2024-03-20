package StringQuestion;
import java.util.*;
public class CountNumberOfWord {
 public static void main(String[] args) {
	
	 String sentence = "This is a sample sentence";
	    int wordCount = 0;

	    for (int i = 0; i < sentence.length(); i++) {
	      if (sentence.charAt(i) == ' ') {
	        wordCount++;
	      }
	    }

	    System.out.println("The number of words in the sentence is: " + wordCount);
 }
}
