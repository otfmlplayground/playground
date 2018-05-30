package de.upb.otfmlpg.main;

import java.util.ArrayList;
import java.util.List;

public class ParticipantList {

	private List<Participant> allParticipants = new ArrayList<>();

	public ParticipantList() {
		allParticipants.add(new Participant("mirkoj"));
		allParticipants.add(new Participant("braunm"));
		allParticipants.add(new Participant("noni4"));
	}

	@Override
	public String toString() {
		return allParticipants.toString();
	}
}
