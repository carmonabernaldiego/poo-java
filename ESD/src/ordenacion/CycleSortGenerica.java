package ordenacion;

public class CycleSortGenerica<T extends Comparable<T>> {
	public void cycleSort(T arr[]) {
		int writes = 0;

		for (int cycle_start = 0; cycle_start <= arr.length - 2; cycle_start++) {
			T item = arr[cycle_start];
			int pos = cycle_start;

			for (int i = cycle_start + 1; i < arr.length; i++) {
				if (arr[i].compareTo(item) < 0) {
					pos++;
				}
			}

			if (pos == cycle_start) {
				continue;
			}

			while (item == arr[pos]) {
				pos += 1;
			}

			if (pos != cycle_start) {
				T temp = item;
				item = arr[pos];
				arr[pos] = temp;
				writes++;
			}

			while (pos != cycle_start) {
				pos = cycle_start;

				for (int i = cycle_start + 1; i < arr.length; i++) {
					if (arr[i].compareTo(item) < 0) {
						pos += 1;
					}
				}

				while (item == arr[pos]) {
					pos += 1;
				}

				if (item != arr[pos]) {
					T temp = item;
					item = arr[pos];
					arr[pos] = temp;
					writes++;
				}
			}
		}
	}
}