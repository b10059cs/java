package chegg;

public class FindLargestSmallestNumber {
	public static void main(String[] args) {
		  
        //numbers array
        int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
       
        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];
        int comp=0;
        for(int i=1; i< numbers.length; i++) { 
        	      if(numbers[i] > largetst){
                        largetst = numbers[i];
                        comp++;
        	      }
                else if (numbers[i] < smallest){
                        smallest = numbers[i];
                        comp++;
                }
               
        }
       
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Total Number of comparision: "+comp+" :3n/2: "+(3*numbers.length)/2);
	}
}
