package computrade.varargs;

import java.text.MessageFormat;
import java.util.Date;

public class VarArgsDemo {

	public static void main(String[] args) {
		VarArgsDemo varArgsDemo = new VarArgsDemo();
		varArgsDemo.average(1,3);
		varArgsDemo.average(1,3,5);
		//varArgsDemo.average(1,3,5,7);
		//varArgsDemo.average(1,3,5,7,9);
		
		/*
		String result = MessageFormat.format(
		 "You are watching {0} lesson on the {1} time at {2,time} on {2,date}.", 
		 "VarArgs",1,new Date());
		
		System.out.println(result);
		*/

	}
	
	
	public void average(int num1, int num2){
		System.out.println("Avg of 2 numbers is:" + (num1+num2)/2);
	}
	
	public void average(int num1, int num2, int num3){
		System.out.println("Avg of 3 numbers is:" +(num1+num2+num3)/3);
	}
	
	/*
	public void average(int... numbers){
		int sum=0;
		for(int num:numbers){
			sum+=num;
		}
		System.out.println("Avg of varargs numbers is:" + (sum)/numbers.length);
	}
	
	*/
	/*
	public void average(Object input, int... numbers){
		int sum=0;
		for(int num:numbers){
			sum+=num;
		}
		System.out.println("Avg of varargs numbers is:" + (sum)/numbers.length);
	}
	*/

}
