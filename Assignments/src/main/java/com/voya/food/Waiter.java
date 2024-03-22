package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	IFoodMenu indian;
	@Autowired
	IFoodMenu italian;
	@Autowired
	IFoodMenu chinese;
	
	List<String> viewMenucard(String choice){
		if(choice.equals("indian"))
			return indian.showMenu();
		else if(choice.equals("italian"))
			return italian.showMenu();
		else if(choice.equals("chinese"))
			return chinese.showMenu();
		return null;
		
	}

	
	
	
}
