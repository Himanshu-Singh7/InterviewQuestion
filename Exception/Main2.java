package Exception;
// Runtime Exception --> Unchecked Exception 

/*Whenever invalid mathematics operation is performed such as dividing a number is zero*/
public class Main2 {
 public static void main(String[] args) {
	try {
		int x = 10/0;
		
	} catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println("An error occurred: " + e.getMessage());
	}
 }
}
