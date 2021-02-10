package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		ResortDTO dto = new ResortDTO("Ballari", "royalresort", "prashanth", 12);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNO(7829731400l);
		dto.setPoolExist(false);
        dto.setRating(4);
		dao.save(dto);
		
		
		ResortDTO dto2=new ResortDTO("Bengaluru", "royalorchid", "Shashi", 25);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(true);
		dto2.setPhoneNO(7229731400l);
		dto2.setPoolExist(false);
        dto2.setRating(3);
		dao.save(dto2);
		
		System.out.println(dao.totalResortSize());
		
		dao.updateLocationByName("shivamoga", "royalorchid");
		
		dao.updateLocationByNameAndRating("MalleNadu", "royalresort", 4);
		
		dao.deleteByNameAndLocation("", "");
		
		dao.addMultipleResorts(list);
		
	}
}