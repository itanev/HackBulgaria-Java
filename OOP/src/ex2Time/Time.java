package ex2Time;

import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
	private Date date;
	
	public Time(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.YY");
		return dateFormat.format(this.date);
	}
	
	public Time now() {
		Date currentTime = Calendar.getInstance().getTime();
		return (new Time(currentTime));
	}
}
