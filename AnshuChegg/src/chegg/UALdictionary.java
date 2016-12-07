package chegg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UALdictionary {

	Scanner input = new Scanner(System.in);
	Map<String, Employee> dictionary1 = new HashMap<>();
	Map<String, Employee> dictionary2 = new HashMap<>();

	public void readFile() {

		/* Please provide the file path */
		File file = new File("/home/lalchand/chegg/AnshuChegg/src/employee.txt");
		try {
			/* FileReader and BufferedReader for reading file */
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			/*
			 * Reading file line by line using buffered reader as we read one
			 * line we are splitting line by comm and setting values into emp
			 * object
			 */
			while ((line = br.readLine()) != null) {
				Employee emp = new Employee();
				String empData[] = line.split(",");
				emp.setName(empData[0]);
				emp.setAddress(empData[1]);
				emp.setPhoneNumber(empData[2]);
				emp.setSsn(empData[3]);
				emp.setSalary(Double.parseDouble(empData[4]));

				/*
				 * Inserting data into first dictionary and second dictionary in
				 * first dictionary key is ssn in second dictionary key is name
				 */
				dictionary1.put(empData[3], emp);
				dictionary2.put(empData[0], emp);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * This method is used for searching employee data into both dictionary if
	 * record found then it will print employee data otherwise it will print No
	 * record found
	 */
	public void printData() {

		System.out.println("Please Enter name or ssn for searching employee data");
		String key = input.nextLine();
		if (dictionary1.get(key) != null) {
			Employee emp = dictionary1.get(key);
			System.out.println("Employee Name: " + emp.getName() + "\nEmployee Address: " + emp.getAddress()
					+ "\nEmployee Phone Number: " + emp.getPhoneNumber() + "\nEmployee SSN: " + emp.getSsn()
					+ "\nEmployee Salary: " + emp.getSalary());
		} else if (dictionary2.get(key) != null) {
			Employee emp = dictionary2.get(key);
			System.out.println("Employee Name: " + emp.getName() + "\nEmployee Address: " + emp.getAddress()
					+ "\nEmployee Phone Number: " + emp.getPhoneNumber() + "\nEmployee SSN: " + emp.getSsn()
					+ "\nEmployee Salary: " + emp.getSalary());
		} else {
			System.out.println("Employee does not Exist");
		}

	}

	public static void main(String args[]) {

		/* Creating object of UALDictionary class */
		UALdictionary uaLdictionary = new UALdictionary();
		/* Calling method for reading file */
		uaLdictionary.readFile();
		/* Calling PrintData method for printing employee data */
		uaLdictionary.printData();

	}

}
