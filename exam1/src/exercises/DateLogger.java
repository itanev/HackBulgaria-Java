package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLogger extends Logger {
	
	public DateLogger(int level) {
		super(level);
	}
	
	public DateLogger() {
		super();
	}
	
	@Override
	public void log(int level, String message) {
		
		super.validateLevel(level);
		
		if(level <= currentLevel) {
			
			DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.YY");
			String date = dateFormat.format(Calendar.getInstance().getTime());
			
			System.out.format("|%s| %d => %s\n", date, level, message);
		}
	}
}
