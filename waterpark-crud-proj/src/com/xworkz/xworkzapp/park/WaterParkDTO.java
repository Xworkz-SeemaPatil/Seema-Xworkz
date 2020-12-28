package com.xworkz.xworkzapp.park;

public class WaterParkDTO {
	
	private String rides;
	private ManagerDTO manager;
	private WorkersDTO worker;
	public String getRides() {
		return rides;
	}
	public void setRides(String rides) {
		this.rides = rides;
	}
	public ManagerDTO getManager() {
		return manager;
	}
	public void setManager(ManagerDTO manager) {
		this.manager = manager;
	}
	public WorkersDTO[] getWorkers() {
		return workers;
	}
	public void setWorkers(WorkersDTO[] workers) {
		this.workers = workers;
	}
	public WorkersDTO getWorker() {
		return worker;
	}
	public void setWorker(WorkersDTO worker) {
		this.worker = worker;
	}
	private WorkersDTO[] workers;

}
