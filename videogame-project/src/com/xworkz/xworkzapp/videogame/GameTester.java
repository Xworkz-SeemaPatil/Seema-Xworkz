package com.xworkz.xworkzapp.videogame;

public class GameTester {
public static void main(String[] args) {
	VideoGame game=new VideoGame();
	game.setGameName("pubg");
	game.setUserId(1);
	System.out.println(game);
	
	VideoGame game1=new VideoGame();
	game1.setGameName("candy crush");
	game1.setUserId(2);
	System.out.println(game1);
	
	VideoGame game2=new VideoGame();
	game2.setGameName("temple run");
	game2.setUserId(3);
	System.out.println(game2);
	
	VideoGame game3=new VideoGame();
	game3.setGameName("barbie");
	game3.setUserId(4);
	System.out.println(game3);
	
	VideoGame game4=new VideoGame();
	game4.setGameName("suduko");
	game4.setUserId(5);
	System.out.println(game4);
	
	
	System.out.println(game.hashCode());
	System.out.println(game1.hashCode());
	System.out.println(game2.hashCode());
	System.out.println(game3.hashCode());
	System.out.println(game4.hashCode());
	
	System.out.println(game.equals(game4));

	}
}