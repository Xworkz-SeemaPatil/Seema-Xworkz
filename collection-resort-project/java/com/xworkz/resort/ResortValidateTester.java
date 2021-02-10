package com.xworkz.resort;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ResortValidateTester {

		public static void main(String[] args) {
			List<ResortDTO> list = new LinkedList<ResortDTO>();
			
			ResortDAO dao=new ResortDAOImpl(list);
			ResortService resortService = new ResortServiceImpl(dao);
			
			
			ResortDTO dto=new ResortDTO("Sandur", "sandurresort", "Sagar", 25);
			dto.setPricePerHead(1500);
			dto.setNoOfEmployees(10);
			dto.setOffers(false);
			dto.setPhoneNO(7829731411l);
			dto.setPoolExist(false);
	        dto.setRating(4);
			resortService.validateDataAndSave(dto);
			
			ResortDTO dto2=new ResortDTO("Bengaluru", "RoyalOrchid", "Akash", 15);
			dto2.setPricePerHead(2375);
			dto2.setNoOfEmployees(20);
			dto2.setOffers(false);
			dto2.setPhoneNO(7829731400l);
			dto2.setPoolExist(false);
	        dto2.setRating(3);
	        resortService.validateDataAndSave(dto2);
	        
	        resortService.validateUpdateLocationByName("Ballari", "sandur resort");
	        
	        resortService.validateUpdateLocationByNameAndRating("Ramanagar", "Royal Orchid", 3);
	        
	        System.out.println(resortService.validateTotalResortSize());
	        
	        resortService.validateDeleteByNameAndLocation("Ballari", "sandur resort");
	        
	        System.out.println(resortService.validateTotalResortSize());
		}

	}