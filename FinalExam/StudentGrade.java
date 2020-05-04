public class StudentGrade {
	
	String ssn;
	String firstName;
	String lastName;
	String courseId;
	String grade;
	
	
	public StudentGrade(String ssn, String firstName, String lastName, String courseId, String grade) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseId = courseId;
		this.grade = grade;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
