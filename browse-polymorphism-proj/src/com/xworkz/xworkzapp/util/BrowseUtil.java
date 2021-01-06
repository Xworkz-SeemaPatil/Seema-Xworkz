package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.browse.Browse;
import com.xworkz.xworkzapp.browse.Firefox;

public class BrowseUtil {
	public static void main(String[] args) {
		
				//up casting
				Browse browse = new Firefox();
				
				browse.searchType="voice search";
				
				browse.version="v.12";
				browse.browse();
				
				System.out.println(browse.searchType +" "+browse.version);

	}

}
