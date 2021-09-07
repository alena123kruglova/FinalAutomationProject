package page;

import java.util.Random;

public class BasePage {

	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(boundaryNumber);
		return randomNumber;
	}
}
