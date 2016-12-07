package chegg;

public class Parrot {
	/*data member declaration*/
	private String name;

	/*Parameterized constructor with param name*/
	public Parrot(String name) {
		super();
		this.name = name;
	}
	/*Getter method for getting name of parrot*/
	public String getName() {
		return name;
	}
	/*Setter method for setting name of parrot*/
	public void setName(String newName) {
		this.name = newName;
	}
	/*whatDoYouWant method implementation and returning name+ some string*/
	public String whatDoYouWant(){

		return this.name+" wants a cracker";
	}
	/*doIt method implementation */
	public String doIt(String whatToDo){

		return "Pretty "+this.name+" does not "+whatToDo;
	}
	/*main method start*/
	public static void main(String args[]){
		/*variable declaration*/
		String result;
		/*creating instance of Parrot class*/
		Parrot parrot=new Parrot("Charlie");
		/*Calling whatDoYouWant method*/
		System.out.println("********whatDoYouWant method result********");
		result=parrot.whatDoYouWant();
		System.out.println(result);
		/*Calling doIt method */
		System.out.println("********doIt method result*********");
		result=parrot.doIt(" sing ");
		System.out.println(result);

	}
	/*Main method end*/


}
