package exercises;

public class Logger {
	protected int defaultLevel;
	protected int currentLevel;
	
	public Logger(int level) {
		
		defaultLevel = level;
		currentLevel = level;
	}
	
	public void log(int level, String message) {
		
		validateLevel(level);
		
		if(level <= currentLevel) {
			System.out.format("%d => %s\n", level, message);
		}
	}
	
	public void log(String message) {
		
		log(defaultLevel, message);
	}
	
	public void setLevel(int level) {
		
		validateLevel(level);
		
		currentLevel = level;
	}
	
	protected void validateLevel(int level) {
		if(level == Integer.MAX_VALUE ||
		   level == Integer.MIN_VALUE) {
			
			throw new IllegalArgumentException("The level is not valid!");
		}
	}
}
