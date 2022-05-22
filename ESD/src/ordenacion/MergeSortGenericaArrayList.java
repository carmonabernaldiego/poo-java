package ordenacion;

import java.util.ArrayList;

public class MergeSortGenericaArrayList<T extends Comparable<T>> {
	public void mergeSort(ArrayList<T> a, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		ArrayList<T> l = new ArrayList<>();
		for(int i = 0; i < mid; i++) {
			l.add(a.get(i));
		}
		ArrayList<T> r = new ArrayList<>(n - mid);
		for(int i = 0; i < n - mid; i++) {
			r.add(a.get(i));
		}

		for (int i = 0; i < mid; i++) {
			l.set(i, a.get(i));
		}

		for (int i = mid; i < n; i++) {
			r.set(i - mid, a.get(i));
		}

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public void merge(ArrayList<T> a, ArrayList<T> l, ArrayList<T> r, int left, int right) {
		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {
			if (l.get(i).compareTo(r.get(j)) <= 0) {
				a.set(k++, l.get(i++));
			}
			else {
				a.set(k++, r.get(j++));
			}
		}

		while (i < left) {
			a.set(k++, l.get(i++));
		}

		while (j < right) {
			a.set(k++, r.get(j++));
		}
	}
}