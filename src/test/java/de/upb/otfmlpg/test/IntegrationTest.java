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

	private String toCheck;
	
	private ParticipantList participants;
	
	public IntegrationTest (String toCheck) {
		this.toCheck = toCheck;
		this.participants = new ParticipantList();
	}
	
	@Test
	public void test() {
		assertTrue(participants.toString().contains(toCheck));
	}
	
   @Parameters(name="{0}")
   public static Collection<String[]> participants() {
      return Arrays.asList(new String[][] {
         { "Mirko Jürgens" },
         { "Felix Weiland" },
         { "Helena Graf" },
         { "Joshua Nowack" },
//         { "" }
      });
   }

}
