package StringQ;

//--------------------------Create Object Immutability--------------------------- //
import java.util.ArrayList;
import java.util.List;

final public class Student {

	final private String name ;
	final private int studentId;
	final private long percentage;
	
	final private List<String> friends;
	
	
	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	public long getPercentage() {
		return percentage;
	}
   
	
	public List<String> getFriends() {
		List<String> tempList = new ArrayList<>();
		for(String value :friends ) {
			tempList.add(value);
		}
		return tempList;
	}

	public Student(String name, int studentId, long percentage, List<String> friends) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.percentage = percentage;
	//  deepCopy of list : value copy	
		List<String> tempList = new ArrayList<>();
		for(String value :friends ) {
			tempList.add(value);
		}
		this.friends= tempList;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.studentId);
		System.out.println(this.percentage);
		System.out.println(this.friends);
		System.out.println("----------------------------");
	}

//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", studentId=" + studentId + ", percentage=" + percentage + "]";
//	}
	
}
