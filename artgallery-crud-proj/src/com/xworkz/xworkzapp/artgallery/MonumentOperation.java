package com.xworkz.xworkzapp.artgallery;
 
public class MonumentOperation {
	public MonumentsDTO[] monumentDTOs;
	public int index;
	
	public MonumentOperation(int size){
		monumentDTOs = new MonumentsDTO[size];
	}
	
	public void addMonuments(MonumentsDTO monument)
	{
		System.out.println("adding monuments details");
		monumentDTOs[index++]=monument;
		System.out.println("added monuments details");
	}
	
	public void displayMonument() {
	for (MonumentsDTO monumentDTO : monumentDTOs) 
	{
		if(monumentDTO != null)
		{
			System.out.println(monumentDTO.getName() + " "+monumentDTO.getId());
		}
		else
		{
			System.out.println("please Add monument Details");
		}
	
	}
}
}
