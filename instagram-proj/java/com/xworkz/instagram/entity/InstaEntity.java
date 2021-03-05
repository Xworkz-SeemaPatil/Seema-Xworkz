package com.xworkz.instagram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="insta")

public class InstaEntity {

		public InstaEntity(String usrName, String name, int noOfPost, int noOfFollowers) {
		super();
		this.usrName = usrName;
		Name = name;
		this.noOfPost = noOfPost;
		this.noOfFollowers = noOfFollowers;
	}
		@Id
		@GenericGenerator(name="auto" ,strategy="increment")
		@GeneratedValue(generator="auto")
		@Column(name="ID")
		private int Id;
		@Column(name="USR_NAME")
		private String usrName;
		@Column(name="NAME")
		private String Name;
		@Column(name="NO_OF_POST")
		private int noOfPost;
		@Column(name="NO_OF_FOLLOWERS")
		private int noOfFollowers;
		
		

}
