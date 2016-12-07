package chegg;

import java.util.LinkedList;

public class PolishExpression {

	public static void main(String args[]){
		int countOperands=0;
		int countOperators=0;
		
		/*Linked List object creation*/
		LinkedList<String> list=new LinkedList<String>();
		/*Adding operators into list*/
		list.add("*");
		list.add("/");
		list.add("+");
		list.add("-");
		
		/*Receiving argument from console */
		if(args.length==3){
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			
			String operator=args[2];
			if(operator.equals("*")){
				System.out.println(n1+" "+n2+" "+operator+" = "+(n1*n2));
			}if(operator.equals("+")){
				System.out.println(n1+" "+n2+" "+operator+" = "+(n1+n2));
			}if(operator.equals("-")){
				System.out.println(n1+" "+n2+" "+operator+" = "+(n1-n2));
			}if(operator.equals("/")){
				if(n2==0){
					System.out.println(n1+" "+n2+" "+operator+" = "+" Error: Division by zero");
				}else{
				System.out.println(n1+" "+n2+" "+operator+" = "+(n1/n2));
				}
			}
			
		}else{
		for(int i=0;i<args.length;i++){
			
		}
		}
	}
	
}
