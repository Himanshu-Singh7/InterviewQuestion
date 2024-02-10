package Exception;

import java.util.ArrayList;

//ArrayIndexOutofBoundsException -->>
/*if new element exceeding the orignal length of array is introduced , it causes ArrayIndexofBoundException*/
public class Main5 {
public static void main(String[] args) {
	ArrayList<String> lis = new ArrayList<>();
    lis.add("My");
    lis.add("Name");
	 try {
		System.out.println(lis.get(3));
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
}
