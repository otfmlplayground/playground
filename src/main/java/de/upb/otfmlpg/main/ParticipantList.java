package de.upb.otfmlpg.main;

import java.util.ArrayList;
import java.util.List;

public class ParticipantList {

	private List<Participant> allParticipants = new ArrayList<>();

	public ParticipantList() {
		allParticipants.add(new Participant("mirkoj"));
	}

	@Override
	public String toString() {
		return allParticipants.toString();
	}
}
