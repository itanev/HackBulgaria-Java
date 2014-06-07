package tests;

import static org.junit.Assert.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import ex2Time.*;

public class TimeTest {
	private Time timeHolder;
	private Date date;
	
	@Before
	public void setUp() throws Exception {
		date = Calendar.getInstance().getTime();
		timeHolder = new Time(date);
	}

	@Test
	public void testToString() {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.YY");
		assertTrue(timeHolder.toString().equals(dateFormat.format(date)));
	}
	
	@Test
	public void testNow() {
		Calendar cal = Calendar.getInstance();
		timeHolder = new Time(cal.getTime());
		assertFalse(timeHolder.now() == timeHolder);
	}

}
