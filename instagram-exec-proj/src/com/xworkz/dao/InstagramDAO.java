package com.xworkz.dao;

import java.util.List;

import com.xworkz.dto.InstagramDTO;

public interface InstagramDAO {
	boolean save(InstagramDTO dto);
	boolean addMultipleInstagramAccount(List<InstagramDTO> dtos);
	InstagramDTO findbyNoOfPostAndName(int NoOfPost,String name);
	boolean updateBioByName(String bio,String name);	
	boolean deleteNameByUserId(String name,int userId);
	
	List<InstagramDTO> getAll();


}
