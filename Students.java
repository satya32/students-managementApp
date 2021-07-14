package studentsmanagement;

public class Students {
	private int studentId;
	private String firstName;
	private String lastName;
	private String phone;
	private String city;

	public Students(int studentId, String firstName, String lastName, String phone, String city) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.city = city;
		
	}
	//public static void main(String[] args) {

	public Students(String firstName, String lastName, String phone, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.city = city;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", city=" + city + "]";
	}
	
	
		

	}


