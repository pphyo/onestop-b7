package com.jdc.commu.redirect;

import java.util.ArrayList;
import java.util.List;

public class HeroService {
	
	private List<Hero> database = new ArrayList<>();
	
	public boolean save(Hero hero) {
		return database.add(hero);
	}
	
	public List<Hero> getAll(){
		return new ArrayList<Hero>(database);
	}

}