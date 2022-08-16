
public class Student {
	//by adding private we are encapsulating these variables so that users can not access it directly. Now to access these variable we need a getter method.
	private String name;
	private int age;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
}
