package chegg;

import java.util.Scanner;

public class UNMember {
	/*data member declaration*/
	private String name;
	private int NUID;
	private String netID;
	private String collegeLocation;


	Scanner input=new Scanner(System.in);
	/*Default constructor*/
	public UNMember() {
	}
	/*Parameterized constructor*/
	public UNMember(String name, int nUID, String netID) {
		setName(name);
		setNUID(nUID);
		setNetID(netID);
		setCollegeLocation();
	}
	/*Getter and setter method of data member variable*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNUID() {
		return NUID;
	}
	public void setNUID(int nUID) {
		NUID = nUID;
	}
	public String getNetID() {
		return netID;
	}
	public void setNetID(String netID) {
		this.netID = netID;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation() {
		String collegeLocation;
		/*Prompt for college location*/
		System.out.println("Please Enter the college Location");
		collegeLocation=input.nextLine();
		this.collegeLocation = collegeLocation;
		
	}
	@Override
	public String toString() {
		return "Name:" + name.toUpperCase() + "\nNUID=" + NUID + "\nNetID:" + netID.toUpperCase() + "\nCampus Location:" + collegeLocation.toUpperCase()
		+ "\n";
	}



}
