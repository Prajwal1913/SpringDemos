package com.example.javabased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	@Autowired
	IFoodMenu menus;
	
	
	IFoodMenu menuItems;
	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}


	public List<String> viewMenucard(String choice){
		List<String> menuList = new ArrayList<>();
		if(choice.equals("indian"))
			menuList = iFoodMenu.showMenu();
		else if(choice.equals("italian"))
			menuList = menus.showMenu();
		else if(choice.equals("chinese"))
			menuList = menuItems.showMenu();
		return menuList;
		
	}	
	
}
