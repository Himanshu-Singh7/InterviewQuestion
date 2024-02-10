package Exception;
/*What is exception and how to handle exception in java ? */

class MyException extends Exception{
   String str1 ;
    MyException(String str2){
	   
    	str1 = str2;
   }
	@Override
	public String toString() {
		return "MyException [str1=" + str1 + "]";
	}
   
}

public class Main1 {
   public static void main(String[] args) {
	
	try {
		System.out.println("Start of try block");
		throw new MyException("error message");
		
	} catch (MyException es) {
		System.out.println("Catch block");
		System.out.println(es.getMessage());
		System.out.println(es);
		
	}
}
 
}
