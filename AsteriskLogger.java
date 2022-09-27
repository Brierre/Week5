package week5ObjectOrientedProgramming;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {

		System.out.println("\n***" + log + "***\n");

	}

	@Override
	public void error(String error) {
		for (int i = 0; i < error.length() + 13; i++) {
		System.out.print("*");
		}
		System.out.println("\n***ERROR: " + error + "***");
		for (int i = 0; i < error.length() + 13; i++) {
		System.out.print("*");
		}
		System.out.println();
	}

}
