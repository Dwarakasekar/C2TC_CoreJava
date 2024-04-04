package com.tns.dayone;

public class RunsScored {
	
	private String name;
	private int age;
	private int runs;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	//this - specific modifier  
	
	public  int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs=runs;
	}
	
	public String toString(){
		return "CSK[Name ="+name+", Age="+age+",Runs="+runs+"]";
		
	}
	
	
	
	public static void main(String[] args) {
		
		RunsScored ra=new RunsScored();
		ra.setName("Dhoni");
		ra.setAge(28);
		ra.setRuns(183);
		System.out.println(ra);
		
		//System.out.println(ra.getName());
		///System.out.println(ra.getAge());
		//System.out.println(ra.getRuns());	
		
		
	}

}
