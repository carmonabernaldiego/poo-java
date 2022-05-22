package ordenacion;

public class MergeSortGenerica<T extends Comparable<T>> {
	public void mergeSort(T[] a, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		T[] l = (T[]) new Comparable[mid];
		T[] r = (T[]) new Comparable[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}

		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public void merge(T[] a, T[] l, T[] r, int left, int right) {
		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {
			if (l[i].compareTo(r[j]) <= 0) {
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}

		while (i < left) {
			a[k++] = l[i++];
		}

		while (j < right) {
			a[k++] = r[j++];
		}
	}
}