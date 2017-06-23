package sortingAlgorithms;

public class BasicSort
{
	// Insertionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	// Aufbau Array: [ZIEL|QUELL]
	public static void insertionsort(int[] array, int links, int rechts)
	{
		boolean orderRev = false; // Um Sortierreihenfolge umzukehren, bitte auf true setzen ("absteigend") !checkArray() in Main verhindert Berechnung bei true!

		for (int i = links + 1; i <= rechts; i++) // Erstes Element ist immer sortiert
		{
			int elementQuell = array[i];
			int zielEnde = i - 1;

			while (zielEnde >= 0 && (orderRev ? (array[zielEnde] < elementQuell) : (array[zielEnde] > elementQuell)))
			// Wenn letztes Element im sortierten Teil größer (bzw. kleiner) als Element im Quellteil...
			{
				array[zielEnde + 1] = array[zielEnde]; // Durchlaufen nach links, bis Stelle gefunden wird, wo Quellelement eingesetzt werden soll
				zielEnde--;
			}
			array[zielEnde + 1] = elementQuell; // Setze einzusortierendes Element an richtige Stelle
		}
	}

	// Selectionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	public static void selectionsort(int[] array, int links, int rechts)
	{
		boolean orderRev = false; // Zum Ändern der Sortierreihenfolge Variable umsetzen. !checkArray() in Main verhindert Berechnung bei true!

		for (int i = links; i < rechts; i++) // letztes Element muss an richtiger Stelle stehen
		{
			int minOrMaxIndex = i; // Erstes Element wird als minimal bzw. maximal angenommen.

			for (int j = i + 1; j <= rechts; j++) // Durchsuche unsortierten Teil nach Minimum oder Maximum
			{
				if (orderRev ? (array[j] > array[minOrMaxIndex]) : (array[j] < array[minOrMaxIndex]))
					minOrMaxIndex = j; // Setze Index auf das neue Minimum oder Maximum.
			}

			int hilf = array[minOrMaxIndex];
			array[minOrMaxIndex] = array[i];
			array[i] = hilf; // Tausche das Element mit dem gefundenen Index nach vorne.
		}
	}

	// Bubblesort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich Index rechts
	public static void bubblesort(int[] array, int links, int rechts)
	{
		for (int i = rechts + 1; i > 1; i--) // verringert Grenze fürs Bubblen (da sortierter Teil rechts wächst)
		{
			for (int j = links; j < (i - 1); j++) // durchläuft noch nicht sortierten Teil und tauscht Nachbarn, wenn nötig
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