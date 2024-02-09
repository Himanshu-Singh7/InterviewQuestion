package StringBuilderVsStringBuilder;

//String --> StringBuffer and StringBuilder

/*String Buffer :-StringBuffer is mutable as well as thread-safe (multiple threads can’t call its methods simultaneously). 
 * Hence, if the content is not fixed and would change frequently but thread-safety is also required then we should use StringBuffer. 
 * StringBuffer is less efficient than StringBuilder as the former is synchronized.*/


/* String Builder : StringBuilder is mutable but not thread-safe (multiple threads can call its methods simultaneously). 
 * Hence, if the content is not fixed and would change frequently but thread-safety is not required then we should use StringBuilder. 
 * StringBuilder is more efficient than StringBuffer as the former is non-synchronized.
 * */

public class StringTest {
  public static void main(String[] args) {
	System.out.println("String:");
	String s = "Himanshu";
	System.out.println(s.hashCode());
	s = s.concat("Singh");
	System.out.println(s.hashCode());
	
	System.out.println("String Builder: ");
	StringBuilder sb = new StringBuilder("Himanshu");
	System.out.println(sb.hashCode());
    sb = sb.append("Singh");
    System.out.println(sb.hashCode());
    
    System.out.println("String Buffer: ");
    StringBuffer sf = new StringBuffer("Himanshu");
    System.out.println(sf.hashCode());
    sf = sf.append("Singh");
    System.out.println(sf.hashCode());
  }
}
