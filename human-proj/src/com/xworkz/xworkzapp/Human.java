package com.xworkz.xworkzapp;

public class Human {
	private String name;
	private int age;
	private long adharCardNumber;
	
	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	//@Override
	//public String toString() {
		//return "Human-['"+age+"' '"+name+"']";
	//}
	
	/*@Override
	public int hashCode() {
		return (int)adharCardNumber;
	}*/

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human) { //syntax: referenceType instanceof classType //type comparision
			return true;
		}
		/*if(obj != null)
		{
			if(this == obj) {
				return true;
			}
		 }
		if(obj == null)
		{
			System.out.println("object is null");
		}
		else if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		else if(this.name.equals(obj)) {
			return true;
		}
		//if(this.age==(Integer)obj) {
			//return true;
		//}*/
		return false;
	}
	
}