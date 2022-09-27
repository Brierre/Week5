package week5ObjectOrientedProgramming;

//import java.util.Date;

public class SpacedLogger implements Logger{

	@Override
	public void log(String info) {
		// when a string gets passed in we are going to log it
		//Date date = new Date();
		//System.out.println(date.toString() + ": " + info);
		for (int i = 0; i < info.length(); i++) {
		System.out.print(info.charAt(i) + " ");
		}
		System.out.println();
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.print("\nERROR: ");
		for (int i = 0; i < error.length(); i++) {
		System.out.print(error.charAt(i) + " ");
		}
		System.out.println();
	}

}
