package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;

public class CommonDTO {
	private String name;
	private AddressDTO addressDTO;
	private Date DOB;
	private int age;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;
	
	public CommonDTO(String name, AddressDTO addressDTO, Date dob, int age, long mobileNo,
			BloodGroup bloodGroup, Gender gender) {
		super();
		this.name = name;
		this.addressDTO = addressDTO;
		DOB = dob;
		this.age = age;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public Date getDob() {
		return DOB;
	}

	public void setDob(Date dob) {
		this.DOB = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}