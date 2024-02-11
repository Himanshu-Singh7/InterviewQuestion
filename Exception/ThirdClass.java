package Exception;
/*Suppose there is three class and each class is independent with each other if exception occure in last class then how to handle it in first class*/
public class ThirdClass {

	public void methodThirdClass() throws Exception {
		
		throw new Exception("Exception occurred in ThirdClass");
	}
}
