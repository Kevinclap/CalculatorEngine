package com.kevinclap.myapp;

import com.kevinclap.calcengine.MathProcessing;

public class PowerOf implements MathProcessing {

	@Override
	public String getKeyword() {
		// TODO Auto-generated method stub
		return "power";
	}

	@Override
	public char getSymbol() {
		// TODO Auto-generated method stub
		return '^';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		return Math.pow(leftVal,  rightVal);
	}

	
	
}
