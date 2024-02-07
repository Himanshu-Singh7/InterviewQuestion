package MultipleCatch;

public class Main {
   public static void main(String[] args) {
	try {
		int num1 = 10/2;
		System.out.println(num1);
		int nums[] = {10,20,30,40,50};
		System.out.println(nums[7]);
		String name = null;
		System.out.println(name.length());
		
	} catch (ArithmeticException ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
		
	}catch (ArrayIndexOutOfBoundsException ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}catch (NullPointerException ex) {
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}catch(Exception e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Program execution will be must");
	}
 }
}
