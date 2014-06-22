package exercises;

public class Logger {
	protected final int defaultLevel = 3;
	protected int currentLevel;
	
	public Logger()
	{
		currentLevel = defaultLevel;
	}
	
	public Logger(int level) {
		
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
