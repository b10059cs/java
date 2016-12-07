package chegg;

public class ContigiousSubArraySum {
	
	void contiguousSubArray(int numbers[], int size){

		int startIndex = 0, endIndex = 0;
		int index;
		int currStartIndex = 0;

		int maxSum = 0;
		int currentSum = 0;

		for(index = 0 ; index < size; index++){
			currentSum  = currentSum + numbers[index];
			// case 1 : When ith element can be included
			// Change the end index and also update the start index.
			if(currentSum > maxSum){
				maxSum = currentSum;
				endIndex = index;
				startIndex = currStartIndex;
			}
			/*case 2 : When ith index cannot be included and 
	        we need to start with i+1 index. till now our max sum
	        and start and end index of that sum remain same */
			if(currentSum < 0){
				currStartIndex = index + 1;
				currentSum = 0;
			}
		}
		System.out.println("Maximum sum is "+maxSum);
		for(int i=startIndex;i<=endIndex;i++){
			System.out.print(numbers[i]+" ");
		}
	}
	public static void main(String args[]){
		ContigiousSubArraySum contigiousSubArraySum=new ContigiousSubArraySum();
		
		int numbers[]={13, -3, -25, 20, 3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		contigiousSubArraySum.contiguousSubArray(numbers, numbers.length);
	}
}
