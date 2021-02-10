package com.xworkz.moon;

import java.util.Collections;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.FinderImpl;
import com.xworkz.moon.service.RestaurantService;
import com.xworkz.moon.service.RestaurantServiceImpl;
import com.xworkz.moon.service.VegFinderImpl;

public class TesterSatya {

	public static void main(String[] args) {

		RestaurantService restaurantService = new RestaurantServiceImpl();

		restaurantService.findAndDisplay(new FinderImpl());
		
		// restaurantService.displayItemGreaterThan(200);
		/*
		 * Finder finder=new FinderImpl(); finder=new VegFinderImpl();
		 */
//Functional Interface
		restaurantService.findAndDisplay(new Finder() {
			@Override
			public boolean test(MenuDTO dto) {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}

		});
//(ref)->{};
		//() is required if you have more than one param
		//more than one statement
		restaurantService.findAndDisplay(d->d.getPrice()>300);
		
		//Collections.sort(list);
	}

}