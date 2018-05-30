package de.upb.otfmlpg.main;

import java.util.ArrayList;
import java.util.List;

public class ParticipantList {

	private final List<Participant> allParticipants = new ArrayList<>();

	public ParticipantList() {
		this.allParticipants.add(new Participant("mirkoj"));
		this.allParticipants.add(new Participant("jnowack"));
		this.allParticipants.add(new Participant("braunm"));
		this.allParticipants.add(new Participant("noni4"));
		this.allParticipants.add(new Participant("fweiland"));
		this.allParticipants.add(new Participant("mwever"));
	}

	@Override
	public String toString() {
		return this.allParticipants.toString();
	}
}
