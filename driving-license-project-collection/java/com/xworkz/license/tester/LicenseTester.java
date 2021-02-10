package com.xworkz.license.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {

		AddressDTO addressDTO=new AddressDTO(19,"ganesha krupa","renukaacharya nagar",
				"basaveshwara nagr 2nd main","bellary","karnataka",583103);
		System.out.println(addressDTO);
		
		Date dob = new Date();
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob=format.parse("16/10/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		LicenseDTO dto=new LicenseDTO("seema patil",addressDTO,dob, 22,9986982688L,BloodGroup.A_POSITIVE,Gender.FEMALE);
		dto.setIdProof(IdProof.ADHAR);
		dto.setIdProofNo("6363 8787 6449");
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		dto.setStartDate(new Date());
		dto.setDisability(false);
		dto.setCommercial(false);
		
		LicenseDTO dto1=new LicenseDTO("patil",addressDTO,dob, 22,8073131872L,BloodGroup.B_POSITIVE,Gender.MALE);
		dto1.setIdProof(IdProof.PAN);
		dto1.setIdProofNo("6969 8787 6449");
		dto1.setVehicleType(VehicleType.THREE_WHEELER);
		dto1.setStartDate(new Date());
		dto1.setDisability(false);
		dto1.setCommercial(false);
		
		
		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto, dto1);
		//dao.save(dto1);
		
			// CRUD
		LicenseDTO dtoFound = dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoFound);

		boolean updated=dao.updateVehicleTypeByIdProofNo("6363 8787 6449", VehicleType.LMV);
		System.out.println("updated "+ updated);
		
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6969 8787 6449");
		System.out.println(dtoafterUpdate);
		
		boolean deleted=dao.deleteByIdProofNo("6363 8787 6449");
		System.out.println("deleted"+ deleted);
		
		LicenseDTO dtoFound1 = dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoFound1+" if null it got deleted");

		LicenseDTO dtoFound2 = dao.findByIdProofNo("6969 8787 6449");
		System.out.println(dtoFound2+"checking another element is present or not");

		
	}
}


