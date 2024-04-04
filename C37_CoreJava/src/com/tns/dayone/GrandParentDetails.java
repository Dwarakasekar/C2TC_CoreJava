package com.tns.dayone;

public class GrandParentDetails extends GreatGrandParent {
	public void assestGrand() {
		System.out.println("2 acres of land from madurai");
	}
	
	public void assestSquare() {
		System.out.println("1500 square feet");
	}
	public static void main(String[] args) {
		GrandParentDetails g=new GrandParentDetails();
		g.assestGrand();
		g.assestSquare();
		g.valueGrand();
		g.weekEnd();
	}
}




