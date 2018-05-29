package de.upb.otfmlpg.main;

import java.util.ArrayList;
import java.util.List;

public class ParticipantList {

	private List<Participant> allParticipants = new ArrayList<>();
	
	public ParticipantList() {
		allParticipants.add(new Participant("Mirko Jürgens"));
		allParticipants.add(new Participant("Felix Weiland"));
		allParticipants.add(new Participant("Helena Graf"));
		allParticipants.add(new Participant("Joshua Nowack"))
	}
	
	@Override
	public String toString() {
		return allParticipants.toString();
	}
}
