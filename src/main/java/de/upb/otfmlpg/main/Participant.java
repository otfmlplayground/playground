package de.upb.otfmlpg.main;

public class Participant {

	private String name;
	
	public Participant(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
