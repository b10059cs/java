package chegg;

import java.text.DecimalFormat;

public class UNStaff extends UNMember{
	/*Member data variable declaration*/
	private String position;
	private double wage;
	/*Parameterized constructor*/
	public UNStaff(String position, double wage,String name,int NUID,String netID) {
		super(name,NUID,netID);
		setPosition(position);
		setWage(wage);
	}
	/*Getter and Setter method of data member variable*/
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		if(position.equals("")|| position==null){
			this.position="NOT SET";
		}else{
			this.position = position;
		}

	}
	public double getWage() {
		return wage;
	}
	/*Set wage , if wage less then 9 then we are setting it to -1*/
	public void setWage(double wage) {
		if(wage<9){
			this.wage=-1;
		}else{
			this.wage = wage;
		}
	}
	/*ToString method*/
	@Override
	public String toString() {
		String result="Position:" + position.toUpperCase() + "\n";
		if(this.wage==-1){
			result+="Wage:NOT SET";
		}else{
			result+="Wage:$"+new DecimalFormat("##.00").format(this.wage);
		}
		return super.toString()+result;
	}

	public static void main(String args[]){

		
		UNStaff staff=new UNStaff("secretary", 50.6, "David", 123, "UN123");
		UNStaff staff1=new UNStaff("cleark", 8, "Sam", 129, "UN129");
		System.out.println("**************");
		System.out.println(staff.toString());
		System.out.println("**************");
		System.out.println(staff1.toString());
	}

}
