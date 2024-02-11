package Exception;
/*Suppose there is three class and each class is independent with each other if exception occure in last class then how to handle it in first class*/
public class FirstClass {
    
  private SecondClass secondClass;
  
  public FirstClass() {
	  this.secondClass = new SecondClass();
  }

  public void methodInFirstClass() {
	try {
		secondClass.methodSecondClass();
	} catch (Exception e) {
		System.out.println("Exception caught in FirstClass: " + e.getMessage());
	}  
  }

 public static void main(String[] args) {
	FirstClass firstClass = new FirstClass();
	firstClass.methodInFirstClass();
  }
}
