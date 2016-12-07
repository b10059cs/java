package chegg;

public class HashValueExample {
	/*Customized hash code generation
	 * if generated hash code is negative then we will add MAX_Value of LOng and +18
	 * to output*/
	public  long hash(String string) {
		  long  h = 1L; // prime
		  Long l=new Long(31);
		  /*String length*/
		  int len = string.length();

		  for (int i = 0; i < len; i++) {
		    l = 31*l + string.charAt(i);
		  }
		  if(l<0){
			  return (l+Long.MAX_VALUE+18)%31;
		  }
		  return l%31;
		}
	/*Main method start*/
	public static void main(String[] args) {
		/*Object creation*/
		HashValueExample hashValueExample=new HashValueExample();
		/*String object creation*/
		 String Str1 = new String("hello");
		 String Str2 = new String("booh bear");
		 String Str3 = new String("We the people of the United States in Order to form a more perfect Union");
		/*Printing modulus 31*/
		 System.out.println("Hash Value %31 for "+ Str1 +" is "+ hashValueExample.hash(Str1) );
		 System.out.println("Hash Value %31 for "+ Str2 +" is "+ hashValueExample.hash(Str2));
		 System.out.println("Hash Value %31 for "+ Str3 +" is "+ hashValueExample.hash(Str3) );
	}

}
