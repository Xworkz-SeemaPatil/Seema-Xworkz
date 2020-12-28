package com.xworkz.xworkzapp.waterapark;

import com.xworkz.xworkzapp.park.ManagerDTO;
import com.xworkz.xworkzapp.park.WorkersDTO;

public class WaterPark {
	
		public ManagerDTO manager;
		public WorkersDTO[] workers;
		public int index;

		public WaterPark(int size) {
				workers = new WorkersDTO[size];
		}
		
		public void addManager(String name, long number)
		{
			System.out.println("adding manager");
			if(name != null && number > 0)
			this.manager = new ManagerDTO(name, number);
			System.out.println("added manager");
			
		}
		
		public void addManager(ManagerDTO dto)
		{
			System.out.println("adding manager directly");
			if(dto!=null)
			this.manager = dto;
			else {
				System.out.println("Manager not added : null");
			}
		}
		
		public void addWorkers(WorkersDTO workersDTO) {
			System.out.println("adding workers");
			if(workersDTO !=null) {
			workers[index++] = workersDTO;
			}
		}
		
		public void removeManager() {
			System.out.println("removing manager");
			this.manager =null;
			System.out.println("removed manager");
		}
		public WorkersDTO showWorkersByName(String name) {
			WorkersDTO dto = null;
			for (int i=0; i<workers.length;i++) {
				if(workers[i] != null) {
				if(workers[i].getName().equals(name))
				{
					dto =workers[i];
				}
			}	
		}
			return dto;
		}
		
		public void displayManager() {
			System.out.println("Displaying all the managers");
			System.out.println(this.manager.getName());
			System.out.println(this.manager.getNumber());
			System.out.println("added manager");
		}
}