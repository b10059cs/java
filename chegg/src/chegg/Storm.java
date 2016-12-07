package chegg;

public class Storm {

	  private int stormYear;
	   private int stormMag;
	   private String stormStart;
	   private String stormEnd;
	   private String stormName;
	  
	   /**
	   * Constructor
	   * Storing all variables from text file
	   * @param stormName
	   * @param stormYear
	   * @param stormStart
	   * @param stormEnd
	   * @param stormMag
	   */
	   public Storm(String stormName, int stormYear, String stormStart, String stormEnd, int stormMag) {
	   this.stormName = stormName;
	   this.stormYear = stormYear;
	   this.stormStart = stormStart;
	   this.stormEnd = stormEnd;
	   this.stormMag = stormMag;
	   }


	   /**************************************************************/
	   /*Method: Get and Set */
	   /*Purpose: They serve to set&get values from class variables */
	   /*Parameters: */
	   /*String target: Storm Name */
	   /*Return: Storm Name */
	   /**************************************************************/
	   public String getStormName() {
	   return stormName;
	   }

	   /**
	   * @param stormName the stormName to set
	   */
	   public void setStormName(String stormName) {
	   this.stormName = stormName;
	   }

	   /**
	   * @return the stormYear
	   */
	   public int getStormYear() {
	   return stormYear;
	   }

	   /**
	   * @param stormYear the stormYear to set
	   */
	   public void setStormYear(int stormYear) {
	   this.stormYear = stormYear;
	   }

	   /**
	   * @return the stormStart
	   */
	   public String getStormStart() {
	   return stormStart;
	   }

	   /**
	   * @param stormStart the stormStart to set
	   */
	   public void setStormStart(String stormStart) {
	   this.stormStart = stormStart;
	   }

	  
	   //return the stormEnd
	   public String getStormEnd() {
	   return stormEnd;
	   }

	  
	   //param stormEnd the stormEnd to set
	   public void setStormEnd(String stormEnd) {
	   this.stormEnd = stormEnd;
	   }


	   //return the stormMag
	   public int getStormMag() {
	   return stormMag;
	   }

	   /**
	   * @param stormMag the stormMag to set
	   */
	   public void setStormMag(int stormMag) {
	   this.stormMag = stormMag;
	   }

	   /**************************************************************/
	   /*Method:String toString */
	   /*Purpose: convert to a string */
	   /*Parameters: */
	   /*String target: Storm Name */
	   /*Return: Storm Name */
	   /**************************************************************/
	   public String toString() {
	String s = "\n" + getStormYear() + "/ " + getStormName() + " " ;
	   if(getStormMag() == -1){
	s= s + "(no info)";
	   }
	   else {
	if((getStormMag() == 0)){
	   s = s + "(tropical storm)";
	   }
	   else{
	   s = s + "(hurricane level " + getStormMag() + ")";
	   }
	   if(getStormStart().equals("")){
	s = s + "(no start)";
	   }
	   else{
	s = s + getStormEnd().substring(0, 2) + "/" + getStormEnd().substring(2)+" - " ;
	   }
	   if(getStormEnd().equals("")){
	s = s + "(no end)" ;
	   }
	   else{
	s = s + getStormEnd().substring(0, 2) + "/" + getStormEnd().substring(2);
	   }
	}
	return s;
	   }
	
}
