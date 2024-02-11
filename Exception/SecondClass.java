package Exception;
/*Suppose there is three class and each class is independent with each other if exception occure in last class then how to handle it in first class*/
public class SecondClass {

	private ThirdClass thirdClass;

	public SecondClass() {
	   this.thirdClass = new ThirdClass();
	}
	
	public void methodSecondClass() throws Exception {
		try {
			thirdClass.methodThirdClass();
		} catch (Exception e) {
			System.out.println("Exception caught in SecondClass: " + e.getMessage());
			throw e;
		}
	}
	
}
