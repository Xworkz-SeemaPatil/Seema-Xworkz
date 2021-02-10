package com.xworkz.license.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;
	
	
	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto,LicenseDTO dto1) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto+dto1);
		boolean saved = this.database.add(dto);
		boolean saved1= this.database.add(dto1);
		
		if (saved && saved1)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;

	}

	@Override
	public boolean deleteByIdProofNo(String idProofNO) {
		// TODO Auto-generated method stub
		LicenseDTO dto=this.findByIdProofNo(idProofNO);
		if(dto!=null)
		{
			this.database.remove(dto);
			System.out.println("deleted");
			return true;
		}
		/*Iterator<LicenseDTO> iterator=this.database.iterator();
		while(iterator.hasNext())
		{
			LicenseDTO dto1=iterator.next();
			if(dto.getIdProof().equals(idProof)) {
				Iterator.remove();
				break;
				}
			}*/
		
		return false;
	}

	
}