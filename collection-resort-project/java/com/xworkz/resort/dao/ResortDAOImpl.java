package com.xworkz.resort.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO{
	
	private List<ResortDTO> resortList;
	
	public ResortDAOImpl(List<ResortDTO> resortdtos) {
		System.out.println("invoked ResortDAOImpl");
		this.resortList=resortdtos;
	}

	@Override
	public boolean save(ResortDTO dto) {
		boolean added=false;
		System.out.println("invoked save method");
		if(!this.resortList.contains(dto)) {
			added=this.resortList.add(dto);
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
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoked updateLocationByName");
		for(ResortDTO resortDTO : resortList) {
			String resortName=resortDTO.getName();
			if(resortName.equals(name)) {
				System.out.println("resort name found can update location");
				resortDTO.setLocation(location);
				System.out.println("update loaction"+resortDTO);
				return true;
			}
			else {
				System.out.println("resort not found");
			}
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("invoked updateLocationByName");
		for(ResortDTO resortDTO : resortList) {
			String resortName=resortDTO.getName();
			float resortRating=resortDTO.getRating();
			if(resortName.equals(name) && resortRating==(rating)) {
				System.out.println("resort name and rating found can update location");
				resortDTO.setLocation(location);
				System.out.println("update loaction"+resortDTO);
				return true;
			}
			else {
				System.out.println("resort not found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoked deleteByNameAndLocation");
		Iterator<ResortDTO> iterator=this.resortList.iterator();
		while(iterator.hasNext()) {
			ResortDTO dto=iterator.next();
			if(dto.getName().equals(name) && dto.getLocation().contentEquals(location)) {
				iterator.remove();
				return true;
			}else {
				System.out.println("name location doesnot match");
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		if(dtos!=null) {
			boolean added=dtos.addAll(resortList);
			System.out.println("multiple data added"+added);
			System.out.println(dtos);
			return true;
		}
	
		return false;
	}

	@Override
	public int totalResortSize() {
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		// TODO Auto-generated method stub
		return this.resortList;
	}

}
