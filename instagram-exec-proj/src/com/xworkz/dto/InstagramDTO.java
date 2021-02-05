package com.xworkz.dto;

public class InstagramDTO {
	private int userId;
	private String name;
	private String bio;
	private int noOfPost;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getNoOfPost() {
		return noOfPost;
	}
	public void setNoOfPost(int noOfPost) {
		this.noOfPost = noOfPost;
	}
	public InstagramDTO(int userId, String name, String bio, int noOfPost) {
		super();
		this.userId = userId;
		this.name = name;
		this.bio = bio;
		this.noOfPost = noOfPost;
	}
	@Override
	public String toString() {
		return "InstagramDTO [userId=" + userId + ", name=" + name + ", bio=" + bio + ", noOfPost=" + noOfPost + "]";
	}
	

}
