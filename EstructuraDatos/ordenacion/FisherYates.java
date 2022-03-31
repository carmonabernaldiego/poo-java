package ordenacion;

import java.util.Random;

public class FisherYates {
	public void shuffle(int[] array) {
		int n = array.length;

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomValue = i + random.nextInt(n - i);
			int randomElement = array[randomValue];

			array[randomValue] = array[i];
			array[i] = randomElement;
		}
	}
}