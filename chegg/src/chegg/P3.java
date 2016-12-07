package chegg;

import java.util.Scanner;

public class P3 {
	/*isInteger method implementation
	 * @param String type
	 * while parsing if it throw exception then it is not integer
	 * else it is integer*/
	public static Boolean isDouble(String token){
		try { 
			Double.parseDouble(token); 
		} catch(NumberFormatException e) { 
			System.out.println("Invalid Operand");
			return false; 
		} catch(NullPointerException e) {
			System.out.println("Invalid Operand");
			return false;
		}
		// only got here if we didn't return false
		return true;
	}
	public static String evaluate(String expression) {
		// Print expression
		System.out.print(expression);

		// Declare variables for operands, operator, result, and return value
		double operand1=0,operand2 = 0,result=0;
		char operator;
		Boolean flag=Boolean.FALSE;//for if operators were not listed
		String returnString = "";
		String token[]=new String[expression.length()];//for storing all token from expression

		// Create Scanner object to parse expression
		// create a new scanner with the specified String Object
		int i=0;
		Scanner scanner = new Scanner(expression);
		while(scanner.hasNext()){
			token[i]=scanner.next();
			i++;
		}
		scanner.close();

		// Compute a numerical result for the expression
		if(isDouble(token[0])){
			operand1=Double.parseDouble(token[0]);
		}
		if(isDouble(token[2])){
			operand2=Double.parseDouble(token[2]);
		}
		operator=token[1].charAt(0);
		if(operand1!=0&&operand2!=0){
			switch(operator){
			case '+':
				result=operand1+operand2;
				break;
			case '-':
				result=operand1-operand2;
				break;
			case '*':
				result=operand1*operand2;
				break;
			case '/':
				result=operand1/operand2;
				break;
			case '%':
				result=operand1%operand2;
				break;
			case '^':
				result=Math.pow(operand1, operand2);
				break;
			default:
				System.out.println("Invalid Operator");
				flag=Boolean.TRUE;
				break;
			}

			// Convert numerical result to string
			returnString=Double.toString(result);
			
			if(flag){
				return null;
			}
			// Return result
			return returnString;
		}else{
			return null;
		}
	}
}
