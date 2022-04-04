package com.example.demo;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, String> menu;

	public HashMap<String, String> getMenu() {
		return menu;
	}

	public void setMenu(HashMap<String, String> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Menu [menu=" + menu + "]";
	}
	
	public int getSum() {
		int total=0;
		
		for(String values : menu.values()) {
			total=total+ Integer.valueOf(values);
		}
		return total;
	}

	
}
