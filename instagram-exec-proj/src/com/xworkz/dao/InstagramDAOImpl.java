package com.xworkz.dao;

import java.util.Iterator;
import java.util.List;
import com.xworkz.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO {
	
private List<InstagramDTO> instaList;
	
	public InstagramDAOImpl(List<InstagramDTO> instadtos) {
		System.out.println("invoked InstagramDAOImpl");
		this.instaList=instadtos;
	}

	@Override
	public boolean save(InstagramDTO dto) {
			boolean added=false;
			System.out.println("invoked save method");
			if(!this.instaList.contains(dto)) {
				added=this.instaList.add(dto);
			}
			if(added) {
				System.out.println("dto is added");
				return true;
			}
			else {
				System.out.println("dto is not added");
				return false;
			}
	}

	@Override
	public boolean addMultipleInstagramAccount(List<InstagramDTO> dtos) {
		if(dtos!=null) {
			boolean added=dtos.addAll(instaList);
			System.out.println("multiple data added"+added);
			System.out.println(dtos);
			return true;
		}
		return false;
	}
		

	@Override
	public boolean updateBioByName(String bio, String name) {
		for(InstagramDTO instaDTO : instaList) {
			String instaName =instaDTO.getName();
			if(instaName.equals(name)) {
				System.out.println("hey");
				instaDTO.setBio(bio);
				System.out.println("update bio"+instaDTO);
				return true;
			}
			else {
				System.out.println("account not found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteNameByUserId(String name, int userId) {
		Iterator<InstagramDTO> iterator=this.instaList.iterator();
		while(iterator.hasNext()) {
			InstagramDTO dto=iterator.next();
			if(dto.getName().equals(name) && dto.getUserId()==(userId)) {
				iterator.remove();
				return true;
			}else {
				System.out.println("name and userId doesnot match");
			}
		}
		return false;
	}
		

	
	
	@Override
	public List<InstagramDTO> getAll() {
		return this.instaList;
	}

	@Override
	public InstagramDTO findbyNoOfPostAndName(int NoOfPost, String name) {
		for (InstagramDTO instaDTO : this.instaList) {
			String nameDTO = instaDTO.getName();
			int postDTO = instaDTO.getNoOfPost();
			if (nameDTO.equals(name) && postDTO == (NoOfPost)) {
				System.out.println("cosmetic found");
				return instaDTO;
			}
		}
		return null;
	}
		
}