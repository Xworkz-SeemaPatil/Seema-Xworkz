package com.xworkz.xworkzapp.farm;

public class Operation {

	public FarmDTO[] farmDTOs;

	public int index;

	public Operation(int size) {
		farmDTOs = new FarmDTO[size];
	}
	
	public void addFarmDetails(FarmDTO farm) {
		System.out.println("adding Farm Details");
		farmDTOs[index++] = farm;
		System.out.println("added Farm Details");
	}

	public void showAllFarmDetails() {
		for (FarmDTO farmDTO : farmDTOs) {
			if (farmDTO != null) {
				System.out.println(farmDTO.getArea() + " " + farmDTO.getTypeOfCrop() + " " + farmDTO.getTypeOfSoil());
			} 
			else {
				System.out.println("please Add Farm Details");
			}
		}
	}

	public FarmDTO showFarmDetailsByArea(String area) {
		FarmDTO dto = null;
		for (int i = 0; i < farmDTOs.length; i++) {
			if (farmDTOs != null) {
				if (farmDTOs[i].getArea().equals(area)) {
					dto = farmDTOs[i];
					System.out.println(farmDTOs[i].getArea() + " area is found");
				}
				else {
					System.out.println("not found");
				}

			} 
			else {
				System.out.println("please enter the details");
			}
		}
		return dto;
	}

	public FarmDTO showFarmDetailsBySoil(String typeOfSoil) {
		FarmDTO dto = null;
		for (int i = 0; i < farmDTOs.length; i++) {
			if (farmDTOs != null) {
				if (farmDTOs[i].getTypeOfSoil().equals(typeOfSoil)) {
					dto = farmDTOs[i];
					System.out.println(farmDTOs[i].getTypeOfSoil() + " soil type is found");
				}
			} 
			else {
				System.out.println("please enter the details");
			}
		}
		return dto;
	}
	
	public FarmDTO showFarmDetailsByCrop(String typeOfCrop) {
		FarmDTO dto = null;
		for (int i = 0; i < farmDTOs.length; i++) {
			if (farmDTOs != null) {
				if (farmDTOs[i].getTypeOfCrop().equals(typeOfCrop)) {
					dto = farmDTOs[i];
					System.out.println(farmDTOs[i].getTypeOfCrop() + " crop type is found");
				}
			} 
		}
		return dto;
	}
}

//Operation operation = new Operation ();
// operation.farmDTOs =new FarmDTO[size];
