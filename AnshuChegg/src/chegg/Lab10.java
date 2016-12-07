package chegg;

public class Lab10 {

	// Constants
	private final static String NAME = "John Terry"; // replace YOUR NAME with
	// your name
	private final static int STUID = 123456789;
	private final static double GPA1 = 4.00;
	private final static double GPA2 = 2.34;

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// student1 object
		Student stu1;

		stu1 = new Student(NAME, STUID, GPA1);

		System.out.println("Name: " + stu1.getName());
		System.out.println("Id Number: " + stu1.getIdNum());
		System.out.println("GPA : " + stu1.getGPA());
		stu1.setGPA(GPA2);
		System.out.println(stu1 + "\n");
		// student2 object
		Student stu2;
		stu2 = new Student("Trine Thunder", 000000001, 4.0);
		System.out.println("\nName: " + stu2.getName());
		System.out.println("Id Number: " + stu2.getIdNum());
		System.out.println("GPA : " + stu2.getGPA());
		System.out.println(stu2 + "\n");
		// == and equals method Testing
		if (stu1 == stu2) {
			System.out.println("Using == .....");
			System.out.println("Both are same");
		} else {
			System.out.println("Using == .....");
			System.out.println("Both are different.");
		}

		if (stu1.equals(stu2)) {
			System.out.println("Using .equals() method.....");
			System.out.println("Both are same.");
		} else {
			System.out.println("Using .equals() method.....");
			System.out.println("Both are different.");
		}

	}

}
