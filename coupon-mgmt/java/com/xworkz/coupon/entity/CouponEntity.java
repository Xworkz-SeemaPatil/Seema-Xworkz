package com.xworkz.coupon.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="coupon")
public class CouponEntity {
	public CouponEntity() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue (generator="auto")
	@Column (name="CID")
	private int cId;
	@Column (name="NAME")
	private String name;
	@Column (name="TYPE")
	private String type;
	@Column (name="CODE")
	private String code;
	@Column (name="VALIDITY_IN_MONTHS")
	private int validityInMonth;
	public CouponEntity(String name, String type, String code, int validityInMonth) {
		super();
		this.name = name;
		this.type = type;
		this.code = code;
		this.validityInMonth = validityInMonth;
	}
	
}
