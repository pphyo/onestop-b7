package com.jdc.commu.redirect;

public class Hero {

	private int id;
	private String name;
	private Role role;
	private int skill = 4;
	private boolean difficulty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public boolean isDifficulty() {
		return difficulty;
	}

	public void setDifficulty(boolean difficulty) {
		this.difficulty = difficulty;
	}

	public enum Role {
		Tank, Marksman, Assassin, Fighter, Mage, Support
	}

}
