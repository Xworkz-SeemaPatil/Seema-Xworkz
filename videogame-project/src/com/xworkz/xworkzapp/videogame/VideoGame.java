package com.xworkz.xworkzapp.videogame;

public class VideoGame {
	private String gameName;
	private int userId;
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
public VideoGame() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "VideoGame [gameName=" + gameName + "]";
	}
	
	
	@Override
	public int hashCode() {
		return (int)userId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			if(this == obj) {
				return true;
			}
		 }
		if(obj == null)
		{
			System.out.println("object is null");
		}
		else if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		else if(this.gameName.equals(obj)) {
			return true;
		}
		
		return false;

	}

}
