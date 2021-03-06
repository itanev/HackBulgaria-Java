package exercises;

public class LoggerMain {

	public static void main(String[] args) {
		
		Logger logger = new Logger(3);
		
		logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"
		logger.log(3, "Less important message"); // also gets logged!
		logger.log(5, "Not important"); //this is less important than LEVEL, so it will **not be logged**.
		logger.log("Meh"); //overload without a LEVEL parameter, use 3 as default.

		logger.setLevel(2);
		logger.log("My message"); //does not get printed!
		
		Logger datelogger = new DateLogger(); //I am not obliged to set a log level, by default your class should print everything in this case
		datelogger.log("My message"); //this is an overload without a LEVEL parameter. In this situation, assume the LEVEL given to you is 3.
		//|22:14:01 14.06.2014| 3 => My message
	}

}
