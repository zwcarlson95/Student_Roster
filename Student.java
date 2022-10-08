package Module8;

public class Student implements Comparable<Student> {
	private String name;
	private String address;
	private double GPA;
	
	Student(String name, String address, double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	public Student() {
		name = "";
		address = "";
		GPA = 0.0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	@Override
	public String toString() {
		return "NAME:" + name + " ADDRESS:" + address + " GPA:" + GPA + "\n";
	}

	@Override
	public int compareTo(Student s) {
		return new Double(GPA).compareTo(s.GPA);
	}
	
}
