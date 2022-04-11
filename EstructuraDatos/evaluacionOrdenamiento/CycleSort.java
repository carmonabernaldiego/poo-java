package evaluacionOrdenamiento;

import java.util.ArrayList;

public class CycleSort<T extends Comparable<T>> {
	public void cycleSort(ArrayList<T> arr) {
		int writes = 0;

		for (int cycle_start = 0; cycle_start <= arr.size() - 2; cycle_start++) {
			T item = arr.get(cycle_start);
			int pos = cycle_start;

			for (int i = cycle_start + 1; i < arr.size(); i++) {
				if (arr.get(i).compareTo(item) < 0) {
					pos++;
				}
			}

			if (pos == cycle_start) {
				continue;
			}

			while (item == arr.get(pos)) {
				pos += 1;
			}

			if (pos != cycle_start) {
				T temp = item;
				item = arr.get(pos);
				arr.set(pos, temp);
				writes++;
			}

			while (pos != cycle_start) {
				pos = cycle_start;

				for (int i = cycle_start + 1; i < arr.size(); i++) {
					if (arr.get(i).compareTo(item) < 0) {
						pos += 1;
					}
				}

				while (item == arr.get(pos)) {
					pos += 1;
				}

				if (item != arr.get(pos)) {
					T temp = item;
					item = arr.get(pos);
					arr.set(pos, temp);
					writes++;
				}
			}
		}
	}
}