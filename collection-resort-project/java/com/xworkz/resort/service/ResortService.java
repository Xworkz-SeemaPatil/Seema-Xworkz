package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {
	boolean validateDataAndSave(ResortDTO dto);
	boolean validateUpdateLocationByName(String location,String name);
	boolean validateUpdateLocationByNameAndRating(String location,String name,float rating);
	boolean validateDeleteByNameAndLocation(String name,String location);
	boolean validateAddMultipleResorts(List<ResortDTO> dtos);
	int validateTotalResortSize();
	List<ResortDTO> validateGetAll();
}
