package com.amdocs;

import java.util.Scanner;
import java.util.Stack;

public class RpnSolve {
	public double solve(String postfixNotation)
	{
		Stack<Double> stack = new Stack<Double>();
		String[] arrOfStr = postfixNotation.split(" "); 
		double element1=0.0;
		double element2=0.0;
		RpnCalculatorInterface object;
		
		//System.out.println(arrOfStr.length);
		for(String character:arrOfStr)
		{
			if(character.equals("+"))
			{
				element1 = stack.pop();
				element2=stack.pop();
				object=new Addition();
				stack.push(object.solve(element1,element2));
			}
			else if(character.equals("-"))
			{
				element1 = stack.pop();
				element2=stack.pop();
				object=new Substraction();
				stack.push(object.solve(element1,element2));
	
			}
			else if(character.equals("*"))
			{
				element1 = stack.pop();
				element2=stack.pop();
				object=new Multiplication();
				stack.push(object.solve(element1,element2));
			}
			else if(character.equals("/"))
			{
				element1 = stack.pop();
				element2=stack.pop();
				object =new Division();
				stack.push(object.solve(element1,element2));
			}
			else
			{
				stack.push(Double.parseDouble(character));
				//System.out.println("Push "+Double.valueOf(character));
			}
		}
		return stack.pop();
	}

}
