package com.kevinclap.myapp;

import com.kevinclap.calcengine.CalculateHelper;
import com.kevinclap.calcengine.DynamicHelper;
import com.kevinclap.calcengine.InvalidStatementException;
import com.kevinclap.calcengine.MathProcessing;
//import com.kevinclap.calcengine.MathEq;
//import com.kevinclap.calcengine.CalculateBase;
import com.kevinclap.calcengine.Adder;
//import com.kevinclap.calcengine.Subtracter;
//import com.kevinclap.calcengine.Multiplier;
//import com.kevinclap.calcengine.Divider;

public class Main {

	public static void main(String[] args) {

		String[] statements = {
				
				"add 25.0 92.0",
				"power 5.0 2.0"  //5.0 ^ 2.0 = 25.0
				
		};
		DynamicHelper helper = new DynamicHelper (new MathProcessing [] {
			
				new Adder(),
				new PowerOf()
				
		});
		
		for (String statement:statements) {
			
			String output = helper.process (statement);
			System.out.println(output);
			
		}
		
		
		
		
		
	}

	static void useCalculateHelper() {

		String[] statements = { "add 1.0", "add xx 25.0", "addX 0.0 0.0", "divide 100.0 50.0", "add 25.0 92.0",
				"subtract 225.0 17.0", "multiply 11.0 3.0" };

		CalculateHelper helper = new CalculateHelper();
		for (String statement : statements) {

			try {

				helper.process(statement);
				System.out.println(helper);

			} catch (InvalidStatementException e) {

				System.out.println(e.getMessage());

				if (e.getCause() != null)

					System.out.println("    Original exception: " + e.getCause().getMessage());

			}
		}
	}

}