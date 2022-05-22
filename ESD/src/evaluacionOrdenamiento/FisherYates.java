package evaluacionOrdenamiento;

import java.util.ArrayList;
import java.util.Random;

public class FisherYates<T extends Comparable<T>> {
	public void shuffle(ArrayList<T> array) {
		int n = array.size();

		Random random = new Random();

		for (int i = 0; i < array.size(); i++) {
			int randomValue = i + random.nextInt(n - i);

			T randomElement = array.get(randomValue);

			array.set(randomValue, array.get(i));
			array.set(i, randomElement);
		}
	}
}