package com.xworkz;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.dao.InstagramDAO;
import com.xworkz.dao.InstagramDAOImpl;
import com.xworkz.dto.InstagramDTO;

public class InstaTester {
	public static void main(String[] args) {
		List<InstagramDTO> list = new LinkedList<InstagramDTO>();

		InstagramDAO dao = new InstagramDAOImpl(list);
		
		InstagramDTO dto = new InstagramDTO(1,"harshu","life is beautifull",20);
		dao.save(dto);
		InstagramDTO dto1 = new InstagramDTO(2,"rakshu","my life my rules",2);
		dao.save(dto1);
		InstagramDTO dto2 = new InstagramDTO(3,"seema","ambivert",29);
		dao.save(dto2);
		InstagramDTO dto3 = new InstagramDTO(4,"vaishu","stuborn",30);
		dao.save(dto3);
		InstagramDTO dto4 = new InstagramDTO(5,"sharu","in my own world",28);
		dao.save(dto4);
		
		dao.addMultipleInstagramAccount(list);
		dao.updateBioByName("wow","seema");
		dao.deleteNameByUserId("seema",3);
		dao.getAll();
		}
}