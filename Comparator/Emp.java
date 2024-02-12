package Comparator;

public class Emp {
   private int id ;
   private String name ;
   private String phone;

   public Emp(int id, String name, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
 }

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getPhone() {
	return phone;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setPhone(String phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}
   
   
}
