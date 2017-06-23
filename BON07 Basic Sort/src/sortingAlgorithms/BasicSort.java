package sortingAlgorithms;

public class BasicSort
{
	// Insertionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	// Aufbau Array: [ZIEL|QUELL]
	public static void insertionsort(int[] array, int links, int rechts)
	{
		boolean orderRev = false; // Um Sortierreihenfolge umzukehren, bitte auf true setzen ("absteigend") !checkArray() in Main verhindert Berechnung bei true!

		for (int i = links + 1; i <= rechts; i++)
		{
			int elementQuell = array[i];
			int zielEnde = i - 1;

			while (zielEnde >= 0 && (orderRev ? (array[zielEnde] < elementQuell) : (array[zielEnde] > elementQuell)))
			{
				array[zielEnde + 1] = array[zielEnde]; //Durchlaufen nach links
				zielEnde--;
			}
			array[zielEnde + 1] = elementQuell;
		}
	}

	// Selectionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	public static void selectionsort(int[] array, int links, int rechts)
	{
		boolean orderRev = false; // Zum Ändern der Sortierreihenfolge Variable umsetzen. !checkArray() in Main verhindert Berechnung bei true!

		for (int i = links; i < rechts; i++)
		{
			int minOrMaxIndex = i;

			for (int j = i + 1; j <= rechts; j++)
			{
				if (orderRev ? (array[j] > array[minOrMaxIndex]) : (array[j] < array[minOrMaxIndex]))
					minOrMaxIndex = j;
			}

			int hilf = array[minOrMaxIndex];
			array[minOrMaxIndex] = array[i];
			array[i] = hilf;
		}
	}

	// Bubblesort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	public static void bubblesort(int[] array, int links, int rechts)
	{
		for (int i = rechts + 1; i > 1; i--)
		{
			for (int j = links; j < (i - 1); j++)
			{
				if (array[j] > array[j + 1]) // Für Umkehrung Relationsoperator ändern
				{
					int help = array[j];
					array[j] = array[j + 1];
					array[j + 1] = help;
				}
			}
		}
	}
}