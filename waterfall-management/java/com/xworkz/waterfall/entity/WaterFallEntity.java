package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@Data

  @Getter
  
  @Setter
  
  @NoArgsConstructor
  
  @ToString
 
@Entity
@Table (name="waterfall")
public class WaterFallEntity {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="W_ID")
	private int wId;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="HEIGHT")
	private double height;
	@Column(name="DEAPTH")
	private double depth;
	@Column(name="ELE_GENERATED")
	private boolean electricityGenerated;
	@Column(name="SOURCE_RIVER")
	private String sourceRiver;
	@Column(name="ENTRY_FEE")
	private double entryFees;
	@Column(name="DESTINATION")
	private String destination;
	@Column(name="RATING")
	private double rating;
	@Column(name="NO_OF_DEATHS")
	private int noOfDeath;
	@Column(name="NO_OF_VISITORS")
	private int noOfVisitors;

}
