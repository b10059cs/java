package chegg;

public class Student {
	// class variables
	private String name;
	private int idNum;
	private double gpa;

	
	  // Constructor
	public Student(String name, int idNum, double gpa) {
		super();
		this.name = name;
		this.idNum = idNum;
		this.gpa = gpa;
	}
	   // Accessor: returns name of student
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNum() {
		return idNum;
	}
	 // Accessor: returns idNum of student
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	 // Accessor: returns GPA of student
	public double getGPA() {
		return gpa;
	}
	   // Mutator: Changes the GPA of the student
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	 // toString method: Returns a formatted string
	   //  of student information.
	   // As shown in sample output.
	@Override
	public String toString() {
		return "Name: " + name + "\nId Number: " + idNum + "\nGPA: " + gpa + "";
	}
	  
	   // implement .equals() method which returns a boolean value
	   //  of student information. When you call this method, 
	   // it should print message as shown in sample output.
	public boolean equals(Student s) {
		// TODO Auto-generated method stub
		return super.equals(s);
	}

	
}
