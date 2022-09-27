package week5ObjectOrientedProgramming;

public class App {

	public static void main(String[] args) {
		Logger logger = new SpacedLogger();
		
		logger.log("You know I wish that I had Jesse's girl.");
		logger.error("You forgot to turn off the crockpot and what was once chili is now chili paste.");
		
		logger = new AsteriskLogger();
		
		logger.log("Trumpet is the best instrument.");
		logger.error("You have chosen the saxophone.");
		
		
//		Logger anotherLogger = new SpacedLogger();
//		
//		anotherLogger.log("Where the air smells like warm root beer, and the towels are OH SO FLUFFY!");
//		anotherLogger.error("No! We're out of bear claws!");
//		
//		anotherLogger = new AsteriskLogger();
//		
//		anotherLogger.log("Musical season is not far away.");
//		anotherLogger.error("You are not ready.");
	}

}
