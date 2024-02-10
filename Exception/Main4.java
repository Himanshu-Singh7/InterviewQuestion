package Exception;
// Nullpointer Exception -->
/*Whenever with null reference variable we access non staic variable its gives Nullpointer Exception*/
public class Main4 {
	static Main4 main;
	int x =10;
 public static void main(String[] args) {
	try {
		System.out.println(main.x);
	} catch (NullPointerException e) {
		e.printStackTrace();
	}
	System.out.println(1000);
}
}
