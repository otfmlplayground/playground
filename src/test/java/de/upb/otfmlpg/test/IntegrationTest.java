package de.upb.otfmlpg.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.upb.otfmlpg.main.ParticipantList;

@RunWith(Parameterized.class)
public class IntegrationTest {

	private final String toCheck;

	private final ParticipantList participants;

	public IntegrationTest(final String toCheck) {
		this.toCheck = toCheck;
		this.participants = new ParticipantList();
	}

	@Test
	public void test() {
		assertTrue(this.participants.toString().contains(this.toCheck));
	}

	@Parameters(name = "{0}")
	public static Collection<String[]> participants() {
		return Arrays.asList(new String[][] { { "mirkoj" }, { "braunm" }, { "noni4" }, { "fweiland" }, {"mwever"}});
	}
}
