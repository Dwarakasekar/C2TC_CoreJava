package com.tns.dayone;

public class ParentDetails extends GreatGrandParent{

	public void assestParent() {
		System.out.println("Parent have 5 acrees of land in trichy");
	}

	public void assestDetails() {
		System.out.println("2500 squarefeet of land");
	}

	public static void main(String[] args) {
		ParentDetails par=new ParentDetails();
		par.assestDetails();
		par.assestParent();
		par.valueGrand();
		par.weekEnd();
		
	}
}
