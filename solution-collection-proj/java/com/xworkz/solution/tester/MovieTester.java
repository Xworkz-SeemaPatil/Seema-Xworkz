package com.xworkz.solution.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {
	public static void main(String[] args) {
		MovieDTO dto1=new MovieDTO("KGF",5,3,"Action");
		MovieDTO dto2=new MovieDTO("Om",5,2.5,"Drama");
		MovieDTO dto3=new MovieDTO("Bahubali",4.5,2.39,"Action/war");
		MovieDTO dto4=new MovieDTO("Andrawala",5,3,"Action");
		MovieDTO dto5=new MovieDTO("Tarle nan Maga",5,3,"Comedy");
		
		MovieDTO dto6=new MovieDTO();
		dto6.setGenre("Action");
		
		Collection<MovieDTO> movieDTOs=new ArrayList();
		movieDTOs.add(dto1);		
		movieDTOs.add(dto2);		
		movieDTOs.add(dto3);		
		movieDTOs.add(dto4);		
		movieDTOs.add(dto5);
		
		Iterator<MovieDTO> iterator=movieDTOs.iterator();
		while(iterator.hasNext())
		{
			MovieDTO movie =iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("Comedy")) {
				iterator.remove();
			movieDTOs.remove(movie);
		}
		}
		System.out.println("movie after removing comedy"+movieDTOs.size());
		
		for(MovieDTO dto:movieDTOs)
		{
			System.out.println(dto);
		}
		
	}

}
