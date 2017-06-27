package sortingAlgorithms;

public class HybridSort
{
	public static void quicksort(int[] array, int links, int rechts)
	{
		int left = links;
		int right = rechts;
		int comp = array[(links + rechts) / 2];

		do
		{
			while (array[left] < comp) // Für Umkehrung Relationsoperator ändern
				left++;
			while (array[right] > comp) // Für Umkehrung Relationsoperator ändern
				right--;

			if (left <= right)
			{
				int help = array[left];
				array[left] = array[right];
				array[right] = help;

				left++;
				right--;
			}
		}
		while (left <= right);

		if (links < right)
			quicksort(array, links, right);
		if (rechts > left)
			quicksort(array, left, rechts);
	}

	public static void hybridsort(int[] array, int links, int rechts)
	{
		int left = links;
		int right = rechts;
		int comp = array[(links + rechts) / 2];

		do
		{
			while (array[left] < comp)
				left++;
			while (array[right] > comp)
				right--;

			if (left <= right)
			{
				int help = array[left];
				array[left] = array[right];
				array[right] = help;

				left++;
				right--;
			}
		}
		while (left <= right);

		if (links < right)
		{
			if ((right - links + 1) > 4)
				hybridsort(array, links, right);
			else
				BasicSort.bubblesort(array, links, right);
		}
		if (rechts > left)
		{
			if ((rechts - left + 1) > 4)
				hybridsort(array, left, rechts);
			else
				BasicSort.bubblesort(array, left, rechts);
		}
	}
}