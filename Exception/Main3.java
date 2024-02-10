package Exception;
// NumberFormate Exception 
/*When an invalid String to number conversion is done then its give Number formate Exception*/
public class Main3 {
 public static void main(String[] args) {
	try {
		String s = "hjasgyaf";
		int y = Integer.parseInt(s);
		System.out.println(y);
	} catch (NumberFormatException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	System.out.println(100);
 }
}
