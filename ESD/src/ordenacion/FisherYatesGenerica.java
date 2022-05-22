package ordenacion;

import java.util.Random;

public class FisherYatesGenerica<T extends Comparable<T>> {
	public void shuffle(T array[]) {
		int n = array.length;

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomValue = i + random.nextInt(n - i);

			T randomElement = array[randomValue];

			array[randomValue] = array[i];
			array[i] = randomElement;
		}
	}
}