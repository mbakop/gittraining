package java8;

public class Person {
	private String lasName;
	private String firstName;
	private String age;

	public Person(String lasName, String firstName, String age) {
		super();
		this.lasName = lasName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [lasName=" + lasName + ", firstName=" + firstName + ", age=" + age + "]";
	}
	
}
